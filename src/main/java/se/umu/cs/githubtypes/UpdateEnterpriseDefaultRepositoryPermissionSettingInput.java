package se.umu.cs.githubtypes;

public class UpdateEnterpriseDefaultRepositoryPermissionSettingInput {

    private String clientMutationId;
    private String enterpriseId;
    private EnterpriseDefaultRepositoryPermissionSettingValue settingValue;

    public UpdateEnterpriseDefaultRepositoryPermissionSettingInput() {
    }

    public UpdateEnterpriseDefaultRepositoryPermissionSettingInput(String clientMutationId, String enterpriseId, EnterpriseDefaultRepositoryPermissionSettingValue settingValue) {
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

    public EnterpriseDefaultRepositoryPermissionSettingValue getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseDefaultRepositoryPermissionSettingValue settingValue) {
        this.settingValue = settingValue;
    }

}