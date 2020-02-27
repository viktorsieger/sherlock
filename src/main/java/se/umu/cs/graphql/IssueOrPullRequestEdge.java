package se.umu.cs.graphql;

import java.util.*;

public class IssueOrPullRequestEdge {

    private String cursor;
    private IssueOrPullRequest node;

    public IssueOrPullRequestEdge() {
    }

    public IssueOrPullRequestEdge(String cursor, IssueOrPullRequest node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public IssueOrPullRequest getNode() {
        return node;
    }
    public void setNode(IssueOrPullRequest node) {
        this.node = node;
    }

}