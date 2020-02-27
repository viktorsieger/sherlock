package se.umu.cs.graphql;

import java.util.*;

public class TopicEdge {

    private String cursor;
    private Topic node;

    public TopicEdge() {
    }

    public TopicEdge(String cursor, Topic node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Topic getNode() {
        return node;
    }
    public void setNode(Topic node) {
        this.node = node;
    }

}