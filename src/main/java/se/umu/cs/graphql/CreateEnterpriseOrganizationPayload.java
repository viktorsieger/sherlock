package se.umu.cs.graphql;

import java.util.*;

public class CreateEnterpriseOrganizationPayload {

    private String clientMutationId;
    private Enterprise enterprise;
    private Organization organization;

    public CreateEnterpriseOrganizationPayload() {
    }

    public CreateEnterpriseOrganizationPayload(String clientMutationId, Enterprise enterprise, Organization organization) {
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
        this.organization = organization;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

}