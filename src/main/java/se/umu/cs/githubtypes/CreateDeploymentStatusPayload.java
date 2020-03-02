package se.umu.cs.githubtypes;

public class CreateDeploymentStatusPayload {

    private String clientMutationId;
    private DeploymentStatus deploymentStatus;

    public CreateDeploymentStatusPayload() {
    }

    public CreateDeploymentStatusPayload(String clientMutationId, DeploymentStatus deploymentStatus) {
        this.clientMutationId = clientMutationId;
        this.deploymentStatus = deploymentStatus;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public DeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }
    public void setDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

}