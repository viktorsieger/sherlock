package se.umu.cs.githubtypes;

public class DeleteLabelPayload {

    private String clientMutationId;

    public DeleteLabelPayload() {
    }

    public DeleteLabelPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}