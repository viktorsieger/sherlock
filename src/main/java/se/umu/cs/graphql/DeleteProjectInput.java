package se.umu.cs.graphql;

import java.util.*;

public class DeleteProjectInput {

    private String clientMutationId;
    private String projectId;

    public DeleteProjectInput() {
    }

    public DeleteProjectInput(String clientMutationId, String projectId) {
        this.clientMutationId = clientMutationId;
        this.projectId = projectId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

}