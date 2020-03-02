package se.umu.cs.githubtypes;

public class UpdateEnterpriseMembersCanMakePurchasesSettingInput {

    private String clientMutationId;
    private String enterpriseId;
    private EnterpriseMembersCanMakePurchasesSettingValue settingValue;

    public UpdateEnterpriseMembersCanMakePurchasesSettingInput() {
    }

    public UpdateEnterpriseMembersCanMakePurchasesSettingInput(String clientMutationId, String enterpriseId, EnterpriseMembersCanMakePurchasesSettingValue settingValue) {
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

    public EnterpriseMembersCanMakePurchasesSettingValue getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseMembersCanMakePurchasesSettingValue settingValue) {
        this.settingValue = settingValue;
    }

}