package se.umu.cs.graphql;

import java.util.*;

public class UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput {

    private String clientMutationId;
    private String enterpriseId;
    private EnterpriseEnabledDisabledSettingValue settingValue;

    public UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput() {
    }

    public UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput(String clientMutationId, String enterpriseId, EnterpriseEnabledDisabledSettingValue settingValue) {
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