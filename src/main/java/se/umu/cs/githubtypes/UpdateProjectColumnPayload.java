package se.umu.cs.githubtypes;

public class UpdateProjectColumnPayload {

    private String clientMutationId;
    private ProjectColumn projectColumn;

    public UpdateProjectColumnPayload() {
    }

    public UpdateProjectColumnPayload(String clientMutationId, ProjectColumn projectColumn) {
        this.clientMutationId = clientMutationId;
        this.projectColumn = projectColumn;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectColumn getProjectColumn() {
        return projectColumn;
    }
    public void setProjectColumn(ProjectColumn projectColumn) {
        this.projectColumn = projectColumn;
    }

}