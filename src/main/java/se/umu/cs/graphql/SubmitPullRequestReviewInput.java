package se.umu.cs.graphql;

import java.util.*;

public class SubmitPullRequestReviewInput {

    private String body;
    private String clientMutationId;
    private PullRequestReviewEvent event;
    private String pullRequestId;
    private String pullRequestReviewId;

    public SubmitPullRequestReviewInput() {
    }

    public SubmitPullRequestReviewInput(String body, String clientMutationId, PullRequestReviewEvent event, String pullRequestId, String pullRequestReviewId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.event = event;
        this.pullRequestId = pullRequestId;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewEvent getEvent() {
        return event;
    }
    public void setEvent(PullRequestReviewEvent event) {
        this.event = event;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }
    public void setPullRequestReviewId(String pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

}