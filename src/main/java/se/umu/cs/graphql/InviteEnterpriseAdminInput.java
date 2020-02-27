package se.umu.cs.graphql;

import java.util.*;

public class InviteEnterpriseAdminInput {

    private String clientMutationId;
    private String email;
    private String enterpriseId;
    private String invitee;
    private EnterpriseAdministratorRole role;

    public InviteEnterpriseAdminInput() {
    }

    public InviteEnterpriseAdminInput(String clientMutationId, String email, String enterpriseId, String invitee, EnterpriseAdministratorRole role) {
        this.clientMutationId = clientMutationId;
        this.email = email;
        this.enterpriseId = enterpriseId;
        this.invitee = invitee;
        this.role = role;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getInvitee() {
        return invitee;
    }
    public void setInvitee(String invitee) {
        this.invitee = invitee;
    }

    public EnterpriseAdministratorRole getRole() {
        return role;
    }
    public void setRole(EnterpriseAdministratorRole role) {
        this.role = role;
    }

}