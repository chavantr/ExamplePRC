package com.mywings.coderepackging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String appName = "Show Java";
    String packageName = "com.njlabs.showjava";
    private Button btnCheckCode;
    private Button btnDecompile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCheckCode = findViewById(R.id.btnCheckCode);
        btnDecompile = findViewById(R.id.btnDecompile);
        btnCheckCode.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, JavaShowActivity.class);
            startActivity(intent);
        });
        btnDecompile.setOnClickListener(view -> {
            openApp(MainActivity.this, appName, packageName);
        });
    }

    public void openApp(Context context, String appName, String packageName) {
        if (isAppInstalled(context, packageName))
            if (isAppEnabled(context, packageName))
                startActivity(context.getPackageManager().getLaunchIntentForPackage(packageName));
            else
                Toast.makeText(context, appName + " app is not enabled.", Toast.LENGTH_SHORT).show();
        else Toast.makeText(context, appName + " app is not installed.", Toast.LENGTH_SHORT).show();
    }

    private boolean isAppInstalled(Context context, String packageName) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException ignored) {
        }
        return false;
    }

    private boolean isAppEnabled(Context context, String packageName) {
        boolean appStatus = false;
        try {
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(packageName, 0);
            if (ai != null) {
                appStatus = ai.enabled;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return appStatus;
    }
}
