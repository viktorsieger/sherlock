package se.umu.cs.githubtypes;

public class DeleteProjectCardPayload {

    private String clientMutationId;
    private ProjectColumn column;
    private String deletedCardId;

    public DeleteProjectCardPayload() {
    }

    public DeleteProjectCardPayload(String clientMutationId, ProjectColumn column, String deletedCardId) {
        this.clientMutationId = clientMutationId;
        this.column = column;
        this.deletedCardId = deletedCardId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectColumn getColumn() {
        return column;
    }
    public void setColumn(ProjectColumn column) {
        this.column = column;
    }

    public String getDeletedCardId() {
        return deletedCardId;
    }
    public void setDeletedCardId(String deletedCardId) {
        this.deletedCardId = deletedCardId;
    }

}