package se.umu.cs.graphql;

import java.util.*;

public class UpdateTeamDiscussionCommentPayload {

    private String clientMutationId;
    private TeamDiscussionComment teamDiscussionComment;

    public UpdateTeamDiscussionCommentPayload() {
    }

    public UpdateTeamDiscussionCommentPayload(String clientMutationId, TeamDiscussionComment teamDiscussionComment) {
        this.clientMutationId = clientMutationId;
        this.teamDiscussionComment = teamDiscussionComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public TeamDiscussionComment getTeamDiscussionComment() {
        return teamDiscussionComment;
    }
    public void setTeamDiscussionComment(TeamDiscussionComment teamDiscussionComment) {
        this.teamDiscussionComment = teamDiscussionComment;
    }

}