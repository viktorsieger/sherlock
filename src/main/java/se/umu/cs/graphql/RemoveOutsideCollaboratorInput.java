package se.umu.cs.graphql;

import java.util.*;

public class RemoveOutsideCollaboratorInput {

    private String clientMutationId;
    private String organizationId;
    private String userId;

    public RemoveOutsideCollaboratorInput() {
    }

    public RemoveOutsideCollaboratorInput(String clientMutationId, String organizationId, String userId) {
        this.clientMutationId = clientMutationId;
        this.organizationId = organizationId;
        this.userId = userId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}