package se.umu.cs.githubtypes;

public class CreatedRepositoryContributionEdge {

    private String cursor;
    private CreatedRepositoryContribution node;

    public CreatedRepositoryContributionEdge() {
    }

    public CreatedRepositoryContributionEdge(String cursor, CreatedRepositoryContribution node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedRepositoryContribution getNode() {
        return node;
    }
    public void setNode(CreatedRepositoryContribution node) {
        this.node = node;
    }

}