package se.umu.cs.githubtypes;

public class TeamEdge {

    private String cursor;
    private Team node;

    public TeamEdge() {
    }

    public TeamEdge(String cursor, Team node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Team getNode() {
        return node;
    }
    public void setNode(Team node) {
        this.node = node;
    }

}