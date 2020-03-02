package se.umu.cs.githubtypes;

public class UpdateEnterpriseTeamDiscussionsSettingPayload {

    private String clientMutationId;
    private Enterprise enterprise;
    private String message;

    public UpdateEnterpriseTeamDiscussionsSettingPayload() {
    }

    public UpdateEnterpriseTeamDiscussionsSettingPayload(String clientMutationId, Enterprise enterprise, String message) {
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
        this.message = message;
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

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}