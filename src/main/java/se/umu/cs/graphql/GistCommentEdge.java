package se.umu.cs.graphql;

import java.util.*;

public class GistCommentEdge {

    private String cursor;
    private GistComment node;

    public GistCommentEdge() {
    }

    public GistCommentEdge(String cursor, GistComment node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public GistComment getNode() {
        return node;
    }
    public void setNode(GistComment node) {
        this.node = node;
    }

}