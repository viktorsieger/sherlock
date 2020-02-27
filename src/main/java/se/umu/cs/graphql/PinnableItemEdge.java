package se.umu.cs.graphql;

import java.util.*;

public class PinnableItemEdge {

    private String cursor;
    private PinnableItem node;

    public PinnableItemEdge() {
    }

    public PinnableItemEdge(String cursor, PinnableItem node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PinnableItem getNode() {
        return node;
    }
    public void setNode(PinnableItem node) {
        this.node = node;
    }

}