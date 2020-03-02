package se.umu.cs.githubtypes;

public class RegenerateEnterpriseIdentityProviderRecoveryCodesPayload {

    private String clientMutationId;
    private EnterpriseIdentityProvider identityProvider;

    public RegenerateEnterpriseIdentityProviderRecoveryCodesPayload() {
    }

    public RegenerateEnterpriseIdentityProviderRecoveryCodesPayload(String clientMutationId, EnterpriseIdentityProvider identityProvider) {
        this.clientMutationId = clientMutationId;
        this.identityProvider = identityProvider;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public EnterpriseIdentityProvider getIdentityProvider() {
        return identityProvider;
    }
    public void setIdentityProvider(EnterpriseIdentityProvider identityProvider) {
        this.identityProvider = identityProvider;
    }

}