package com.mywings.coderepackging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.provider.DocumentFile;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;

public class JavaShowActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_PLACE_1 = 10090;
    public static final int REQUEST_CODE_PLACE_2 = 1000;
    private Button btnPlace1;
    private Button btnPlace2;
    private String place1;
    private String place2;
    private Button btnHash;
    private Button btnSimilar;
    private Button btnCFG;
    private double weight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_show);
        btnPlace1 = findViewById(R.id.btnBrowse1);
        btnPlace2 = findViewById(R.id.btnBrowse2);
        btnHash = findViewById(R.id.btnHash);
        btnSimilar = findViewById(R.id.btnSimilar);
        btnCFG = findViewById(R.id.btnCFG);

        btnPlace1.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);
            startActivityForResult(Intent.createChooser(intent, "Choose directory"), REQUEST_CODE_PLACE_1);

        });

        btnPlace2.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);

            startActivityForResult(Intent.createChooser(intent, "Choose directory"), REQUEST_CODE_PLACE_2);
        });

        btnHash.setOnClickListener(v -> {

            if (null != place1 && place2 != null) {
                if (place1.equalsIgnoreCase(place2)) {
                    Toast.makeText(JavaShowActivity.this, "No difference found", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(JavaShowActivity.this, "Difference found", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(JavaShowActivity.this, "No difference found", Toast.LENGTH_LONG).show();
            }

        });

        btnSimilar.setOnClickListener((v) -> {

            CosineSimilarity cs = new CosineSimilarity();

            weight = cs.GetSimilarity(place1, place2);

            if (weight > 0) {
                Toast.makeText(JavaShowActivity.this, "Similarity found", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(JavaShowActivity.this, "No similarity found", Toast.LENGTH_LONG).show();
            }

        });

        btnCFG.setOnClickListener((v) -> {

            if (null != FileListProvider.getInstance().placeFirstFiles && FileListProvider.getInstance().placeSecondFiles != null && FileListProvider.getInstance().placeFirstFiles.size() > 0 && FileListProvider.getInstance().placeSecondFiles.size() > 0) {

                Intent intent = new Intent(JavaShowActivity.this, CFGProcessingActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(JavaShowActivity.this, "Select both files source code", Toast.LENGTH_LONG).show();
            }

        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CODE_PLACE_1) {
                if (null != FileListProvider.getInstance().placeFirstFiles) {
                    FileListProvider.getInstance().placeFirstFiles.clear();
                }
                Uri filePath = data.getData();
                DocumentFile documentFile = DocumentFile.fromTreeUri(this, filePath);
                for (DocumentFile file : documentFile.listFiles()) {
                    if (file.isDirectory()) {
                        for (DocumentFile innerFile : file.listFiles()) {
                            FileListProvider.getInstance().placeFirstFiles.put(innerFile.getName(), innerFile.getUri());
                        }
                    } else if (file.isFile()) {
                        FileListProvider.getInstance().placeFirstFiles.put(file.getName(), file.getUri());
                    }
                }
            } else if (requestCode == REQUEST_CODE_PLACE_2) {

                if (null != FileListProvider.getInstance().placeSecondFiles) {
                    FileListProvider.getInstance().placeSecondFiles.clear();
                }

                Uri filePath = data.getData();
                DocumentFile documentFile = DocumentFile.fromTreeUri(this, filePath);
                for (DocumentFile file : documentFile.listFiles()) {
                    if (file.isDirectory()) {
                        for (DocumentFile innerFile : file.listFiles()) {
                            FileListProvider.getInstance().placeSecondFiles.put(innerFile.getName(), innerFile.getUri());
                        }
                    } else if (file.isFile()) {
                        FileListProvider.getInstance().placeSecondFiles.put(file.getName(), file.getUri());
                    }
                }

            }
        }
    }
}
