package se.umu.cs.graphql;

import java.util.*;

public class ReopenedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private Closable closable;
    private String createdAt;
    private String id;

    public ReopenedEvent() {
    }

    public ReopenedEvent(Actor actor, Closable closable, String createdAt, String id) {
        this.actor = actor;
        this.closable = closable;
        this.createdAt = createdAt;
        this.id = id;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Closable getClosable() {
        return closable;
    }
    public void setClosable(Closable closable) {
        this.closable = closable;
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

}