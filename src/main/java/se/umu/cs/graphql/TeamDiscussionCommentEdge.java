package se.umu.cs.graphql;

import java.util.*;

public class TeamDiscussionCommentEdge {

    private String cursor;
    private TeamDiscussionComment node;

    public TeamDiscussionCommentEdge() {
    }

    public TeamDiscussionCommentEdge(String cursor, TeamDiscussionComment node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public TeamDiscussionComment getNode() {
        return node;
    }
    public void setNode(TeamDiscussionComment node) {
        this.node = node;
    }

}