package se.umu.cs.githubtypes;

public class AddPullRequestReviewPayload {

    private String clientMutationId;
    private PullRequestReview pullRequestReview;
    private PullRequestReviewEdge reviewEdge;

    public AddPullRequestReviewPayload() {
    }

    public AddPullRequestReviewPayload(String clientMutationId, PullRequestReview pullRequestReview, PullRequestReviewEdge reviewEdge) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReview = pullRequestReview;
        this.reviewEdge = reviewEdge;
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

    public PullRequestReviewEdge getReviewEdge() {
        return reviewEdge;
    }
    public void setReviewEdge(PullRequestReviewEdge reviewEdge) {
        this.reviewEdge = reviewEdge;
    }

}