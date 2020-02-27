package se.umu.cs.graphql;

import java.util.*;

public class UnresolveReviewThreadPayload {

    private String clientMutationId;
    private PullRequestReviewThread thread;

    public UnresolveReviewThreadPayload() {
    }

    public UnresolveReviewThreadPayload(String clientMutationId, PullRequestReviewThread thread) {
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