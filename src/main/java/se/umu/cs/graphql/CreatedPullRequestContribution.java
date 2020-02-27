package se.umu.cs.graphql;

import java.util.*;

public class CreatedPullRequestContribution implements CreatedPullRequestOrRestrictedContribution, Contribution{

    private Boolean isRestricted;
    private String occurredAt;
    private PullRequest pullRequest;
    private String resourcePath;
    private String url;
    private User user;

    public CreatedPullRequestContribution() {
    }

    public CreatedPullRequestContribution(Boolean isRestricted, String occurredAt, PullRequest pullRequest, String resourcePath, String url, User user) {
        this.isRestricted = isRestricted;
        this.occurredAt = occurredAt;
        this.pullRequest = pullRequest;
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

    public String getOccurredAt() {
        return occurredAt;
    }
    public void setOccurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
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