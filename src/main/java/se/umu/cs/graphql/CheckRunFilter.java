package se.umu.cs.graphql;

import java.util.*;

public class CheckRunFilter {

    private Integer appId;
    private String checkName;
    private CheckRunType checkType;
    private CheckStatusState status;

    public CheckRunFilter() {
    }

    public CheckRunFilter(Integer appId, String checkName, CheckRunType checkType, CheckStatusState status) {
        this.appId = appId;
        this.checkName = checkName;
        this.checkType = checkType;
        this.status = status;
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

    public CheckRunType getCheckType() {
        return checkType;
    }
    public void setCheckType(CheckRunType checkType) {
        this.checkType = checkType;
    }

    public CheckStatusState getStatus() {
        return status;
    }
    public void setStatus(CheckStatusState status) {
        this.status = status;
    }

}