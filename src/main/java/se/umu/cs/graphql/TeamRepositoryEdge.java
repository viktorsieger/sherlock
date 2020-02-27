package se.umu.cs.graphql;

import java.util.*;

public class TeamRepositoryEdge {

    private String cursor;
    private Repository node;
    private RepositoryPermission permission;

    public TeamRepositoryEdge() {
    }

    public TeamRepositoryEdge(String cursor, Repository node, RepositoryPermission permission) {
        this.cursor = cursor;
        this.node = node;
        this.permission = permission;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Repository getNode() {
        return node;
    }
    public void setNode(Repository node) {
        this.node = node;
    }

    public RepositoryPermission getPermission() {
        return permission;
    }
    public void setPermission(RepositoryPermission permission) {
        this.permission = permission;
    }

}