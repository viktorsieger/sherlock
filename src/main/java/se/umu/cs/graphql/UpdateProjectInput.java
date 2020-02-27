package se.umu.cs.graphql;

import java.util.*;

public class UpdateProjectInput {

    private String body;
    private String clientMutationId;
    private String name;
    private String projectId;
    private Boolean Public;
    private ProjectState state;

    public UpdateProjectInput() {
    }

    public UpdateProjectInput(String body, String clientMutationId, String name, String projectId, Boolean Public, ProjectState state) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectId = projectId;
        this.Public = Public;
        this.state = state;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
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

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Boolean getPublic() {
        return Public;
    }
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    public ProjectState getState() {
        return state;
    }
    public void setState(ProjectState state) {
        this.state = state;
    }

}