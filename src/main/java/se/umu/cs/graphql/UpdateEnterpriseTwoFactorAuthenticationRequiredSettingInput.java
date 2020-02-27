package se.umu.cs.graphql;

import java.util.*;

public class UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput {

    private String clientMutationId;
    private String enterpriseId;
    private EnterpriseEnabledSettingValue settingValue;

    public UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput() {
    }

    public UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput(String clientMutationId, String enterpriseId, EnterpriseEnabledSettingValue settingValue) {
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

    public EnterpriseEnabledSettingValue getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(EnterpriseEnabledSettingValue settingValue) {
        this.settingValue = settingValue;
    }

}