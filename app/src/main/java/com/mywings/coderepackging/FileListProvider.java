package com.mywings.coderepackging;

import android.net.Uri;

import java.util.HashMap;
import java.util.Map;

public class FileListProvider {


    public static FileListProvider getInstance() {
        return FileListProviderHelper.INSTANCE;
    }

    private FileListProvider() {
    }

    public Map<String, Uri> placeFirstFiles = new HashMap<>();

    public Map<String, Uri> placeSecondFiles = new HashMap<>();


    private static class FileListProviderHelper {
        private static final FileListProvider INSTANCE = new FileListProvider();
    }


}
