package se.umu.cs.graphql;

import java.util.*;

public interface Mutation {

    AcceptEnterpriseAdministratorInvitationPayload acceptEnterpriseAdministratorInvitation(AcceptEnterpriseAdministratorInvitationInput input) throws Exception;

    AcceptTopicSuggestionPayload acceptTopicSuggestion(AcceptTopicSuggestionInput input) throws Exception;

    AddAssigneesToAssignablePayload addAssigneesToAssignable(AddAssigneesToAssignableInput input) throws Exception;

    AddCommentPayload addComment(AddCommentInput input) throws Exception;

    AddLabelsToLabelablePayload addLabelsToLabelable(AddLabelsToLabelableInput input) throws Exception;

    AddProjectCardPayload addProjectCard(AddProjectCardInput input) throws Exception;

    AddProjectColumnPayload addProjectColumn(AddProjectColumnInput input) throws Exception;

    AddPullRequestReviewPayload addPullRequestReview(AddPullRequestReviewInput input) throws Exception;

    AddPullRequestReviewCommentPayload addPullRequestReviewComment(AddPullRequestReviewCommentInput input) throws Exception;

    AddPullRequestReviewThreadPayload addPullRequestReviewThread(AddPullRequestReviewThreadInput input) throws Exception;

    AddReactionPayload addReaction(AddReactionInput input) throws Exception;

    AddStarPayload addStar(AddStarInput input) throws Exception;

    ArchiveRepositoryPayload archiveRepository(ArchiveRepositoryInput input) throws Exception;

    CancelEnterpriseAdminInvitationPayload cancelEnterpriseAdminInvitation(CancelEnterpriseAdminInvitationInput input) throws Exception;

    ChangeUserStatusPayload changeUserStatus(ChangeUserStatusInput input) throws Exception;

    ClearLabelsFromLabelablePayload clearLabelsFromLabelable(ClearLabelsFromLabelableInput input) throws Exception;

    CloneProjectPayload cloneProject(CloneProjectInput input) throws Exception;

    CloneTemplateRepositoryPayload cloneTemplateRepository(CloneTemplateRepositoryInput input) throws Exception;

    CloseIssuePayload closeIssue(CloseIssueInput input) throws Exception;

    ClosePullRequestPayload closePullRequest(ClosePullRequestInput input) throws Exception;

    ConvertProjectCardNoteToIssuePayload convertProjectCardNoteToIssue(ConvertProjectCardNoteToIssueInput input) throws Exception;

    CreateBranchProtectionRulePayload createBranchProtectionRule(CreateBranchProtectionRuleInput input) throws Exception;

    CreateCheckRunPayload createCheckRun(CreateCheckRunInput input) throws Exception;

    CreateCheckSuitePayload createCheckSuite(CreateCheckSuiteInput input) throws Exception;

    CreateContentAttachmentPayload createContentAttachment(CreateContentAttachmentInput input) throws Exception;

    CreateDeploymentPayload createDeployment(CreateDeploymentInput input) throws Exception;

    CreateDeploymentStatusPayload createDeploymentStatus(CreateDeploymentStatusInput input) throws Exception;

    CreateEnterpriseOrganizationPayload createEnterpriseOrganization(CreateEnterpriseOrganizationInput input) throws Exception;

    CreateIssuePayload createIssue(CreateIssueInput input) throws Exception;

    CreateLabelPayload createLabel(CreateLabelInput input) throws Exception;

    CreateProjectPayload createProject(CreateProjectInput input) throws Exception;

    CreatePullRequestPayload createPullRequest(CreatePullRequestInput input) throws Exception;

    CreateRefPayload createRef(CreateRefInput input) throws Exception;

    CreateRepositoryPayload createRepository(CreateRepositoryInput input) throws Exception;

    CreateTeamDiscussionPayload createTeamDiscussion(CreateTeamDiscussionInput input) throws Exception;

    CreateTeamDiscussionCommentPayload createTeamDiscussionComment(CreateTeamDiscussionCommentInput input) throws Exception;

    DeclineTopicSuggestionPayload declineTopicSuggestion(DeclineTopicSuggestionInput input) throws Exception;

    DeleteBranchProtectionRulePayload deleteBranchProtectionRule(DeleteBranchProtectionRuleInput input) throws Exception;

    DeleteDeploymentPayload deleteDeployment(DeleteDeploymentInput input) throws Exception;

    DeleteIssuePayload deleteIssue(DeleteIssueInput input) throws Exception;

    DeleteIssueCommentPayload deleteIssueComment(DeleteIssueCommentInput input) throws Exception;

    DeleteLabelPayload deleteLabel(DeleteLabelInput input) throws Exception;

    DeletePackageVersionPayload deletePackageVersion(DeletePackageVersionInput input) throws Exception;

    DeleteProjectPayload deleteProject(DeleteProjectInput input) throws Exception;

    DeleteProjectCardPayload deleteProjectCard(DeleteProjectCardInput input) throws Exception;

    DeleteProjectColumnPayload deleteProjectColumn(DeleteProjectColumnInput input) throws Exception;

