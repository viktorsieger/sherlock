package se.umu.cs.graphql;

import java.util.*;

public class CloseIssuePayload {

    private String clientMutationId;
    private Issue issue;

    public CloseIssuePayload() {
    }

    public CloseIssuePayload(String clientMutationId, Issue issue) {
        this.clientMutationId = clientMutationId;
        this.issue = issue;
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