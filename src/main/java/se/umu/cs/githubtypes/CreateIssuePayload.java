package se.umu.cs.githubtypes;

public class CreateIssuePayload {

    private String clientMutationId;
    private Issue issue;

    public CreateIssuePayload() {
    }

    public CreateIssuePayload(String clientMutationId, Issue issue) {
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