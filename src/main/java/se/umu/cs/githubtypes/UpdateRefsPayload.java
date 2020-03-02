package se.umu.cs.githubtypes;

public class UpdateRefsPayload {

    private String clientMutationId;

    public UpdateRefsPayload() {
    }

    public UpdateRefsPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}