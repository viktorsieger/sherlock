package se.umu.cs.githubtypes;

public class MergeBranchPayload {

    private String clientMutationId;
    private Commit mergeCommit;

    public MergeBranchPayload() {
    }

    public MergeBranchPayload(String clientMutationId, Commit mergeCommit) {
        this.clientMutationId = clientMutationId;
        this.mergeCommit = mergeCommit;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Commit getMergeCommit() {
        return mergeCommit;
    }
    public void setMergeCommit(Commit mergeCommit) {
        this.mergeCommit = mergeCommit;
    }

}