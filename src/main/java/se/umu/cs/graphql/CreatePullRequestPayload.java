package se.umu.cs.graphql;

import java.util.*;

public class CreatePullRequestPayload {

    private String clientMutationId;
    private PullRequest pullRequest;

    public CreatePullRequestPayload() {
    }

    public CreatePullRequestPayload(String clientMutationId, PullRequest pullRequest) {
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