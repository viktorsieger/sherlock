package se.umu.cs.githubtypes;

public class CreatedIssueContributionEdge {

    private String cursor;
    private CreatedIssueContribution node;

    public CreatedIssueContributionEdge() {
    }

    public CreatedIssueContributionEdge(String cursor, CreatedIssueContribution node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedIssueContribution getNode() {
        return node;
    }
    public void setNode(CreatedIssueContribution node) {
        this.node = node;
    }

}