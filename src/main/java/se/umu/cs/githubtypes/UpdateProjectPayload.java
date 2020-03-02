package se.umu.cs.githubtypes;

public class UpdateProjectPayload {

    private String clientMutationId;
    private Project project;

    public UpdateProjectPayload() {
    }

    public UpdateProjectPayload(String clientMutationId, Project project) {
        this.clientMutationId = clientMutationId;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

}