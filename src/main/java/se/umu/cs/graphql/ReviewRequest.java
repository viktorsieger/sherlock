package se.umu.cs.graphql;

import java.util.*;

public class ReviewRequest implements Node{

    private Integer databaseId;
    private String id;
    private PullRequest pullRequest;
    private RequestedReviewer requestedReviewer;

    public ReviewRequest() {
    }

    public ReviewRequest(Integer databaseId, String id, PullRequest pullRequest, RequestedReviewer requestedReviewer) {
        this.databaseId = databaseId;
        this.id = id;
        this.pullRequest = pullRequest;
        this.requestedReviewer = requestedReviewer;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public RequestedReviewer getRequestedReviewer() {
        return requestedReviewer;
    }
    public void setRequestedReviewer(RequestedReviewer requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

}