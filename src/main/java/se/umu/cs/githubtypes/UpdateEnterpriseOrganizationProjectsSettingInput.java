package se.umu.cs.githubtypes;

public class UpdateEnterpriseOrganizationProjectsSettingInput {

    private String clientMutationId;
    private String enterpriseId;
    private EnterpriseEnabledDisabledSettingValue settingValue;

    public UpdateEnterpriseOrganizationProjectsSettingInput() {
    }

    public UpdateEnterpriseOrganizationProjectsSettingInput(String clientMutationId, String enterpriseId, EnterpriseEnabledDisabledSettingValue settingValue) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
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

    public EnterpriseEnabledDisabledSettingValue getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseEnabledDisabledSettingValue settingValue) {
        this.settingValue = settingValue;
    }

}