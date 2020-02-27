package se.umu.cs.graphql;

import java.util.*;

public class UpdateIssuePayload {

    private Actor actor;
    private String clientMutationId;
    private Issue issue;

    public UpdateIssuePayload() {
    }

    public UpdateIssuePayload(Actor actor, String clientMutationId, Issue issue) {
        this.actor = actor;
        this.clientMutationId = clientMutationId;
        this.issue = issue;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Issue getIssue() {
        return issue;
    }
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

}