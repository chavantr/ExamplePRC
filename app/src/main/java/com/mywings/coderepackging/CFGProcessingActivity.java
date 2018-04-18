package com.mywings.coderepackging;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

public class CFGProcessingActivity extends AppCompatActivity {


    private TextView lblHowPercentage;
    private ProgressBar pbPleaseWait;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfgprocessing);

        lblHowPercentage = findViewById(R.id.lblHowPercent);
        pbPleaseWait = findViewById(R.id.pbPleaseWait);

        if (FileListProvider.getInstance().placeFirstFiles.size() == FileListProvider.getInstance().placeSecondFiles.size()) {
            Iterator iterator = FileListProvider.getInstance().placeFirstFiles.entrySet().iterator();
            ResultStatitics resultStatitics = new ResultStatitics();
            resultStatitics.setTotalCount(FileListProvider.getInstance().placeSecondFiles.size());
            int fileCount = 0;
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next();
                if (FileListProvider.getInstance().placeSecondFiles.containsKey(pair.getKey())) {
                    Uri uriFirst = (Uri) pair.getValue();
                    Uri uriSecond = FileListProvider.getInstance().placeSecondFiles.get(pair.getKey());
                    try {
                        String strFirst = readTextFromUri(uriFirst);
                        String strSecond = readTextFromUri(uriSecond);
                        if (strFirst.equalsIgnoreCase(strSecond)) {
                            fileCount += 1;
                            resultStatitics.setSameFileCount(fileCount);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (resultStatitics.getSameFileCount() == FileListProvider.getInstance().placeFirstFiles.size()) {
                lblHowPercentage.setText("100% similarity found.");
            } else {
                float percentage = ((resultStatitics.getSameFileCount() * 100) / FileListProvider.getInstance().placeFirstFiles.size());
                lblHowPercentage.setText("" + percentage + "% difference found.");
            }
        } else {
            int firstSize = FileListProvider.getInstance().placeFirstFiles.size();
            int secondSize = FileListProvider.getInstance().placeSecondFiles.size();
            if (firstSize > secondSize) {
                float percentage = ((secondSize * 100) / firstSize);
                lblHowPercentage.setText("No Similarity found\n" + percentage + "% code different");
            } else if (firstSize < secondSize) {
                float percentage = ((firstSize * 100) / secondSize);
                lblHowPercentage.setText("No Similarity found\n" + percentage + "% code different");
            }
        }
        pbPleaseWait.setVisibility(View.GONE);
    }

    private String readTextFromUri(Uri uri) throws IOException {
        InputStream inputStream = getContentResolver().openInputStream(uri);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

}
