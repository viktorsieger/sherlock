package se.umu.cs.githubtypes;

public class CheckSuiteFilter {

    private Integer appId;
    private String checkName;

    public CheckSuiteFilter() {
    }

    public CheckSuiteFilter(Integer appId, String checkName) {
        this.appId = appId;
        this.checkName = checkName;
    }

    public Integer getAppId() {
        return appId;
    }
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getCheckName() {
        return checkName;
    }
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

}