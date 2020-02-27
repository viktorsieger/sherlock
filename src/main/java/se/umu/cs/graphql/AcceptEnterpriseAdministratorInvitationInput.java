package se.umu.cs.graphql;

public class AcceptEnterpriseAdministratorInvitationInput {

    private String clientMutationId;
    private String invitationId;

    public AcceptEnterpriseAdministratorInvitationInput() {
    }

    public AcceptEnterpriseAdministratorInvitationInput(String clientMutationId, String invitationId) {
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