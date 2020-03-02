package se.umu.cs.githubtypes;

public class CreateDeploymentStatusInput {

    private Boolean autoInactive;
    private String clientMutationId;
    private String deploymentId;
    private String description;
    private String environment;
    private String environmentUrl;
    private String logUrl;
    private DeploymentStatusState state;

    public CreateDeploymentStatusInput() {
    }

    public CreateDeploymentStatusInput(Boolean autoInactive, String clientMutationId, String deploymentId, String description, String environment, String environmentUrl, String logUrl, DeploymentStatusState state) {
        this.autoInactive = autoInactive;
        this.clientMutationId = clientMutationId;
        this.deploymentId = deploymentId;
        this.description = description;
        this.environment = environment;
        this.environmentUrl = environmentUrl;
        this.logUrl = logUrl;
        this.state = state;
    }

    public Boolean getAutoInactive() {
        return autoInactive;
    }
    public void setAutoInactive(Boolean autoInactive) {
        this.autoInactive = autoInactive;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDeploymentId() {
        return deploymentId;
    }
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getEnvironmentUrl() {
        return environmentUrl;
    }
    public void setEnvironmentUrl(String environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    public String getLogUrl() {
        return logUrl;
    }
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    public DeploymentStatusState getState() {
        return state;
    }
    public void setState(DeploymentStatusState state) {
        this.state = state;
    }

}