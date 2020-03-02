package se.umu.cs.githubtypes;

public class RemoveEnterpriseAdminInput {

    private String clientMutationId;
    private String enterpriseId;
    private String login;

    public RemoveEnterpriseAdminInput() {
    }

    public RemoveEnterpriseAdminInput(String clientMutationId, String enterpriseId, String login) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.login = login;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

}