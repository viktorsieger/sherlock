package se.umu.cs.graphql;

import java.util.*;

public class ReactingUserEdge {

    private String cursor;
    private User node;
    private String reactedAt;

    public ReactingUserEdge() {
    }

    public ReactingUserEdge(String cursor, User node, String reactedAt) {
        this.cursor = cursor;
        this.node = node;
        this.reactedAt = reactedAt;
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

    public String getReactedAt() {
        return reactedAt;
    }
    public void setReactedAt(String reactedAt) {
        this.reactedAt = reactedAt;
    }

}