package se.umu.cs.githubtypes;

public class UpdateEnterpriseMembersCanCreateRepositoriesSettingInput {

    private String clientMutationId;
    private String enterpriseId;
    private Boolean membersCanCreateInternalRepositories;
    private Boolean membersCanCreatePrivateRepositories;
    private Boolean membersCanCreatePublicRepositories;
    private Boolean membersCanCreateRepositoriesPolicyEnabled;
    private EnterpriseMembersCanCreateRepositoriesSettingValue settingValue;

    public UpdateEnterpriseMembersCanCreateRepositoriesSettingInput() {
    }

    public UpdateEnterpriseMembersCanCreateRepositoriesSettingInput(String clientMutationId, String enterpriseId, Boolean membersCanCreateInternalRepositories, Boolean membersCanCreatePrivateRepositories, Boolean membersCanCreatePublicRepositories, Boolean membersCanCreateRepositoriesPolicyEnabled, EnterpriseMembersCanCreateRepositoriesSettingValue settingValue) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.membersCanCreateInternalRepositories = membersCanCreateInternalRepositories;
        this.membersCanCreatePrivateRepositories = membersCanCreatePrivateRepositories;
        this.membersCanCreatePublicRepositories = membersCanCreatePublicRepositories;
        this.membersCanCreateRepositoriesPolicyEnabled = membersCanCreateRepositoriesPolicyEnabled;
        this.settingValue = settingValue;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Boolean getMembersCanCreateInternalRepositories() {
        return membersCanCreateInternalRepositories;
    }
    public void setMembersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) {
        this.membersCanCreateInternalRepositories = membersCanCreateInternalRepositories;
    }

    public Boolean getMembersCanCreatePrivateRepositories() {
        return membersCanCreatePrivateRepositories;
    }
    public void setMembersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) {
        this.membersCanCreatePrivateRepositories = membersCanCreatePrivateRepositories;
    }

    public Boolean getMembersCanCreatePublicRepositories() {
        return membersCanCreatePublicRepositories;
    }
    public void setMembersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) {
        this.membersCanCreatePublicRepositories = membersCanCreatePublicRepositories;
    }

    public Boolean getMembersCanCreateRepositoriesPolicyEnabled() {
        return membersCanCreateRepositoriesPolicyEnabled;
    }
    public void setMembersCanCreateRepositoriesPolicyEnabled(Boolean membersCanCreateRepositoriesPolicyEnabled) {
        this.membersCanCreateRepositoriesPolicyEnabled = membersCanCreateRepositoriesPolicyEnabled;
    }

    public EnterpriseMembersCanCreateRepositoriesSettingValue getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseMembersCanCreateRepositoriesSettingValue settingValue) {
        this.settingValue = settingValue;
    }

}