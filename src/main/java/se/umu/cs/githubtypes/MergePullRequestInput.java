package se.umu.cs.githubtypes;

public class MergePullRequestInput {

    private String clientMutationId;
    private String commitBody;
    private String commitHeadline;
    private String expectedHeadOid;
    private PullRequestMergeMethod mergeMethod;
    private String pullRequestId;

    public MergePullRequestInput() {
    }

    public MergePullRequestInput(String clientMutationId, String commitBody, String commitHeadline, String expectedHeadOid, PullRequestMergeMethod mergeMethod, String pullRequestId) {
        this.clientMutationId = clientMutationId;
        this.commitBody = commitBody;
        this.commitHeadline = commitHeadline;
        this.expectedHeadOid = expectedHeadOid;
        this.mergeMethod = mergeMethod;
        this.pullRequestId = pullRequestId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getCommitBody() {
        return commitBody;
    }
    public void setCommitBody(String commitBody) {
        this.commitBody = commitBody;
    }

    public String getCommitHeadline() {
        return commitHeadline;
    }
    public void setCommitHeadline(String commitHeadline) {
        this.commitHeadline = commitHeadline;
    }

    public String getExpectedHeadOid() {
        return expectedHeadOid;
    }
    public void setExpectedHeadOid(String expectedHeadOid) {
        this.expectedHeadOid = expectedHeadOid;
    }

    public PullRequestMergeMethod getMergeMethod() {
        return mergeMethod;
    }
    public void setMergeMethod(PullRequestMergeMethod mergeMethod) {
        this.mergeMethod = mergeMethod;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

}