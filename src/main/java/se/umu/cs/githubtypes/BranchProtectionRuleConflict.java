package se.umu.cs.githubtypes;

public class BranchProtectionRuleConflict {

    private BranchProtectionRule branchProtectionRule;
    private BranchProtectionRule conflictingBranchProtectionRule;
    private Ref ref;

    public BranchProtectionRuleConflict() {
    }

    public BranchProtectionRuleConflict(BranchProtectionRule branchProtectionRule, BranchProtectionRule conflictingBranchProtectionRule, Ref ref) {
        this.branchProtectionRule = branchProtectionRule;
        this.conflictingBranchProtectionRule = conflictingBranchProtectionRule;
        this.ref = ref;
    }

    public BranchProtectionRule getBranchProtectionRule() {
        return branchProtectionRule;
    }
    public void setBranchProtectionRule(BranchProtectionRule branchProtectionRule) {
        this.branchProtectionRule = branchProtectionRule;
    }

    public BranchProtectionRule getConflictingBranchProtectionRule() {
        return conflictingBranchProtectionRule;
    }
    public void setConflictingBranchProtectionRule(BranchProtectionRule conflictingBranchProtectionRule) {
        this.conflictingBranchProtectionRule = conflictingBranchProtectionRule;
    }

    public Ref getRef() {
        return ref;
    }
    public void setRef(Ref ref) {
        this.ref = ref;
    }

}