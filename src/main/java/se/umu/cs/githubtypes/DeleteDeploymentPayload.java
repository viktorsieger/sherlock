package se.umu.cs.githubtypes;

public class DeleteDeploymentPayload {

    private String clientMutationId;

    public DeleteDeploymentPayload() {
    }

    public DeleteDeploymentPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}