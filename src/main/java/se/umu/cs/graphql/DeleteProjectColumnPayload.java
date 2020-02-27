package se.umu.cs.graphql;

import java.util.*;

public class DeleteProjectColumnPayload {

    private String clientMutationId;
    private String deletedColumnId;
    private Project project;

    public DeleteProjectColumnPayload() {
    }

    public DeleteProjectColumnPayload(String clientMutationId, String deletedColumnId, Project project) {
        this.clientMutationId = clientMutationId;
        this.deletedColumnId = deletedColumnId;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDeletedColumnId() {
        return deletedColumnId;
    }
    public void setDeletedColumnId(String deletedColumnId) {
        this.deletedColumnId = deletedColumnId;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

}