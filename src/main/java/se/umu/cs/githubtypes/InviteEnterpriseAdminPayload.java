package se.umu.cs.githubtypes;

public class InviteEnterpriseAdminPayload {

    private String clientMutationId;
    private EnterpriseAdministratorInvitation invitation;

    public InviteEnterpriseAdminPayload() {
    }

    public InviteEnterpriseAdminPayload(String clientMutationId, EnterpriseAdministratorInvitation invitation) {
        this.clientMutationId = clientMutationId;
        this.invitation = invitation;
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

}