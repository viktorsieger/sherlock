package se.umu.cs.graphql;

import java.util.*;

public class ReadyForReviewEvent implements PullRequestTimelineItems, Node, UniformResourceLocatable{

    private Actor actor;
    private String createdAt;
    private String id;
    private PullRequest pullRequest;
    private String resourcePath;
    private String url;

    public ReadyForReviewEvent() {
    }

    public ReadyForReviewEvent(Actor actor, String createdAt, String id, PullRequest pullRequest, String resourcePath, String url) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.pullRequest = pullRequest;
        this.resourcePath = resourcePath;
        this.url = url;
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

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}