    DeletePullRequestReviewPayload deletePullRequestReview(DeletePullRequestReviewInput input) throws Exception;

    DeletePullRequestReviewCommentPayload deletePullRequestReviewComment(DeletePullRequestReviewCommentInput input) throws Exception;

    DeleteRefPayload deleteRef(DeleteRefInput input) throws Exception;

    DeleteTeamDiscussionPayload deleteTeamDiscussion(DeleteTeamDiscussionInput input) throws Exception;

    DeleteTeamDiscussionCommentPayload deleteTeamDiscussionComment(DeleteTeamDiscussionCommentInput input) throws Exception;

    DismissPullRequestReviewPayload dismissPullRequestReview(DismissPullRequestReviewInput input) throws Exception;

    FollowUserPayload followUser(FollowUserInput input) throws Exception;

    ImportProjectPayload importProject(ImportProjectInput input) throws Exception;

    InviteEnterpriseAdminPayload inviteEnterpriseAdmin(InviteEnterpriseAdminInput input) throws Exception;

    LinkRepositoryToProjectPayload linkRepositoryToProject(LinkRepositoryToProjectInput input) throws Exception;

    LockLockablePayload lockLockable(LockLockableInput input) throws Exception;

    MarkPullRequestReadyForReviewPayload markPullRequestReadyForReview(MarkPullRequestReadyForReviewInput input) throws Exception;

    MergeBranchPayload mergeBranch(MergeBranchInput input) throws Exception;

    MergePullRequestPayload mergePullRequest(MergePullRequestInput input) throws Exception;

    MinimizeCommentPayload minimizeComment(MinimizeCommentInput input) throws Exception;

    MoveProjectCardPayload moveProjectCard(MoveProjectCardInput input) throws Exception;

    MoveProjectColumnPayload moveProjectColumn(MoveProjectColumnInput input) throws Exception;

    PinIssuePayload pinIssue(PinIssueInput input) throws Exception;

    RegenerateEnterpriseIdentityProviderRecoveryCodesPayload regenerateEnterpriseIdentityProviderRecoveryCodes(RegenerateEnterpriseIdentityProviderRecoveryCodesInput input) throws Exception;

    RemoveAssigneesFromAssignablePayload removeAssigneesFromAssignable(RemoveAssigneesFromAssignableInput input) throws Exception;

    RemoveEnterpriseAdminPayload removeEnterpriseAdmin(RemoveEnterpriseAdminInput input) throws Exception;

    RemoveEnterpriseOrganizationPayload removeEnterpriseOrganization(RemoveEnterpriseOrganizationInput input) throws Exception;

    RemoveLabelsFromLabelablePayload removeLabelsFromLabelable(RemoveLabelsFromLabelableInput input) throws Exception;

    RemoveOutsideCollaboratorPayload removeOutsideCollaborator(RemoveOutsideCollaboratorInput input) throws Exception;

    RemoveReactionPayload removeReaction(RemoveReactionInput input) throws Exception;

    RemoveStarPayload removeStar(RemoveStarInput input) throws Exception;

    ReopenIssuePayload reopenIssue(ReopenIssueInput input) throws Exception;

    ReopenPullRequestPayload reopenPullRequest(ReopenPullRequestInput input) throws Exception;

    RequestReviewsPayload requestReviews(RequestReviewsInput input) throws Exception;

    RerequestCheckSuitePayload rerequestCheckSuite(RerequestCheckSuiteInput input) throws Exception;

    ResolveReviewThreadPayload resolveReviewThread(ResolveReviewThreadInput input) throws Exception;

    SubmitPullRequestReviewPayload submitPullRequestReview(SubmitPullRequestReviewInput input) throws Exception;

    TransferIssuePayload transferIssue(TransferIssueInput input) throws Exception;

    UnarchiveRepositoryPayload unarchiveRepository(UnarchiveRepositoryInput input) throws Exception;

    UnfollowUserPayload unfollowUser(UnfollowUserInput input) throws Exception;

    UnlinkRepositoryFromProjectPayload unlinkRepositoryFromProject(UnlinkRepositoryFromProjectInput input) throws Exception;

    UnlockLockablePayload unlockLockable(UnlockLockableInput input) throws Exception;

    UnmarkIssueAsDuplicatePayload unmarkIssueAsDuplicate(UnmarkIssueAsDuplicateInput input) throws Exception;

    UnminimizeCommentPayload unminimizeComment(UnminimizeCommentInput input) throws Exception;

    UnpinIssuePayload unpinIssue(UnpinIssueInput input) throws Exception;

    UnresolveReviewThreadPayload unresolveReviewThread(UnresolveReviewThreadInput input) throws Exception;

    UpdateBranchProtectionRulePayload updateBranchProtectionRule(UpdateBranchProtectionRuleInput input) throws Exception;

    UpdateCheckRunPayload updateCheckRun(UpdateCheckRunInput input) throws Exception;

    UpdateCheckSuitePreferencesPayload updateCheckSuitePreferences(UpdateCheckSuitePreferencesInput input) throws Exception;

