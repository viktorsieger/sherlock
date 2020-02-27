package se.umu.cs.graphql;

import java.util.*;

public class UserStatusEdge {

    private String cursor;
    private UserStatus node;

    public UserStatusEdge() {
    }

    public UserStatusEdge(String cursor, UserStatus node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public UserStatus getNode() {
        return node;
    }
    public void setNode(UserStatus node) {
        this.node = node;
    }

}