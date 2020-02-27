package se.umu.cs.graphql;

import java.util.*;

public class HeadRefDeletedEvent implements PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private Ref headRef;
    private String headRefName;
    private String id;
    private PullRequest pullRequest;

    public HeadRefDeletedEvent() {
    }

    public HeadRefDeletedEvent(Actor actor, String createdAt, Ref headRef, String headRefName, String id, PullRequest pullRequest) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.headRef = headRef;
        this.headRefName = headRefName;
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

    public Ref getHeadRef() {
        return headRef;
    }
    public void setHeadRef(Ref headRef) {
        this.headRef = headRef;
    }

    public String getHeadRefName() {
        return headRefName;
    }
    public void setHeadRefName(String headRefName) {
        this.headRefName = headRefName;
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