package se.umu.cs.githubtypes;

public class DeleteRefInput {

    private String clientMutationId;
    private String refId;

    public DeleteRefInput() {
    }

    public DeleteRefInput(String clientMutationId, String refId) {
        this.clientMutationId = clientMutationId;
        this.refId = refId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getRefId() {
        return refId;
    }
    public void setRefId(String refId) {
        this.refId = refId;
    }

}