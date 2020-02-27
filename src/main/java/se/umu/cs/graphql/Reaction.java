package se.umu.cs.graphql;

import java.util.*;

public class Reaction implements Node{

    private ReactionContent content;
    private String createdAt;
    private Integer databaseId;
    private String id;
    private Reactable reactable;
    private User user;

    public Reaction() {
    }

    public Reaction(ReactionContent content, String createdAt, Integer databaseId, String id, Reactable reactable, User user) {
        this.content = content;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.reactable = reactable;
        this.user = user;
    }

    public ReactionContent getContent() {
        return content;
    }
    public void setContent(ReactionContent content) {
        this.content = content;
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

    public Reactable getReactable() {
        return reactable;
    }
    public void setReactable(Reactable reactable) {
        this.reactable = reactable;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}