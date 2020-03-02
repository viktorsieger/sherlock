package se.umu.cs.githubtypes;

public class DeleteTeamDiscussionCommentInput {

    private String clientMutationId;
    private String id;

    public DeleteTeamDiscussionCommentInput() {
    }

    public DeleteTeamDiscussionCommentInput(String clientMutationId, String id) {
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}