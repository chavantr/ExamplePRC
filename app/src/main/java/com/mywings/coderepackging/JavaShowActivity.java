package com.mywings.coderepackging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class JavaShowActivity extends AppCompatActivity {

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
            startActivityForResult(intent,10090);

        });
        btnPlace2.setOnClickListener(v -> {

            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");
            startActivityForResult(intent,1000);

        });
    }
}
