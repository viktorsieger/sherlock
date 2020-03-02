package se.umu.cs.githubtypes;

public class DeploymentEnvironmentChangedEvent implements PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private DeploymentStatus deploymentStatus;
    private String id;
    private PullRequest pullRequest;

    public DeploymentEnvironmentChangedEvent() {
    }

    public DeploymentEnvironmentChangedEvent(Actor actor, String createdAt, DeploymentStatus deploymentStatus, String id, PullRequest pullRequest) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.deploymentStatus = deploymentStatus;
        this.id = id;
        this.pullRequest = pullRequest;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }
    public void setDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

}