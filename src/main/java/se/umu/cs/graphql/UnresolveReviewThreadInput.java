package se.umu.cs.graphql;

import java.util.*;

public class UnresolveReviewThreadInput {

    private String clientMutationId;
    private String threadId;

    public UnresolveReviewThreadInput() {
    }

    public UnresolveReviewThreadInput(String clientMutationId, String threadId) {
        this.clientMutationId = clientMutationId;
        this.threadId = threadId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getThreadId() {
        return threadId;
    }
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

}