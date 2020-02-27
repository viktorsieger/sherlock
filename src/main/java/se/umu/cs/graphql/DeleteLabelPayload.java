package se.umu.cs.graphql;

import java.util.*;

public class DeleteLabelPayload {

    private String clientMutationId;

    public DeleteLabelPayload() {
    }

    public DeleteLabelPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}