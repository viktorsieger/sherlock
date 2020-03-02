package se.umu.cs.githubtypes;

public class CancelEnterpriseAdminInvitationInput {

    private String clientMutationId;
    private String invitationId;

    public CancelEnterpriseAdminInvitationInput() {
    }

    public CancelEnterpriseAdminInvitationInput(String clientMutationId, String invitationId) {
        this.clientMutationId = clientMutationId;
        this.invitationId = invitationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getInvitationId() {
        return invitationId;
    }
    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

}