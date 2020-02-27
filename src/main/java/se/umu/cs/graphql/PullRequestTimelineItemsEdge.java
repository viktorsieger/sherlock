package se.umu.cs.graphql;

import java.util.*;

public class PullRequestTimelineItemsEdge {

    private String cursor;
    private PullRequestTimelineItems node;

    public PullRequestTimelineItemsEdge() {
    }

    public PullRequestTimelineItemsEdge(String cursor, PullRequestTimelineItems node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestTimelineItems getNode() {
        return node;
    }
    public void setNode(PullRequestTimelineItems node) {
        this.node = node;
    }

}