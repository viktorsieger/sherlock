package se.umu.cs.graphql;

import java.util.*;

public class UpdatePullRequestReviewInput {

    private String body;
    private String clientMutationId;
    private String pullRequestReviewId;

    public UpdatePullRequestReviewInput() {
    }

    public UpdatePullRequestReviewInput(String body, String clientMutationId, String pullRequestReviewId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
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

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }
    public void setPullRequestReviewId(String pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

}