package com.mywings.coderepackging;

public class ResultStatitics {

    private boolean directorySame;
    private boolean countSame;
    private boolean lineSame;
    private int sameFileCount;
    private int samePackageCount;
    private int sameImportCount;
    private int sameClassCount;
    private int totalCount;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isDirectorySame() {
        return directorySame;
    }

    public void setDirectorySame(boolean directorySame) {
        this.directorySame = directorySame;
    }

    public boolean isCountSame() {
        return countSame;
    }

    public void setCountSame(boolean countSame) {
        this.countSame = countSame;
    }

    public boolean isLineSame() {
        return lineSame;
    }

    public void setLineSame(boolean lineSame) {
        this.lineSame = lineSame;
    }

    public int getSameFileCount() {
        return sameFileCount;
    }

    public void setSameFileCount(int sameFileCount) {
        this.sameFileCount = sameFileCount;
    }

    public int getSamePackageCount() {
        return samePackageCount;
    }

    public void setSamePackageCount(int samePackageCount) {
        this.samePackageCount = samePackageCount;
    }

    public int getSameImportCount() {
        return sameImportCount;
    }

    public void setSameImportCount(int sameImportCount) {
        this.sameImportCount = sameImportCount;
    }

    public int getSameClassCount() {
        return sameClassCount;
    }

    public void setSameClassCount(int sameClassCount) {
        this.sameClassCount = sameClassCount;
    }
}
