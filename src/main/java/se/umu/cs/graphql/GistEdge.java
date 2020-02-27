package se.umu.cs.graphql;

import java.util.*;

public class GistEdge {

    private String cursor;
    private Gist node;

    public GistEdge() {
    }

    public GistEdge(String cursor, Gist node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Gist getNode() {
        return node;
    }
    public void setNode(Gist node) {
        this.node = node;
    }

}