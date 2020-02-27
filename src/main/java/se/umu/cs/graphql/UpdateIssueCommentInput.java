package se.umu.cs.graphql;

import java.util.*;

public class UpdateIssueCommentInput {

    private String body;
    private String clientMutationId;
    private String id;

    public UpdateIssueCommentInput() {
    }

    public UpdateIssueCommentInput(String body, String clientMutationId, String id) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.id = id;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}