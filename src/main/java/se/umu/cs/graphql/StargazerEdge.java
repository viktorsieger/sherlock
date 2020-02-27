package se.umu.cs.graphql;

import java.util.*;

public class StargazerEdge {

    private String cursor;
    private User node;
    private String starredAt;

    public StargazerEdge() {
    }

    public StargazerEdge(String cursor, User node, String starredAt) {
        this.cursor = cursor;
        this.node = node;
        this.starredAt = starredAt;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public User getNode() {
        return node;
    }
    public void setNode(User node) {
        this.node = node;
    }

    public String getStarredAt() {
        return starredAt;
    }
    public void setStarredAt(String starredAt) {
        this.starredAt = starredAt;
    }

}