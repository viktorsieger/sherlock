package se.umu.cs.graphql;

import java.util.*;

public class DeleteTeamDiscussionPayload {

    private String clientMutationId;

    public DeleteTeamDiscussionPayload() {
    }

    public DeleteTeamDiscussionPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}