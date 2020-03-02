package se.umu.cs.githubtypes;

public class ReopenIssuePayload {

    private String clientMutationId;
    private Issue issue;

    public ReopenIssuePayload() {
    }

    public ReopenIssuePayload(String clientMutationId, Issue issue) {
        this.clientMutationId = clientMutationId;
        this.issue = issue;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Issue getIssue() {
        return issue;
    }
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

}