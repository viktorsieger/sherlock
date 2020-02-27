package se.umu.cs.graphql;

import java.util.*;

public class DeleteDeploymentInput {

    private String clientMutationId;
    private String id;

    public DeleteDeploymentInput() {
    }

    public DeleteDeploymentInput(String clientMutationId, String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}