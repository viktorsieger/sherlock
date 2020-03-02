package se.umu.cs.githubtypes;

public class MarkPullRequestReadyForReviewInput {

    private String clientMutationId;
    private String pullRequestId;

    public MarkPullRequestReadyForReviewInput() {
    }

    public MarkPullRequestReadyForReviewInput(String clientMutationId, String pullRequestId) {
        this.clientMutationId = clientMutationId;
        this.pullRequestId = pullRequestId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

}