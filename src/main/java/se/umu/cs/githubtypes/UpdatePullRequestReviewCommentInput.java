package se.umu.cs.githubtypes;

public class UpdatePullRequestReviewCommentInput {

    private String body;
    private String clientMutationId;
    private String pullRequestReviewCommentId;

    public UpdatePullRequestReviewCommentInput() {
    }

    public UpdatePullRequestReviewCommentInput(String body, String clientMutationId, String pullRequestReviewCommentId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewCommentId = pullRequestReviewCommentId;
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

    public String getPullRequestReviewCommentId() {
        return pullRequestReviewCommentId;
    }
    public void setPullRequestReviewCommentId(String pullRequestReviewCommentId) {
        this.pullRequestReviewCommentId = pullRequestReviewCommentId;
    }

}