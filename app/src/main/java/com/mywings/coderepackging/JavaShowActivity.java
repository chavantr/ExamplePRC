package com.mywings.coderepackging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class JavaShowActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_PLACE_1 = 10090;
    public static final int REQUEST_CODE_PLACE_2 = 1000;
    private Button btnPlace1;
    private Button btnPlace2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_show);
        btnPlace1 = findViewById(R.id.btnBrowse1);
        btnPlace2 = findViewById(R.id.btnBrowse2);
        btnPlace1.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");
            startActivityForResult(intent, REQUEST_CODE_PLACE_1);
        });
        btnPlace2.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");
            startActivityForResult(intent, REQUEST_CODE_PLACE_2);

        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CODE_PLACE_1) {

            } else if (requestCode == REQUEST_CODE_PLACE_2) {

            }
        }
    }
}
