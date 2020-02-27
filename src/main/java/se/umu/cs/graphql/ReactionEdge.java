package se.umu.cs.graphql;

import java.util.*;

public class ReactionEdge {

    private String cursor;
    private Reaction node;

    public ReactionEdge() {
    }

    public ReactionEdge(String cursor, Reaction node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Reaction getNode() {
        return node;
    }
    public void setNode(Reaction node) {
        this.node = node;
    }

}