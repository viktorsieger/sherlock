package se.umu.cs.graphql;

import java.util.*;

public class UpdateEnterpriseAdministratorRoleInput {

    private String clientMutationId;
    private String enterpriseId;
    private String login;
    private EnterpriseAdministratorRole role;

    public UpdateEnterpriseAdministratorRoleInput() {
    }

    public UpdateEnterpriseAdministratorRoleInput(String clientMutationId, String enterpriseId, String login, EnterpriseAdministratorRole role) {
        this.clientMutationId = clientMutationId;
        this.enterpriseId = enterpriseId;
        this.login = login;
        this.role = role;
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

    public EnterpriseAdministratorRole getRole() {
        return role;
    }
    public void setRole(EnterpriseAdministratorRole role) {
        this.role = role;
    }

}