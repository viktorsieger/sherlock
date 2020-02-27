package se.umu.cs.graphql;

import java.util.*;

public class RemoveEnterpriseAdminPayload {

    private User admin;
    private String clientMutationId;
    private Enterprise enterprise;
    private String message;
    private User viewer;

    public RemoveEnterpriseAdminPayload() {
    }

    public RemoveEnterpriseAdminPayload(User admin, String clientMutationId, Enterprise enterprise, String message, User viewer) {
        this.admin = admin;
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
        this.message = message;
        this.viewer = viewer;
    }

    public User getAdmin() {
        return admin;
    }
    public void setAdmin(User admin) {
        this.admin = admin;
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

    public User getViewer() {
        return viewer;
    }
    public void setViewer(User viewer) {
        this.viewer = viewer;
    }

}