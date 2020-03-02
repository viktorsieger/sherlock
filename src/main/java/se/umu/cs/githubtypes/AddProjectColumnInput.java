package se.umu.cs.githubtypes;

public class AddProjectColumnInput {

    private String clientMutationId;
    private String name;
    private String projectId;

    public AddProjectColumnInput() {
    }

    public AddProjectColumnInput(String clientMutationId, String name, String projectId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.projectId = projectId;
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

}