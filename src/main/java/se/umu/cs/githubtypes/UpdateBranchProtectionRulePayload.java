package se.umu.cs.githubtypes;

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