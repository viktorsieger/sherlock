package se.umu.cs.githubtypes;

public class RepositoryTopicEdge {

    private String cursor;
    private RepositoryTopic node;

    public RepositoryTopicEdge() {
    }

    public RepositoryTopicEdge(String cursor, RepositoryTopic node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RepositoryTopic getNode() {
        return node;
    }
    public void setNode(RepositoryTopic node) {
        this.node = node;
    }

}