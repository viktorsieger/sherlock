package se.umu.cs.graphql;

import java.util.*;

public class UpdateBranchProtectionRulePayload {

    private BranchProtectionRule branchProtectionRule;
    private String clientMutationId;

    public UpdateBranchProtectionRulePayload() {
    }

    public UpdateBranchProtectionRulePayload(BranchProtectionRule branchProtectionRule, String clientMutationId) {
        this.branchProtectionRule = branchProtectionRule;
        this.clientMutationId = clientMutationId;
    }

    public BranchProtectionRule getBranchProtectionRule() {
        return branchProtectionRule;
    }
    public void setBranchProtectionRule(BranchProtectionRule branchProtectionRule) {
        this.branchProtectionRule = branchProtectionRule;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}