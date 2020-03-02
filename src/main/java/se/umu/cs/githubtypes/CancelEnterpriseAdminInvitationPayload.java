package se.umu.cs.githubtypes;

public class CancelEnterpriseAdminInvitationPayload {

    private String clientMutationId;
    private EnterpriseAdministratorInvitation invitation;
    private String message;

    public CancelEnterpriseAdminInvitationPayload() {
    }

    public CancelEnterpriseAdminInvitationPayload(String clientMutationId, EnterpriseAdministratorInvitation invitation, String message) {
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