package se.umu.cs.graphql;

import java.util.*;

public class SavedReplyEdge {

    private String cursor;
    private SavedReply node;

    public SavedReplyEdge() {
    }

    public SavedReplyEdge(String cursor, SavedReply node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SavedReply getNode() {
        return node;
    }
    public void setNode(SavedReply node) {
        this.node = node;
    }

}