package se.umu.cs.graphql;

import java.util.*;

public class RemoveEnterpriseOrganizationPayload {

    private String clientMutationId;
    private Enterprise enterprise;
    private Organization organization;
    private User viewer;

    public RemoveEnterpriseOrganizationPayload() {
    }

    public RemoveEnterpriseOrganizationPayload(String clientMutationId, Enterprise enterprise, Organization organization, User viewer) {
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
        this.organization = organization;
        this.viewer = viewer;
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

    public User getViewer() {
        return viewer;
    }
    public void setViewer(User viewer) {
        this.viewer = viewer;
    }

}