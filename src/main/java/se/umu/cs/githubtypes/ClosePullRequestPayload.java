package se.umu.cs.githubtypes;

public class ClosePullRequestPayload {

    private String clientMutationId;
    private PullRequest pullRequest;

    public ClosePullRequestPayload() {
    }

    public ClosePullRequestPayload(String clientMutationId, PullRequest pullRequest) {
        this.clientMutationId = clientMutationId;
        this.pullRequest = pullRequest;
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

}