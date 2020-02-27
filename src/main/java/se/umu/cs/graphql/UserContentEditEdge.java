package se.umu.cs.graphql;

import java.util.*;

public class UserContentEditEdge {

    private String cursor;
    private UserContentEdit node;

    public UserContentEditEdge() {
    }

    public UserContentEditEdge(String cursor, UserContentEdit node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public UserContentEdit getNode() {
        return node;
    }
    public void setNode(UserContentEdit node) {
        this.node = node;
    }

}