package se.umu.cs.graphql;

import java.util.*;

public class CreateDeploymentPayload {

    private Boolean autoMerged;
    private String clientMutationId;
    private Deployment deployment;

    public CreateDeploymentPayload() {
    }

    public CreateDeploymentPayload(Boolean autoMerged, String clientMutationId, Deployment deployment) {
        this.autoMerged = autoMerged;
        this.clientMutationId = clientMutationId;
        this.deployment = deployment;
    }

    public Boolean getAutoMerged() {
        return autoMerged;
    }
    public void setAutoMerged(Boolean autoMerged) {
        this.autoMerged = autoMerged;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Deployment getDeployment() {
        return deployment;
    }
    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
    }

}