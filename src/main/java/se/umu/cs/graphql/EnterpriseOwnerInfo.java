package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseOwnerInfo {

    private OrganizationConnection actionExecutionCapabilitySettingOrganizations;
    private EnterpriseAdministratorConnection admins;
    private UserConnection affiliatedUsersWithTwoFactorDisabled;
    private Boolean affiliatedUsersWithTwoFactorDisabledExist;
    private EnterpriseEnabledDisabledSettingValue allowPrivateRepositoryForkingSetting;
    private OrganizationConnection allowPrivateRepositoryForkingSettingOrganizations;
    private EnterpriseDefaultRepositoryPermissionSettingValue defaultRepositoryPermissionSetting;
    private OrganizationConnection defaultRepositoryPermissionSettingOrganizations;
    private EnterpriseServerInstallationConnection enterpriseServerInstallations;
    private Boolean isUpdatingDefaultRepositoryPermission;
    private Boolean isUpdatingTwoFactorRequirement;
    private EnterpriseEnabledDisabledSettingValue membersCanChangeRepositoryVisibilitySetting;
    private OrganizationConnection membersCanChangeRepositoryVisibilitySettingOrganizations;
    private Boolean membersCanCreateInternalRepositoriesSetting;
    private Boolean membersCanCreatePrivateRepositoriesSetting;
    private Boolean membersCanCreatePublicRepositoriesSetting;
    private EnterpriseMembersCanCreateRepositoriesSettingValue membersCanCreateRepositoriesSetting;
    private OrganizationConnection membersCanCreateRepositoriesSettingOrganizations;
    private EnterpriseEnabledDisabledSettingValue membersCanDeleteIssuesSetting;
    private OrganizationConnection membersCanDeleteIssuesSettingOrganizations;
    private EnterpriseEnabledDisabledSettingValue membersCanDeleteRepositoriesSetting;
    private OrganizationConnection membersCanDeleteRepositoriesSettingOrganizations;
    private EnterpriseEnabledDisabledSettingValue membersCanInviteCollaboratorsSetting;
    private OrganizationConnection membersCanInviteCollaboratorsSettingOrganizations;
    private EnterpriseMembersCanMakePurchasesSettingValue membersCanMakePurchasesSetting;
    private EnterpriseEnabledDisabledSettingValue membersCanUpdateProtectedBranchesSetting;
    private OrganizationConnection membersCanUpdateProtectedBranchesSettingOrganizations;
    private EnterpriseEnabledDisabledSettingValue membersCanViewDependencyInsightsSetting;
    private OrganizationConnection membersCanViewDependencyInsightsSettingOrganizations;
    private EnterpriseEnabledDisabledSettingValue organizationProjectsSetting;
    private OrganizationConnection organizationProjectsSettingOrganizations;
    private EnterpriseOutsideCollaboratorConnection outsideCollaborators;
    private EnterpriseAdministratorInvitationConnection pendingAdminInvitations;
    private EnterprisePendingCollaboratorConnection pendingCollaborators;
    private EnterprisePendingMemberInvitationConnection pendingMemberInvitations;
    private EnterpriseEnabledDisabledSettingValue repositoryProjectsSetting;
    private OrganizationConnection repositoryProjectsSettingOrganizations;
    private EnterpriseIdentityProvider samlIdentityProvider;
    private OrganizationConnection samlIdentityProviderSettingOrganizations;
    private EnterpriseEnabledDisabledSettingValue teamDiscussionsSetting;
    private OrganizationConnection teamDiscussionsSettingOrganizations;
    private EnterpriseEnabledSettingValue twoFactorRequiredSetting;
    private OrganizationConnection twoFactorRequiredSettingOrganizations;

    public EnterpriseOwnerInfo() {
    }

    public EnterpriseOwnerInfo(OrganizationConnection actionExecutionCapabilitySettingOrganizations, EnterpriseAdministratorConnection admins, UserConnection affiliatedUsersWithTwoFactorDisabled, Boolean affiliatedUsersWithTwoFactorDisabledExist, EnterpriseEnabledDisabledSettingValue allowPrivateRepositoryForkingSetting, OrganizationConnection allowPrivateRepositoryForkingSettingOrganizations, EnterpriseDefaultRepositoryPermissionSettingValue defaultRepositoryPermissionSetting, OrganizationConnection defaultRepositoryPermissionSettingOrganizations, EnterpriseServerInstallationConnection enterpriseServerInstallations, Boolean isUpdatingDefaultRepositoryPermission, Boolean isUpdatingTwoFactorRequirement, EnterpriseEnabledDisabledSettingValue membersCanChangeRepositoryVisibilitySetting, OrganizationConnection membersCanChangeRepositoryVisibilitySettingOrganizations, Boolean membersCanCreateInternalRepositoriesSetting, Boolean membersCanCreatePrivateRepositoriesSetting, Boolean membersCanCreatePublicRepositoriesSetting, EnterpriseMembersCanCreateRepositoriesSettingValue membersCanCreateRepositoriesSetting, OrganizationConnection membersCanCreateRepositoriesSettingOrganizations, EnterpriseEnabledDisabledSettingValue membersCanDeleteIssuesSetting, OrganizationConnection membersCanDeleteIssuesSettingOrganizations, EnterpriseEnabledDisabledSettingValue membersCanDeleteRepositoriesSetting, OrganizationConnection membersCanDeleteRepositoriesSettingOrganizations, EnterpriseEnabledDisabledSettingValue membersCanInviteCollaboratorsSetting, OrganizationConnection membersCanInviteCollaboratorsSettingOrganizations, EnterpriseMembersCanMakePurchasesSettingValue membersCanMakePurchasesSetting, EnterpriseEnabledDisabledSettingValue membersCanUpdateProtectedBranchesSetting, OrganizationConnection membersCanUpdateProtectedBranchesSettingOrganizations, EnterpriseEnabledDisabledSettingValue membersCanViewDependencyInsightsSetting, OrganizationConnection membersCanViewDependencyInsightsSettingOrganizations, EnterpriseEnabledDisabledSettingValue organizationProjectsSetting, OrganizationConnection organizationProjectsSettingOrganizations, EnterpriseOutsideCollaboratorConnection outsideCollaborators, EnterpriseAdministratorInvitationConnection pendingAdminInvitations, EnterprisePendingCollaboratorConnection pendingCollaborators, EnterprisePendingMemberInvitationConnection pendingMemberInvitations, EnterpriseEnabledDisabledSettingValue repositoryProjectsSetting, OrganizationConnection repositoryProjectsSettingOrganizations, EnterpriseIdentityProvider samlIdentityProvider, OrganizationConnection samlIdentityProviderSettingOrganizations, EnterpriseEnabledDisabledSettingValue teamDiscussionsSetting, OrganizationConnection teamDiscussionsSettingOrganizations, EnterpriseEnabledSettingValue twoFactorRequiredSetting, OrganizationConnection twoFactorRequiredSettingOrganizations) {
        this.actionExecutionCapabilitySettingOrganizations = actionExecutionCapabilitySettingOrganizations;
        this.admins = admins;
        this.affiliatedUsersWithTwoFactorDisabled = affiliatedUsersWithTwoFactorDisabled;
        this.affiliatedUsersWithTwoFactorDisabledExist = affiliatedUsersWithTwoFactorDisabledExist;
        this.allowPrivateRepositoryForkingSetting = allowPrivateRepositoryForkingSetting;
        this.allowPrivateRepositoryForkingSettingOrganizations = allowPrivateRepositoryForkingSettingOrganizations;
        this.defaultRepositoryPermissionSetting = defaultRepositoryPermissionSetting;
        this.defaultRepositoryPermissionSettingOrganizations = defaultRepositoryPermissionSettingOrganizations;
        this.enterpriseServerInstallations = enterpriseServerInstallations;
        this.isUpdatingDefaultRepositoryPermission = isUpdatingDefaultRepositoryPermission;
        this.isUpdatingTwoFactorRequirement = isUpdatingTwoFactorRequirement;
        this.membersCanChangeRepositoryVisibilitySetting = membersCanChangeRepositoryVisibilitySetting;
        this.membersCanChangeRepositoryVisibilitySettingOrganizations = membersCanChangeRepositoryVisibilitySettingOrganizations;
        this.membersCanCreateInternalRepositoriesSetting = membersCanCreateInternalRepositoriesSetting;
        this.membersCanCreatePrivateRepositoriesSetting = membersCanCreatePrivateRepositoriesSetting;
        this.membersCanCreatePublicRepositoriesSetting = membersCanCreatePublicRepositoriesSetting;
        this.membersCanCreateRepositoriesSetting = membersCanCreateRepositoriesSetting;
        this.membersCanCreateRepositoriesSettingOrganizations = membersCanCreateRepositoriesSettingOrganizations;
        this.membersCanDeleteIssuesSetting = membersCanDeleteIssuesSetting;
        this.membersCanDeleteIssuesSettingOrganizations = membersCanDeleteIssuesSettingOrganizations;
        this.membersCanDeleteRepositoriesSetting = membersCanDeleteRepositoriesSetting;
        this.membersCanDeleteRepositoriesSettingOrganizations = membersCanDeleteRepositoriesSettingOrganizations;
        this.membersCanInviteCollaboratorsSetting = membersCanInviteCollaboratorsSetting;
        this.membersCanInviteCollaboratorsSettingOrganizations = membersCanInviteCollaboratorsSettingOrganizations;
        this.membersCanMakePurchasesSetting = membersCanMakePurchasesSetting;
        this.membersCanUpdateProtectedBranchesSetting = membersCanUpdateProtectedBranchesSetting;
        this.membersCanUpdateProtectedBranchesSettingOrganizations = membersCanUpdateProtectedBranchesSettingOrganizations;
        this.membersCanViewDependencyInsightsSetting = membersCanViewDependencyInsightsSetting;
        this.membersCanViewDependencyInsightsSettingOrganizations = membersCanViewDependencyInsightsSettingOrganizations;
        this.organizationProjectsSetting = organizationProjectsSetting;
        this.organizationProjectsSettingOrganizations = organizationProjectsSettingOrganizations;
        this.outsideCollaborators = outsideCollaborators;
        this.pendingAdminInvitations = pendingAdminInvitations;
        this.pendingCollaborators = pendingCollaborators;
        this.pendingMemberInvitations = pendingMemberInvitations;
        this.repositoryProjectsSetting = repositoryProjectsSetting;
        this.repositoryProjectsSettingOrganizations = repositoryProjectsSettingOrganizations;
        this.samlIdentityProvider = samlIdentityProvider;
        this.samlIdentityProviderSettingOrganizations = samlIdentityProviderSettingOrganizations;
        this.teamDiscussionsSetting = teamDiscussionsSetting;
        this.teamDiscussionsSettingOrganizations = teamDiscussionsSettingOrganizations;
        this.twoFactorRequiredSetting = twoFactorRequiredSetting;
        this.twoFactorRequiredSettingOrganizations = twoFactorRequiredSettingOrganizations;
    }

    public OrganizationConnection getActionExecutionCapabilitySettingOrganizations() {
        return actionExecutionCapabilitySettingOrganizations;
    }
    public void setActionExecutionCapabilitySettingOrganizations(OrganizationConnection actionExecutionCapabilitySettingOrganizations) {
        this.actionExecutionCapabilitySettingOrganizations = actionExecutionCapabilitySettingOrganizations;
    }

    public EnterpriseAdministratorConnection getAdmins() {
        return admins;
    }
    public void setAdmins(EnterpriseAdministratorConnection admins) {
        this.admins = admins;
    }

    public UserConnection getAffiliatedUsersWithTwoFactorDisabled() {
        return affiliatedUsersWithTwoFactorDisabled;
    }
    public void setAffiliatedUsersWithTwoFactorDisabled(UserConnection affiliatedUsersWithTwoFactorDisabled) {
        this.affiliatedUsersWithTwoFactorDisabled = affiliatedUsersWithTwoFactorDisabled;
    }

    public Boolean getAffiliatedUsersWithTwoFactorDisabledExist() {
        return affiliatedUsersWithTwoFactorDisabledExist;
    }
    public void setAffiliatedUsersWithTwoFactorDisabledExist(Boolean affiliatedUsersWithTwoFactorDisabledExist) {
        this.affiliatedUsersWithTwoFactorDisabledExist = affiliatedUsersWithTwoFactorDisabledExist;
    }

    public EnterpriseEnabledDisabledSettingValue getAllowPrivateRepositoryForkingSetting() {
        return allowPrivateRepositoryForkingSetting;
    }
    public void setAllowPrivateRepositoryForkingSetting(EnterpriseEnabledDisabledSettingValue allowPrivateRepositoryForkingSetting) {
        this.allowPrivateRepositoryForkingSetting = allowPrivateRepositoryForkingSetting;
    }

    public OrganizationConnection getAllowPrivateRepositoryForkingSettingOrganizations() {
        return allowPrivateRepositoryForkingSettingOrganizations;
    }
    public void setAllowPrivateRepositoryForkingSettingOrganizations(OrganizationConnection allowPrivateRepositoryForkingSettingOrganizations) {
        this.allowPrivateRepositoryForkingSettingOrganizations = allowPrivateRepositoryForkingSettingOrganizations;
    }

    public EnterpriseDefaultRepositoryPermissionSettingValue getDefaultRepositoryPermissionSetting() {
        return defaultRepositoryPermissionSetting;
    }
    public void setDefaultRepositoryPermissionSetting(EnterpriseDefaultRepositoryPermissionSettingValue defaultRepositoryPermissionSetting) {
        this.defaultRepositoryPermissionSetting = defaultRepositoryPermissionSetting;
    }

    public OrganizationConnection getDefaultRepositoryPermissionSettingOrganizations() {
        return defaultRepositoryPermissionSettingOrganizations;
    }
    public void setDefaultRepositoryPermissionSettingOrganizations(OrganizationConnection defaultRepositoryPermissionSettingOrganizations) {
        this.defaultRepositoryPermissionSettingOrganizations = defaultRepositoryPermissionSettingOrganizations;
    }

    public EnterpriseServerInstallationConnection getEnterpriseServerInstallations() {
        return enterpriseServerInstallations;
    }
    public void setEnterpriseServerInstallations(EnterpriseServerInstallationConnection enterpriseServerInstallations) {
        this.enterpriseServerInstallations = enterpriseServerInstallations;
    }

    public Boolean getIsUpdatingDefaultRepositoryPermission() {
        return isUpdatingDefaultRepositoryPermission;
    }
    public void setIsUpdatingDefaultRepositoryPermission(Boolean isUpdatingDefaultRepositoryPermission) {
        this.isUpdatingDefaultRepositoryPermission = isUpdatingDefaultRepositoryPermission;
    }

    public Boolean getIsUpdatingTwoFactorRequirement() {
        return isUpdatingTwoFactorRequirement;
    }
    public void setIsUpdatingTwoFactorRequirement(Boolean isUpdatingTwoFactorRequirement) {
        this.isUpdatingTwoFactorRequirement = isUpdatingTwoFactorRequirement;
    }

    public EnterpriseEnabledDisabledSettingValue getMembersCanChangeRepositoryVisibilitySetting() {
        return membersCanChangeRepositoryVisibilitySetting;
    }
    public void setMembersCanChangeRepositoryVisibilitySetting(EnterpriseEnabledDisabledSettingValue membersCanChangeRepositoryVisibilitySetting) {
        this.membersCanChangeRepositoryVisibilitySetting = membersCanChangeRepositoryVisibilitySetting;
    }

    public OrganizationConnection getMembersCanChangeRepositoryVisibilitySettingOrganizations() {
        return membersCanChangeRepositoryVisibilitySettingOrganizations;
    }
    public void setMembersCanChangeRepositoryVisibilitySettingOrganizations(OrganizationConnection membersCanChangeRepositoryVisibilitySettingOrganizations) {
        this.membersCanChangeRepositoryVisibilitySettingOrganizations = membersCanChangeRepositoryVisibilitySettingOrganizations;
    }

    public Boolean getMembersCanCreateInternalRepositoriesSetting() {
        return membersCanCreateInternalRepositoriesSetting;
    }
    public void setMembersCanCreateInternalRepositoriesSetting(Boolean membersCanCreateInternalRepositoriesSetting) {
        this.membersCanCreateInternalRepositoriesSetting = membersCanCreateInternalRepositoriesSetting;
    }

    public Boolean getMembersCanCreatePrivateRepositoriesSetting() {
        return membersCanCreatePrivateRepositoriesSetting;
    }
    public void setMembersCanCreatePrivateRepositoriesSetting(Boolean membersCanCreatePrivateRepositoriesSetting) {
        this.membersCanCreatePrivateRepositoriesSetting = membersCanCreatePrivateRepositoriesSetting;
    }

    public Boolean getMembersCanCreatePublicRepositoriesSetting() {
        return membersCanCreatePublicRepositoriesSetting;
    }
    public void setMembersCanCreatePublicRepositoriesSetting(Boolean membersCanCreatePublicRepositoriesSetting) {
        this.membersCanCreatePublicRepositoriesSetting = membersCanCreatePublicRepositoriesSetting;
    }

    public EnterpriseMembersCanCreateRepositoriesSettingValue getMembersCanCreateRepositoriesSetting() {
        return membersCanCreateRepositoriesSetting;
    }
    public void setMembersCanCreateRepositoriesSetting(EnterpriseMembersCanCreateRepositoriesSettingValue membersCanCreateRepositoriesSetting) {
        this.membersCanCreateRepositoriesSetting = membersCanCreateRepositoriesSetting;
    }

    public OrganizationConnection getMembersCanCreateRepositoriesSettingOrganizations() {
        return membersCanCreateRepositoriesSettingOrganizations;
    }
    public void setMembersCanCreateRepositoriesSettingOrganizations(OrganizationConnection membersCanCreateRepositoriesSettingOrganizations) {
        this.membersCanCreateRepositoriesSettingOrganizations = membersCanCreateRepositoriesSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValue getMembersCanDeleteIssuesSetting() {
        return membersCanDeleteIssuesSetting;
    }
    public void setMembersCanDeleteIssuesSetting(EnterpriseEnabledDisabledSettingValue membersCanDeleteIssuesSetting) {
        this.membersCanDeleteIssuesSetting = membersCanDeleteIssuesSetting;
    }

    public OrganizationConnection getMembersCanDeleteIssuesSettingOrganizations() {
        return membersCanDeleteIssuesSettingOrganizations;
    }
    public void setMembersCanDeleteIssuesSettingOrganizations(OrganizationConnection membersCanDeleteIssuesSettingOrganizations) {
        this.membersCanDeleteIssuesSettingOrganizations = membersCanDeleteIssuesSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValue getMembersCanDeleteRepositoriesSetting() {
        return membersCanDeleteRepositoriesSetting;
    }
    public void setMembersCanDeleteRepositoriesSetting(EnterpriseEnabledDisabledSettingValue membersCanDeleteRepositoriesSetting) {
        this.membersCanDeleteRepositoriesSetting = membersCanDeleteRepositoriesSetting;
    }

    public OrganizationConnection getMembersCanDeleteRepositoriesSettingOrganizations() {
        return membersCanDeleteRepositoriesSettingOrganizations;
    }
    public void setMembersCanDeleteRepositoriesSettingOrganizations(OrganizationConnection membersCanDeleteRepositoriesSettingOrganizations) {
        this.membersCanDeleteRepositoriesSettingOrganizations = membersCanDeleteRepositoriesSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValue getMembersCanInviteCollaboratorsSetting() {
        return membersCanInviteCollaboratorsSetting;
    }
    public void setMembersCanInviteCollaboratorsSetting(EnterpriseEnabledDisabledSettingValue membersCanInviteCollaboratorsSetting) {
        this.membersCanInviteCollaboratorsSetting = membersCanInviteCollaboratorsSetting;
    }

    public OrganizationConnection getMembersCanInviteCollaboratorsSettingOrganizations() {
        return membersCanInviteCollaboratorsSettingOrganizations;
    }
    public void setMembersCanInviteCollaboratorsSettingOrganizations(OrganizationConnection membersCanInviteCollaboratorsSettingOrganizations) {
        this.membersCanInviteCollaboratorsSettingOrganizations = membersCanInviteCollaboratorsSettingOrganizations;
    }

    public EnterpriseMembersCanMakePurchasesSettingValue getMembersCanMakePurchasesSetting() {
        return membersCanMakePurchasesSetting;
    }
    public void setMembersCanMakePurchasesSetting(EnterpriseMembersCanMakePurchasesSettingValue membersCanMakePurchasesSetting) {
        this.membersCanMakePurchasesSetting = membersCanMakePurchasesSetting;
    }

    public EnterpriseEnabledDisabledSettingValue getMembersCanUpdateProtectedBranchesSetting() {
        return membersCanUpdateProtectedBranchesSetting;
    }
    public void setMembersCanUpdateProtectedBranchesSetting(EnterpriseEnabledDisabledSettingValue membersCanUpdateProtectedBranchesSetting) {
        this.membersCanUpdateProtectedBranchesSetting = membersCanUpdateProtectedBranchesSetting;
    }

    public OrganizationConnection getMembersCanUpdateProtectedBranchesSettingOrganizations() {
        return membersCanUpdateProtectedBranchesSettingOrganizations;
    }
    public void setMembersCanUpdateProtectedBranchesSettingOrganizations(OrganizationConnection membersCanUpdateProtectedBranchesSettingOrganizations) {
        this.membersCanUpdateProtectedBranchesSettingOrganizations = membersCanUpdateProtectedBranchesSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValue getMembersCanViewDependencyInsightsSetting() {
        return membersCanViewDependencyInsightsSetting;
    }
    public void setMembersCanViewDependencyInsightsSetting(EnterpriseEnabledDisabledSettingValue membersCanViewDependencyInsightsSetting) {
        this.membersCanViewDependencyInsightsSetting = membersCanViewDependencyInsightsSetting;
    }

    public OrganizationConnection getMembersCanViewDependencyInsightsSettingOrganizations() {
        return membersCanViewDependencyInsightsSettingOrganizations;
    }
    public void setMembersCanViewDependencyInsightsSettingOrganizations(OrganizationConnection membersCanViewDependencyInsightsSettingOrganizations) {
        this.membersCanViewDependencyInsightsSettingOrganizations = membersCanViewDependencyInsightsSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValue getOrganizationProjectsSetting() {
        return organizationProjectsSetting;
    }
    public void setOrganizationProjectsSetting(EnterpriseEnabledDisabledSettingValue organizationProjectsSetting) {
        this.organizationProjectsSetting = organizationProjectsSetting;
    }

    public OrganizationConnection getOrganizationProjectsSettingOrganizations() {
        return organizationProjectsSettingOrganizations;
    }
    public void setOrganizationProjectsSettingOrganizations(OrganizationConnection organizationProjectsSettingOrganizations) {
        this.organizationProjectsSettingOrganizations = organizationProjectsSettingOrganizations;
    }

    public EnterpriseOutsideCollaboratorConnection getOutsideCollaborators() {
        return outsideCollaborators;
    }
    public void setOutsideCollaborators(EnterpriseOutsideCollaboratorConnection outsideCollaborators) {
        this.outsideCollaborators = outsideCollaborators;
    }

    public EnterpriseAdministratorInvitationConnection getPendingAdminInvitations() {
        return pendingAdminInvitations;
    }
    public void setPendingAdminInvitations(EnterpriseAdministratorInvitationConnection pendingAdminInvitations) {
        this.pendingAdminInvitations = pendingAdminInvitations;
    }

    public EnterprisePendingCollaboratorConnection getPendingCollaborators() {
        return pendingCollaborators;
    }
    public void setPendingCollaborators(EnterprisePendingCollaboratorConnection pendingCollaborators) {
        this.pendingCollaborators = pendingCollaborators;
    }

    public EnterprisePendingMemberInvitationConnection getPendingMemberInvitations() {
        return pendingMemberInvitations;
    }
    public void setPendingMemberInvitations(EnterprisePendingMemberInvitationConnection pendingMemberInvitations) {
        this.pendingMemberInvitations = pendingMemberInvitations;
    }

    public EnterpriseEnabledDisabledSettingValue getRepositoryProjectsSetting() {
        return repositoryProjectsSetting;
    }
    public void setRepositoryProjectsSetting(EnterpriseEnabledDisabledSettingValue repositoryProjectsSetting) {
        this.repositoryProjectsSetting = repositoryProjectsSetting;
    }

    public OrganizationConnection getRepositoryProjectsSettingOrganizations() {
        return repositoryProjectsSettingOrganizations;
    }
    public void setRepositoryProjectsSettingOrganizations(OrganizationConnection repositoryProjectsSettingOrganizations) {
        this.repositoryProjectsSettingOrganizations = repositoryProjectsSettingOrganizations;
    }

    public EnterpriseIdentityProvider getSamlIdentityProvider() {
        return samlIdentityProvider;
    }
    public void setSamlIdentityProvider(EnterpriseIdentityProvider samlIdentityProvider) {
        this.samlIdentityProvider = samlIdentityProvider;
    }

    public OrganizationConnection getSamlIdentityProviderSettingOrganizations() {
        return samlIdentityProviderSettingOrganizations;
    }
    public void setSamlIdentityProviderSettingOrganizations(OrganizationConnection samlIdentityProviderSettingOrganizations) {
        this.samlIdentityProviderSettingOrganizations = samlIdentityProviderSettingOrganizations;
    }

    public EnterpriseEnabledDisabledSettingValue getTeamDiscussionsSetting() {
        return teamDiscussionsSetting;
    }
    public void setTeamDiscussionsSetting(EnterpriseEnabledDisabledSettingValue teamDiscussionsSetting) {
        this.teamDiscussionsSetting = teamDiscussionsSetting;
    }

    public OrganizationConnection getTeamDiscussionsSettingOrganizations() {
        return teamDiscussionsSettingOrganizations;
    }
    public void setTeamDiscussionsSettingOrganizations(OrganizationConnection teamDiscussionsSettingOrganizations) {
        this.teamDiscussionsSettingOrganizations = teamDiscussionsSettingOrganizations;
    }

    public EnterpriseEnabledSettingValue getTwoFactorRequiredSetting() {
        return twoFactorRequiredSetting;
    }
    public void setTwoFactorRequiredSetting(EnterpriseEnabledSettingValue twoFactorRequiredSetting) {
        this.twoFactorRequiredSetting = twoFactorRequiredSetting;
    }

    public OrganizationConnection getTwoFactorRequiredSettingOrganizations() {
        return twoFactorRequiredSettingOrganizations;
    }
    public void setTwoFactorRequiredSettingOrganizations(OrganizationConnection twoFactorRequiredSettingOrganizations) {
        this.twoFactorRequiredSettingOrganizations = twoFactorRequiredSettingOrganizations;
    }

}