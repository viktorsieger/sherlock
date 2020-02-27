package se.umu.cs.graphql;

import java.util.*;

public class DeleteBranchProtectionRulePayload {

    private String clientMutationId;

    public DeleteBranchProtectionRulePayload() {
    }

    public DeleteBranchProtectionRulePayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}