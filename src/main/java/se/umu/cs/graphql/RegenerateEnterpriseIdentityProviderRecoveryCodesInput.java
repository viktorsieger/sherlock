package se.umu.cs.graphql;

import java.util.*;

public class RegenerateEnterpriseIdentityProviderRecoveryCodesInput {

    private String clientMutationId;
    private String enterpriseId;

    public RegenerateEnterpriseIdentityProviderRecoveryCodesInput() {
    }

    public RegenerateEnterpriseIdentityProviderRecoveryCodesInput(String clientMutationId, String enterpriseId) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
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