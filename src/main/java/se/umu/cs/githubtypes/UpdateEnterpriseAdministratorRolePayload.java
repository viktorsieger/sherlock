package se.umu.cs.githubtypes;

public class UpdateEnterpriseAdministratorRolePayload {

    private String clientMutationId;
    private String message;

    public UpdateEnterpriseAdministratorRolePayload() {
    }

    public UpdateEnterpriseAdministratorRolePayload(String clientMutationId, String message) {
        this.clientMutationId = clientMutationId;
        this.message = message;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}