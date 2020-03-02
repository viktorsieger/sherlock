package se.umu.cs.githubtypes;

public class DismissPullRequestReviewInput {

    private String clientMutationId;
    private String message;
    private String pullRequestReviewId;

    public DismissPullRequestReviewInput() {
    }

    public DismissPullRequestReviewInput(String clientMutationId, String message, String pullRequestReviewId) {
        this.clientMutationId = clientMutationId;
        this.message = message;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }
    public void setPullRequestReviewId(String pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

}