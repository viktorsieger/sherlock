package se.umu.cs.graphql;

import java.util.*;

public class PullRequestRevisionMarker implements PullRequestTimelineItems{

    private String createdAt;
    private Commit lastSeenCommit;
    private PullRequest pullRequest;

    public PullRequestRevisionMarker() {
    }

    public PullRequestRevisionMarker(String createdAt, Commit lastSeenCommit, PullRequest pullRequest) {
        this.createdAt = createdAt;
        this.lastSeenCommit = lastSeenCommit;
        this.pullRequest = pullRequest;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Commit getLastSeenCommit() {
        return lastSeenCommit;
    }
    public void setLastSeenCommit(Commit lastSeenCommit) {
        this.lastSeenCommit = lastSeenCommit;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

}