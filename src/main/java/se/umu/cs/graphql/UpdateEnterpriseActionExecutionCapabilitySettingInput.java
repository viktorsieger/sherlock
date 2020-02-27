package se.umu.cs.graphql;

import java.util.*;

public class UpdateEnterpriseActionExecutionCapabilitySettingInput {

    private ActionExecutionCapabilitySetting capability;
    private String clientMutationId;
    private String enterpriseId;

    public UpdateEnterpriseActionExecutionCapabilitySettingInput() {
    }

    public UpdateEnterpriseActionExecutionCapabilitySettingInput(ActionExecutionCapabilitySetting capability, String clientMutationId, String enterpriseId) {
        this.capability = capability;
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
    }

    public ActionExecutionCapabilitySetting getCapability() {
        return capability;
    }
    public void setCapability(ActionExecutionCapabilitySetting capability) {
        this.capability = capability;
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

}