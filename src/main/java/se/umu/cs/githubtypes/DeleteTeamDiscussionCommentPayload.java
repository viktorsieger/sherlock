package se.umu.cs.githubtypes;

public class DeleteTeamDiscussionCommentPayload {

    private String clientMutationId;

    public DeleteTeamDiscussionCommentPayload() {
    }

    public DeleteTeamDiscussionCommentPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}