package se.umu.cs.graphql;

import java.util.*;

public class CheckSuiteAutoTriggerPreference {

    private String appId;
    private Boolean setting;

    public CheckSuiteAutoTriggerPreference() {
    }

    public CheckSuiteAutoTriggerPreference(String appId, Boolean setting) {
        this.appId = appId;
        this.setting = setting;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Boolean getSetting() {
        return setting;
    }
    public void setSetting(Boolean setting) {
        this.setting = setting;
    }

}