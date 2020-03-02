package se.umu.cs.githubtypes;

public class DeleteRefPayload {

    private String clientMutationId;

    public DeleteRefPayload() {
    }

    public DeleteRefPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}