package se.umu.cs.githubtypes;

public class DeleteProjectPayload {

    private String clientMutationId;
    private ProjectOwner owner;

    public DeleteProjectPayload() {
    }

    public DeleteProjectPayload(String clientMutationId, ProjectOwner owner) {
        this.clientMutationId = clientMutationId;
        this.owner = owner;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectOwner getOwner() {
        return owner;
    }
    public void setOwner(ProjectOwner owner) {
        this.owner = owner;
    }

}