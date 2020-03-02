package se.umu.cs.githubtypes;

public class DeleteTeamDiscussionPayload {

    private String clientMutationId;

    public DeleteTeamDiscussionPayload() {
    }

    public DeleteTeamDiscussionPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}