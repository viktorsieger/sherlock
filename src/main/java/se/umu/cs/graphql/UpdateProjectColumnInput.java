package se.umu.cs.graphql;

import java.util.*;

public class UpdateProjectColumnInput {

    private String clientMutationId;
    private String name;
    private String projectColumnId;

    public UpdateProjectColumnInput() {
    }

    public UpdateProjectColumnInput(String clientMutationId, String name, String projectColumnId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectColumnId = projectColumnId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProjectColumnId() {
        return projectColumnId;
    }
    public void setProjectColumnId(String projectColumnId) {
        this.projectColumnId = projectColumnId;
    }

}