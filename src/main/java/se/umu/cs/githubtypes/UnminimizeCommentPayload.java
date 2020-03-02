package se.umu.cs.githubtypes;

public class UnminimizeCommentPayload {

    private String clientMutationId;
    private Minimizable unminimizedComment;

    public UnminimizeCommentPayload() {
    }

    public UnminimizeCommentPayload(String clientMutationId, Minimizable unminimizedComment) {
        this.clientMutationId = clientMutationId;
        this.unminimizedComment = unminimizedComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Minimizable getUnminimizedComment() {
        return unminimizedComment;
    }
    public void setUnminimizedComment(Minimizable unminimizedComment) {
        this.unminimizedComment = unminimizedComment;
    }

}