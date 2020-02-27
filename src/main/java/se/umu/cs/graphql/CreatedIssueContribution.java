package se.umu.cs.graphql;

import java.util.*;

public class CreatedIssueContribution implements CreatedIssueOrRestrictedContribution, Contribution{

    private Boolean isRestricted;
    private Issue issue;
    private String occurredAt;
    private String resourcePath;
    private String url;
    private User user;

    public CreatedIssueContribution() {
    }

    public CreatedIssueContribution(Boolean isRestricted, Issue issue, String occurredAt, String resourcePath, String url, User user) {
        this.isRestricted = isRestricted;
        this.issue = issue;
        this.occurredAt = occurredAt;
        this.resourcePath = resourcePath;
        this.url = url;
        this.user = user;
    }

    public Boolean getIsRestricted() {
        return isRestricted;
    }
    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public Issue getIssue() {
        return issue;
    }
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public String getOccurredAt() {
        return occurredAt;
    }
    public void setOccurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}