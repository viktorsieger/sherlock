package se.umu.cs.githubtypes;

public class AddProjectColumnPayload {

    private String clientMutationId;
    private ProjectColumnEdge columnEdge;
    private Project project;

    public AddProjectColumnPayload() {
    }

    public AddProjectColumnPayload(String clientMutationId, ProjectColumnEdge columnEdge, Project project) {
        this.clientMutationId = clientMutationId;
        this.columnEdge = columnEdge;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectColumnEdge getColumnEdge() {
        return columnEdge;
    }
    public void setColumnEdge(ProjectColumnEdge columnEdge) {
        this.columnEdge = columnEdge;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

}