package se.umu.cs.graphql;

import java.util.*;

public class DeleteDeploymentPayload {

    private String clientMutationId;

    public DeleteDeploymentPayload() {
    }

    public DeleteDeploymentPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}