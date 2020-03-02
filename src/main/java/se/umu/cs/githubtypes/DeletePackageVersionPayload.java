package se.umu.cs.githubtypes;

public class DeletePackageVersionPayload {

    private String clientMutationId;
    private Boolean success;

    public DeletePackageVersionPayload() {
    }

    public DeletePackageVersionPayload(String clientMutationId, Boolean success) {
        this.clientMutationId = clientMutationId;
        this.success = success;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

}