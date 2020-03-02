package se.umu.cs.githubtypes;

public class RequestReviewsPayload {

    private String clientMutationId;
    private PullRequest pullRequest;
    private UserEdge requestedReviewersEdge;

    public RequestReviewsPayload() {
    }

    public RequestReviewsPayload(String clientMutationId, PullRequest pullRequest, UserEdge requestedReviewersEdge) {
        this.clientMutationId = clientMutationId;
        this.pullRequest = pullRequest;
        this.requestedReviewersEdge = requestedReviewersEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public UserEdge getRequestedReviewersEdge() {
        return requestedReviewersEdge;
    }
    public void setRequestedReviewersEdge(UserEdge requestedReviewersEdge) {
        this.requestedReviewersEdge = requestedReviewersEdge;
    }

}