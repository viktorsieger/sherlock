package se.umu.cs.githubtypes;

public class SubmitPullRequestReviewPayload {

    private String clientMutationId;
    private PullRequestReview pullRequestReview;

    public SubmitPullRequestReviewPayload() {
    }

    public SubmitPullRequestReviewPayload(String clientMutationId, PullRequestReview pullRequestReview) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReview = pullRequestReview;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReview getPullRequestReview() {
        return pullRequestReview;
    }
    public void setPullRequestReview(PullRequestReview pullRequestReview) {
        this.pullRequestReview = pullRequestReview;
    }

}