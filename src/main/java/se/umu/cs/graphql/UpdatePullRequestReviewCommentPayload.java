package se.umu.cs.graphql;

import java.util.*;

public class UpdatePullRequestReviewCommentPayload {

    private String clientMutationId;
    private PullRequestReviewComment pullRequestReviewComment;

    public UpdatePullRequestReviewCommentPayload() {
    }

    public UpdatePullRequestReviewCommentPayload(String clientMutationId, PullRequestReviewComment pullRequestReviewComment) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewComment = pullRequestReviewComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewComment getPullRequestReviewComment() {
        return pullRequestReviewComment;
    }
    public void setPullRequestReviewComment(PullRequestReviewComment pullRequestReviewComment) {
        this.pullRequestReviewComment = pullRequestReviewComment;
    }

}