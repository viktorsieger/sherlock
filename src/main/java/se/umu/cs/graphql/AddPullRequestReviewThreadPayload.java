package se.umu.cs.graphql;

import java.util.*;

public class AddPullRequestReviewThreadPayload {

    private String clientMutationId;
    private PullRequestReviewThread thread;

    public AddPullRequestReviewThreadPayload() {
    }

    public AddPullRequestReviewThreadPayload(String clientMutationId, PullRequestReviewThread thread) {
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