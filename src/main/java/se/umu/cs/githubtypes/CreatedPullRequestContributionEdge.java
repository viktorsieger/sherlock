package se.umu.cs.githubtypes;

public class CreatedPullRequestContributionEdge {

    private String cursor;
    private CreatedPullRequestContribution node;

    public CreatedPullRequestContributionEdge() {
    }

    public CreatedPullRequestContributionEdge(String cursor, CreatedPullRequestContribution node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedPullRequestContribution getNode() {
        return node;
    }
    public void setNode(CreatedPullRequestContribution node) {
        this.node = node;
    }

}