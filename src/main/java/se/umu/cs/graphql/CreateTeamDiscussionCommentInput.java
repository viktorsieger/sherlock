package se.umu.cs.graphql;

import java.util.*;

public class CreateTeamDiscussionCommentInput {

    private String body;
    private String clientMutationId;
    private String discussionId;

    public CreateTeamDiscussionCommentInput() {
    }

    public CreateTeamDiscussionCommentInput(String body, String clientMutationId, String discussionId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.discussionId = discussionId;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDiscussionId() {
        return discussionId;
    }
    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }

}