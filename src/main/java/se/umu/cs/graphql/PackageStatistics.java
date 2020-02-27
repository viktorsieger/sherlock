package se.umu.cs.graphql;

import java.util.*;

public class PackageStatistics {

    private Integer downloadsTotalCount;

    public PackageStatistics() {
    }

    public PackageStatistics(Integer downloadsTotalCount) {
        this.downloadsTotalCount = downloadsTotalCount;
    }

    public Integer getDownloadsTotalCount() {
        return downloadsTotalCount;
    }
    public void setDownloadsTotalCount(Integer downloadsTotalCount) {
        this.downloadsTotalCount = downloadsTotalCount;
    }

}