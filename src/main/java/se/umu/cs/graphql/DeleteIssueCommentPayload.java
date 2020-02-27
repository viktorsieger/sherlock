package se.umu.cs.graphql;

import java.util.*;

public class DeleteIssueCommentPayload {

    private String clientMutationId;

    public DeleteIssueCommentPayload() {
    }

    public DeleteIssueCommentPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}