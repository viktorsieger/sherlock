package se.umu.cs.graphql;

import java.util.*;

public class DeleteBranchProtectionRuleInput {

    private String branchProtectionRuleId;
    private String clientMutationId;

    public DeleteBranchProtectionRuleInput() {
    }

    public DeleteBranchProtectionRuleInput(String branchProtectionRuleId, String clientMutationId) {
        this.branchProtectionRuleId = branchProtectionRuleId;
        this.clientMutationId = clientMutationId;
    }

    public String getBranchProtectionRuleId() {
        return branchProtectionRuleId;
    }
    public void setBranchProtectionRuleId(String branchProtectionRuleId) {
        this.branchProtectionRuleId = branchProtectionRuleId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}