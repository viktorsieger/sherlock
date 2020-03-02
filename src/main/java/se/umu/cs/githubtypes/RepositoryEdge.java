package se.umu.cs.githubtypes;

public class RepositoryEdge {

    private String cursor;
    private Repository node;

    public RepositoryEdge() {
    }

    public RepositoryEdge(String cursor, Repository node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Repository getNode() {
        return node;
    }
    public void setNode(Repository node) {
        this.node = node;
    }

}