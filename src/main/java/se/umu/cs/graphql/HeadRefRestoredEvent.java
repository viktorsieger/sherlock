package se.umu.cs.graphql;

import java.util.*;

public class HeadRefRestoredEvent implements PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private PullRequest pullRequest;

    public HeadRefRestoredEvent() {
    }

    public HeadRefRestoredEvent(Actor actor, String createdAt, String id, PullRequest pullRequest) {
        this.actor = actor;
        this.createdAt = createdAt;
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