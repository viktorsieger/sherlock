package se.umu.cs.graphql;

import java.util.*;

public class DeploymentStatus implements Node{

    private String createdAt;
    private Actor creator;
    private Deployment deployment;
    private String description;
    private String environment;
    private String environmentUrl;
    private String id;
    private String logUrl;
    private DeploymentStatusState state;
    private String updatedAt;

    public DeploymentStatus() {
    }

    public DeploymentStatus(String createdAt, Actor creator, Deployment deployment, String description, String environment, String environmentUrl, String id, String logUrl, DeploymentStatusState state, String updatedAt) {
        this.createdAt = createdAt;
        this.creator = creator;
        this.deployment = deployment;
        this.description = description;
        this.environment = environment;
        this.environmentUrl = environmentUrl;
        this.id = id;
        this.logUrl = logUrl;
        this.state = state;
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Actor getCreator() {
        return creator;
    }
    public void setCreator(Actor creator) {
        this.creator = creator;
    }

    public Deployment getDeployment() {
        return deployment;
    }
    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}