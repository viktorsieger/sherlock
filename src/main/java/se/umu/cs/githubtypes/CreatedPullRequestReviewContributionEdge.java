package se.umu.cs.githubtypes;

public class CreatedPullRequestReviewContributionEdge {

    private String cursor;
    private CreatedPullRequestReviewContribution node;

    public CreatedPullRequestReviewContributionEdge() {
    }

    public CreatedPullRequestReviewContributionEdge(String cursor, CreatedPullRequestReviewContribution node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedPullRequestReviewContribution getNode() {
        return node;
    }
    public void setNode(CreatedPullRequestReviewContribution node) {
        this.node = node;
    }

}