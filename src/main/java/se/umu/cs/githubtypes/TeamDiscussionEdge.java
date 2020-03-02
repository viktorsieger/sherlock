package se.umu.cs.githubtypes;

public class TeamDiscussionEdge {

    private String cursor;
    private TeamDiscussion node;

    public TeamDiscussionEdge() {
    }

    public TeamDiscussionEdge(String cursor, TeamDiscussion node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public TeamDiscussion getNode() {
        return node;
    }
    public void setNode(TeamDiscussion node) {
        this.node = node;
    }

}