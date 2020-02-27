package se.umu.cs.graphql;

import java.util.*;

public class ReviewDismissalAllowance implements Node{

    private ReviewDismissalAllowanceActor actor;
    private BranchProtectionRule branchProtectionRule;
    private String id;

    public ReviewDismissalAllowance() {
    }

    public ReviewDismissalAllowance(ReviewDismissalAllowanceActor actor, BranchProtectionRule branchProtectionRule, String id) {
        this.actor = actor;
        this.branchProtectionRule = branchProtectionRule;
        this.id = id;
    }

    public ReviewDismissalAllowanceActor getActor() {
        return actor;
    }
    public void setActor(ReviewDismissalAllowanceActor actor) {
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