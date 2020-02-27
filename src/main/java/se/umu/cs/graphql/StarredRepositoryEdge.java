package se.umu.cs.graphql;

import java.util.*;

public class StarredRepositoryEdge {

    private String cursor;
    private Repository node;
    private String starredAt;

    public StarredRepositoryEdge() {
    }

    public StarredRepositoryEdge(String cursor, Repository node, String starredAt) {
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

    public Repository getNode() {
        return node;
    }
    public void setNode(Repository node) {
        this.node = node;
    }

    public String getStarredAt() {
        return starredAt;
    }
    public void setStarredAt(String starredAt) {
        this.starredAt = starredAt;
    }

}