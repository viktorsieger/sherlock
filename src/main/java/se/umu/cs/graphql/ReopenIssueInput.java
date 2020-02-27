package se.umu.cs.graphql;

import java.util.*;

public class ReopenIssueInput {

    private String clientMutationId;
    private String issueId;

    public ReopenIssueInput() {
    }

    public ReopenIssueInput(String clientMutationId, String issueId) {
        this.clientMutationId = clientMutationId;
        this.issueId = issueId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getIssueId() {
        return issueId;
    }
    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

}