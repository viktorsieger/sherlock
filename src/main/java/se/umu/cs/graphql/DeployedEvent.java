package se.umu.cs.graphql;

import java.util.*;

public class DeployedEvent implements PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private Integer databaseId;
    private Deployment deployment;
    private String id;
    private PullRequest pullRequest;
    private Ref ref;

    public DeployedEvent() {
    }

    public DeployedEvent(Actor actor, String createdAt, Integer databaseId, Deployment deployment, String id, PullRequest pullRequest, Ref ref) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.deployment = deployment;
        this.id = id;
        this.pullRequest = pullRequest;
        this.ref = ref;
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

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Deployment getDeployment() {
        return deployment;
    }
    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
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

    public Ref getRef() {
        return ref;
    }
    public void setRef(Ref ref) {
        this.ref = ref;
    }

}