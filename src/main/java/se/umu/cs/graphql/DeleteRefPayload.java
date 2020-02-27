package se.umu.cs.graphql;

import java.util.*;

public class DeleteRefPayload {

    private String clientMutationId;

    public DeleteRefPayload() {
    }

    public DeleteRefPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}