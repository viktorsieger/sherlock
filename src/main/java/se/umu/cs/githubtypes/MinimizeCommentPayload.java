package se.umu.cs.githubtypes;

public class MinimizeCommentPayload {

    private String clientMutationId;
    private Minimizable minimizedComment;

    public MinimizeCommentPayload() {
    }

    public MinimizeCommentPayload(String clientMutationId, Minimizable minimizedComment) {
        this.clientMutationId = clientMutationId;
        this.minimizedComment = minimizedComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Minimizable getMinimizedComment() {
        return minimizedComment;
    }
    public void setMinimizedComment(Minimizable minimizedComment) {
        this.minimizedComment = minimizedComment;
    }

}