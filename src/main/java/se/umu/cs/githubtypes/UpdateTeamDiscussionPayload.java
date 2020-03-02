package se.umu.cs.githubtypes;

public class UpdateTeamDiscussionPayload {

    private String clientMutationId;
    private TeamDiscussion teamDiscussion;

    public UpdateTeamDiscussionPayload() {
    }

    public UpdateTeamDiscussionPayload(String clientMutationId, TeamDiscussion teamDiscussion) {
        this.clientMutationId = clientMutationId;
        this.teamDiscussion = teamDiscussion;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public TeamDiscussion getTeamDiscussion() {
        return teamDiscussion;
    }
    public void setTeamDiscussion(TeamDiscussion teamDiscussion) {
        this.teamDiscussion = teamDiscussion;
    }

}