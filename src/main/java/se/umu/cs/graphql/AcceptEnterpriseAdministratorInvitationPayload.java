package se.umu.cs.graphql;

import java.util.*;

public class AcceptEnterpriseAdministratorInvitationPayload {

    private String clientMutationId;
    private EnterpriseAdministratorInvitation invitation;
    private String message;

    public AcceptEnterpriseAdministratorInvitationPayload() {
    }

    public AcceptEnterpriseAdministratorInvitationPayload(String clientMutationId, EnterpriseAdministratorInvitation invitation, String message) {
        this.clientMutationId = clientMutationId;
        this.invitation = invitation;
        this.message = message;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public EnterpriseAdministratorInvitation getInvitation() {
        return invitation;
    }
    public void setInvitation(EnterpriseAdministratorInvitation invitation) {
        this.invitation = invitation;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}