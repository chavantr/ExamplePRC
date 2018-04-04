package com.mywings.coderepackging;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
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
    private double weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_show);
        btnPlace1 = findViewById(R.id.btnBrowse1);
        btnPlace2 = findViewById(R.id.btnBrowse2);
        btnHash = findViewById(R.id.btnHash);
        btnSimilar = findViewById(R.id.btnSimilar);

        btnPlace1.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");
            intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
            startActivityForResult(intent, REQUEST_CODE_PLACE_1);
        });

        btnPlace2.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");
            intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
            startActivityForResult(intent, REQUEST_CODE_PLACE_2);

        });

        btnHash.setOnClickListener(v -> {

            if (null != place1 && place2 != null) {
                if (place1.equalsIgnoreCase(place2)) {
                    Toast.makeText(JavaShowActivity.this, "No difference found", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(JavaShowActivity.this, "Difference found", Toast.LENGTH_LONG).show();
                }
            }else {
                Toast.makeText(JavaShowActivity.this, "No difference found", Toast.LENGTH_LONG).show();
            }

        });

        btnSimilar.setOnClickListener((v) -> {

            CosineSimilarity cs = new CosineSimilarity();
            weight = cs.GetSimilarity(place1, place2);

            if (weight > 0) {
                Toast.makeText(JavaShowActivity.this, "Similiarity found", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(JavaShowActivity.this, "No similiarity found", Toast.LENGTH_LONG).show();
            }

        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CODE_PLACE_1) {
                try {
                    String filePath = data.getData().getPath();
                    File file = new File(filePath);
                    place1 = HashGeneratorUtils.generateSHA1(file);
                } catch (HashGenerationException e) {
                    e.printStackTrace();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (requestCode == REQUEST_CODE_PLACE_2) {
                try {
                    String filePath = data.getData().getPath();
                    File file = new File(filePath);
                    place2 = HashGeneratorUtils.generateSHA1(file);
                } catch (HashGenerationException e) {
                    e.printStackTrace();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
