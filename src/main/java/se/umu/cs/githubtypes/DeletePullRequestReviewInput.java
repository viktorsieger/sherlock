package se.umu.cs.githubtypes;

public class DeletePullRequestReviewInput {

    private String clientMutationId;
    private String pullRequestReviewId;

    public DeletePullRequestReviewInput() {
    }

    public DeletePullRequestReviewInput(String clientMutationId, String pullRequestReviewId) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewId = pullRequestReviewId;
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