package se.umu.cs.graphql;

import java.util.*;

public class BranchProtectionRule implements Node{

    private BranchProtectionRuleConflictConnection branchProtectionRuleConflicts;
    private Actor creator;
    private Integer databaseId;
    private Boolean dismissesStaleReviews;
    private String id;
    private Boolean isAdminEnforced;
    private RefConnection matchingRefs;
    private String pattern;
    private PushAllowanceConnection pushAllowances;
    private Repository repository;
    private Integer requiredApprovingReviewCount;
    private Collection<String> requiredStatusCheckContexts;
    private Boolean requiresApprovingReviews;
    private Boolean requiresCodeOwnerReviews;
    private Boolean requiresCommitSignatures;
    private Boolean requiresStatusChecks;
    private Boolean requiresStrictStatusChecks;
    private Boolean restrictsPushes;
    private Boolean restrictsReviewDismissals;
    private ReviewDismissalAllowanceConnection reviewDismissalAllowances;

    public BranchProtectionRule() {
    }

    public BranchProtectionRule(BranchProtectionRuleConflictConnection branchProtectionRuleConflicts, Actor creator, Integer databaseId, Boolean dismissesStaleReviews, String id, Boolean isAdminEnforced, RefConnection matchingRefs, String pattern, PushAllowanceConnection pushAllowances, Repository repository, Integer requiredApprovingReviewCount, Collection<String> requiredStatusCheckContexts, Boolean requiresApprovingReviews, Boolean requiresCodeOwnerReviews, Boolean requiresCommitSignatures, Boolean requiresStatusChecks, Boolean requiresStrictStatusChecks, Boolean restrictsPushes, Boolean restrictsReviewDismissals, ReviewDismissalAllowanceConnection reviewDismissalAllowances) {
        this.branchProtectionRuleConflicts = branchProtectionRuleConflicts;
        this.creator = creator;
        this.databaseId = databaseId;
        this.dismissesStaleReviews = dismissesStaleReviews;
        this.id = id;
        this.isAdminEnforced = isAdminEnforced;
        this.matchingRefs = matchingRefs;
        this.pattern = pattern;
        this.pushAllowances = pushAllowances;
        this.repository = repository;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requiredStatusCheckContexts = requiredStatusCheckContexts;
        this.requiresApprovingReviews = requiresApprovingReviews;
        this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
        this.requiresCommitSignatures = requiresCommitSignatures;
        this.requiresStatusChecks = requiresStatusChecks;
        this.requiresStrictStatusChecks = requiresStrictStatusChecks;
        this.restrictsPushes = restrictsPushes;
        this.restrictsReviewDismissals = restrictsReviewDismissals;
        this.reviewDismissalAllowances = reviewDismissalAllowances;
    }

    public BranchProtectionRuleConflictConnection getBranchProtectionRuleConflicts() {
        return branchProtectionRuleConflicts;
    }
    public void setBranchProtectionRuleConflicts(BranchProtectionRuleConflictConnection branchProtectionRuleConflicts) {
        this.branchProtectionRuleConflicts = branchProtectionRuleConflicts;
    }

    public Actor getCreator() {
        return creator;
    }
    public void setCreator(Actor creator) {
        this.creator = creator;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Boolean getDismissesStaleReviews() {
        return dismissesStaleReviews;
    }
    public void setDismissesStaleReviews(Boolean dismissesStaleReviews) {
        this.dismissesStaleReviews = dismissesStaleReviews;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsAdminEnforced() {
        return isAdminEnforced;
    }
    public void setIsAdminEnforced(Boolean isAdminEnforced) {
        this.isAdminEnforced = isAdminEnforced;
    }

    public RefConnection getMatchingRefs() {
        return matchingRefs;
    }
    public void setMatchingRefs(RefConnection matchingRefs) {
        this.matchingRefs = matchingRefs;
    }

    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public PushAllowanceConnection getPushAllowances() {
        return pushAllowances;
    }
    public void setPushAllowances(PushAllowanceConnection pushAllowances) {
        this.pushAllowances = pushAllowances;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Integer getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }
    public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    public Collection<String> getRequiredStatusCheckContexts() {
        return requiredStatusCheckContexts;
    }
    public void setRequiredStatusCheckContexts(Collection<String> requiredStatusCheckContexts) {
        this.requiredStatusCheckContexts = requiredStatusCheckContexts;
    }

    public Boolean getRequiresApprovingReviews() {
        return requiresApprovingReviews;
    }
    public void setRequiresApprovingReviews(Boolean requiresApprovingReviews) {
        this.requiresApprovingReviews = requiresApprovingReviews;
    }

    public Boolean getRequiresCodeOwnerReviews() {
        return requiresCodeOwnerReviews;
    }
    public void setRequiresCodeOwnerReviews(Boolean requiresCodeOwnerReviews) {
        this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
    }

    public Boolean getRequiresCommitSignatures() {
        return requiresCommitSignatures;
    }
    public void setRequiresCommitSignatures(Boolean requiresCommitSignatures) {
        this.requiresCommitSignatures = requiresCommitSignatures;
    }

    public Boolean getRequiresStatusChecks() {
        return requiresStatusChecks;
    }
    public void setRequiresStatusChecks(Boolean requiresStatusChecks) {
        this.requiresStatusChecks = requiresStatusChecks;
    }

    public Boolean getRequiresStrictStatusChecks() {
        return requiresStrictStatusChecks;
    }
    public void setRequiresStrictStatusChecks(Boolean requiresStrictStatusChecks) {
        this.requiresStrictStatusChecks = requiresStrictStatusChecks;
    }

    public Boolean getRestrictsPushes() {
        return restrictsPushes;
    }
    public void setRestrictsPushes(Boolean restrictsPushes) {
        this.restrictsPushes = restrictsPushes;
    }

    public Boolean getRestrictsReviewDismissals() {
        return restrictsReviewDismissals;
    }
    public void setRestrictsReviewDismissals(Boolean restrictsReviewDismissals) {
        this.restrictsReviewDismissals = restrictsReviewDismissals;
    }

    public ReviewDismissalAllowanceConnection getReviewDismissalAllowances() {
        return reviewDismissalAllowances;
    }
    public void setReviewDismissalAllowances(ReviewDismissalAllowanceConnection reviewDismissalAllowances) {
        this.reviewDismissalAllowances = reviewDismissalAllowances;
    }

}