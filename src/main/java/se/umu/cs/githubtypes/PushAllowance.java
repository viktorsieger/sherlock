package se.umu.cs.githubtypes;

public class PushAllowance implements Node{

    private PushAllowanceActor actor;
    private BranchProtectionRule branchProtectionRule;
    private String id;

    public PushAllowance() {
    }

    public PushAllowance(PushAllowanceActor actor, BranchProtectionRule branchProtectionRule, String id) {
        this.actor = actor;
        this.branchProtectionRule = branchProtectionRule;
        this.id = id;
    }

    public PushAllowanceActor getActor() {
        return actor;
    }
    public void setActor(PushAllowanceActor actor) {
        this.actor = actor;
    }

    public BranchProtectionRule getBranchProtectionRule() {
        return branchProtectionRule;
    }
    public void setBranchProtectionRule(BranchProtectionRule branchProtectionRule) {
        this.branchProtectionRule = branchProtectionRule;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}