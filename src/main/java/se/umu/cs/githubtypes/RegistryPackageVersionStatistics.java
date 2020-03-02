package se.umu.cs.githubtypes;

public class RegistryPackageVersionStatistics {

    private Integer downloadsThisMonth;
    private Integer downloadsThisWeek;
    private Integer downloadsThisYear;
    private Integer downloadsToday;
    private Integer downloadsTotalCount;

    public RegistryPackageVersionStatistics() {
    }

    public RegistryPackageVersionStatistics(Integer downloadsThisMonth, Integer downloadsThisWeek, Integer downloadsThisYear, Integer downloadsToday, Integer downloadsTotalCount) {
        this.downloadsThisMonth = downloadsThisMonth;
        this.downloadsThisWeek = downloadsThisWeek;
        this.downloadsThisYear = downloadsThisYear;
        this.downloadsToday = downloadsToday;
        this.downloadsTotalCount = downloadsTotalCount;
    }

    public Integer getDownloadsThisMonth() {
        return downloadsThisMonth;
    }
    public void setDownloadsThisMonth(Integer downloadsThisMonth) {
        this.downloadsThisMonth = downloadsThisMonth;
    }

    public Integer getDownloadsThisWeek() {
        return downloadsThisWeek;
    }
    public void setDownloadsThisWeek(Integer downloadsThisWeek) {
        this.downloadsThisWeek = downloadsThisWeek;
    }

    public Integer getDownloadsThisYear() {
        return downloadsThisYear;
    }
    public void setDownloadsThisYear(Integer downloadsThisYear) {
        this.downloadsThisYear = downloadsThisYear;
    }

    public Integer getDownloadsToday() {
        return downloadsToday;
    }
    public void setDownloadsToday(Integer downloadsToday) {
        this.downloadsToday = downloadsToday;
    }

    public Integer getDownloadsTotalCount() {
        return downloadsTotalCount;
    }
    public void setDownloadsTotalCount(Integer downloadsTotalCount) {
        this.downloadsTotalCount = downloadsTotalCount;
    }

}