    UpdateEnterpriseActionExecutionCapabilitySettingPayload updateEnterpriseActionExecutionCapabilitySetting(UpdateEnterpriseActionExecutionCapabilitySettingInput input) throws Exception;

    UpdateEnterpriseAdministratorRolePayload updateEnterpriseAdministratorRole(UpdateEnterpriseAdministratorRoleInput input) throws Exception;

    UpdateEnterpriseAllowPrivateRepositoryForkingSettingPayload updateEnterpriseAllowPrivateRepositoryForkingSetting(UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput input) throws Exception;

    UpdateEnterpriseDefaultRepositoryPermissionSettingPayload updateEnterpriseDefaultRepositoryPermissionSetting(UpdateEnterpriseDefaultRepositoryPermissionSettingInput input) throws Exception;

    UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingPayload updateEnterpriseMembersCanChangeRepositoryVisibilitySetting(UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput input) throws Exception;

    UpdateEnterpriseMembersCanCreateRepositoriesSettingPayload updateEnterpriseMembersCanCreateRepositoriesSetting(UpdateEnterpriseMembersCanCreateRepositoriesSettingInput input) throws Exception;

    UpdateEnterpriseMembersCanDeleteIssuesSettingPayload updateEnterpriseMembersCanDeleteIssuesSetting(UpdateEnterpriseMembersCanDeleteIssuesSettingInput input) throws Exception;

    UpdateEnterpriseMembersCanDeleteRepositoriesSettingPayload updateEnterpriseMembersCanDeleteRepositoriesSetting(UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput input) throws Exception;

    UpdateEnterpriseMembersCanInviteCollaboratorsSettingPayload updateEnterpriseMembersCanInviteCollaboratorsSetting(UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput input) throws Exception;

    UpdateEnterpriseMembersCanMakePurchasesSettingPayload updateEnterpriseMembersCanMakePurchasesSetting(UpdateEnterpriseMembersCanMakePurchasesSettingInput input) throws Exception;

    UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingPayload updateEnterpriseMembersCanUpdateProtectedBranchesSetting(UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput input) throws Exception;

    UpdateEnterpriseMembersCanViewDependencyInsightsSettingPayload updateEnterpriseMembersCanViewDependencyInsightsSetting(UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput input) throws Exception;

    UpdateEnterpriseOrganizationProjectsSettingPayload updateEnterpriseOrganizationProjectsSetting(UpdateEnterpriseOrganizationProjectsSettingInput input) throws Exception;

    UpdateEnterpriseProfilePayload updateEnterpriseProfile(UpdateEnterpriseProfileInput input) throws Exception;

    UpdateEnterpriseRepositoryProjectsSettingPayload updateEnterpriseRepositoryProjectsSetting(UpdateEnterpriseRepositoryProjectsSettingInput input) throws Exception;

    UpdateEnterpriseTeamDiscussionsSettingPayload updateEnterpriseTeamDiscussionsSetting(UpdateEnterpriseTeamDiscussionsSettingInput input) throws Exception;

    UpdateEnterpriseTwoFactorAuthenticationRequiredSettingPayload updateEnterpriseTwoFactorAuthenticationRequiredSetting(UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput input) throws Exception;

    UpdateIssuePayload updateIssue(UpdateIssueInput input) throws Exception;

    UpdateIssueCommentPayload updateIssueComment(UpdateIssueCommentInput input) throws Exception;

    UpdateLabelPayload updateLabel(UpdateLabelInput input) throws Exception;

    UpdateProjectPayload updateProject(UpdateProjectInput input) throws Exception;

    UpdateProjectCardPayload updateProjectCard(UpdateProjectCardInput input) throws Exception;

    UpdateProjectColumnPayload updateProjectColumn(UpdateProjectColumnInput input) throws Exception;

    UpdatePullRequestPayload updatePullRequest(UpdatePullRequestInput input) throws Exception;

    UpdatePullRequestReviewPayload updatePullRequestReview(UpdatePullRequestReviewInput input) throws Exception;

    UpdatePullRequestReviewCommentPayload updatePullRequestReviewComment(UpdatePullRequestReviewCommentInput input) throws Exception;

    UpdateRefPayload updateRef(UpdateRefInput input) throws Exception;

    UpdateRefsPayload updateRefs(UpdateRefsInput input) throws Exception;

    UpdateRepositoryPayload updateRepository(UpdateRepositoryInput input) throws Exception;

    UpdateSubscriptionPayload updateSubscription(UpdateSubscriptionInput input) throws Exception;

    UpdateTeamDiscussionPayload updateTeamDiscussion(UpdateTeamDiscussionInput input) throws Exception;

    UpdateTeamDiscussionCommentPayload updateTeamDiscussionComment(UpdateTeamDiscussionCommentInput input) throws Exception;

    UpdateTeamReviewAssignmentPayload updateTeamReviewAssignment(UpdateTeamReviewAssignmentInput input) throws Exception;

    UpdateTopicsPayload updateTopics(UpdateTopicsInput input) throws Exception;

}