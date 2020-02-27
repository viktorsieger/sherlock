package se.umu.cs.graphql;

import java.util.*;

public class UpdateEnterpriseProfilePayload {

    private String clientMutationId;
    private Enterprise enterprise;

    public UpdateEnterpriseProfilePayload() {
    }

    public UpdateEnterpriseProfilePayload(String clientMutationId, Enterprise enterprise) {
        this.clientMutationId = clientMutationId;
        this.enterprise = enterprise;
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

}