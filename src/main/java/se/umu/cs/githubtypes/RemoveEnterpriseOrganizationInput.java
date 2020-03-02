package se.umu.cs.githubtypes;

public class RemoveEnterpriseOrganizationInput {

    private String clientMutationId;
    private String enterpriseId;
    private String organizationId;

    public RemoveEnterpriseOrganizationInput() {
    }

    public RemoveEnterpriseOrganizationInput(String clientMutationId, String enterpriseId, String organizationId) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.organizationId = organizationId;
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

    public String getOrganizationId() {
        return organizationId;
    }
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

}