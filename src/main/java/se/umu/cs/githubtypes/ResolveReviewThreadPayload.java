package se.umu.cs.githubtypes;

public class ResolveReviewThreadPayload {

    private String clientMutationId;
    private PullRequestReviewThread thread;

    public ResolveReviewThreadPayload() {
    }

    public ResolveReviewThreadPayload(String clientMutationId, PullRequestReviewThread thread) {
        this.clientMutationId = clientMutationId;
        this.thread = thread;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequestReviewThread getThread() {
        return thread;
    }
    public void setThread(PullRequestReviewThread thread) {
        this.thread = thread;
    }

}