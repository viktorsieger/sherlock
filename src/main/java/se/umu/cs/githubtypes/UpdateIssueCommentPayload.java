package se.umu.cs.githubtypes;

public class UpdateIssueCommentPayload {

    private String clientMutationId;
    private IssueComment issueComment;

    public UpdateIssueCommentPayload() {
    }

    public UpdateIssueCommentPayload(String clientMutationId, IssueComment issueComment) {
        this.clientMutationId = clientMutationId;
        this.issueComment = issueComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public IssueComment getIssueComment() {
        return issueComment;
    }
    public void setIssueComment(IssueComment issueComment) {
        this.issueComment = issueComment;
    }

}