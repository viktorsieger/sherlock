package se.umu.cs.graphql;

import java.util.*;

public class AddPullRequestReviewCommentPayload {

    private String clientMutationId;
    private PullRequestReviewComment comment;
    private PullRequestReviewCommentEdge commentEdge;

    public AddPullRequestReviewCommentPayload() {
    }

    public AddPullRequestReviewCommentPayload(String clientMutationId, PullRequestReviewComment comment, PullRequestReviewCommentEdge commentEdge) {
        this.clientMutationId = clientMutationId;
        this.comment = comment;
        this.commentEdge = commentEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewComment getComment() {
        return comment;
    }
    public void setComment(PullRequestReviewComment comment) {
        this.comment = comment;
    }

    public PullRequestReviewCommentEdge getCommentEdge() {
        return commentEdge;
    }
    public void setCommentEdge(PullRequestReviewCommentEdge commentEdge) {
        this.commentEdge = commentEdge;
    }

}