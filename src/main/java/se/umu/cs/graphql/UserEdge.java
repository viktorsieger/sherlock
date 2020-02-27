package se.umu.cs.graphql;

import java.util.*;

public class UserEdge {

    private String cursor;
    private User node;

    public UserEdge() {
    }

    public UserEdge(String cursor, User node) {
        this.cursor = cursor;
        this.node = node;
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

}