package se.umu.cs.githubtypes;

public class UnmarkIssueAsDuplicatePayload {

    private String clientMutationId;
    private IssueOrPullRequest duplicate;

    public UnmarkIssueAsDuplicatePayload() {
    }

    public UnmarkIssueAsDuplicatePayload(String clientMutationId, IssueOrPullRequest duplicate) {
        this.clientMutationId = clientMutationId;
        this.duplicate = duplicate;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public IssueOrPullRequest getDuplicate() {
        return duplicate;
    }
    public void setDuplicate(IssueOrPullRequest duplicate) {
        this.duplicate = duplicate;
    }

}