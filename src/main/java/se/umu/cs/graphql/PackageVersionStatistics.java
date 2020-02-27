package se.umu.cs.graphql;

import java.util.*;

public class PackageVersionStatistics {

    private Integer downloadsTotalCount;

    public PackageVersionStatistics() {
    }

    public PackageVersionStatistics(Integer downloadsTotalCount) {
        this.downloadsTotalCount = downloadsTotalCount;
    }

    public Integer getDownloadsTotalCount() {
        return downloadsTotalCount;
    }
    public void setDownloadsTotalCount(Integer downloadsTotalCount) {
        this.downloadsTotalCount = downloadsTotalCount;
    }

}