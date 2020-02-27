package se.umu.cs.graphql;

import java.util.*;

public class MentionedEvent implements IssueTimelineItems, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private Integer databaseId;
    private String id;

    public MentionedEvent() {
    }

    public MentionedEvent(Actor actor, String createdAt, Integer databaseId, String id) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}