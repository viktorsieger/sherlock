package se.umu.cs.graphql;

import java.util.*;

public class RemoveOutsideCollaboratorPayload {

    private String clientMutationId;
    private User removedUser;

    public RemoveOutsideCollaboratorPayload() {
    }

    public RemoveOutsideCollaboratorPayload(String clientMutationId, User removedUser) {
        this.clientMutationId = clientMutationId;
        this.removedUser = removedUser;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public User getRemovedUser() {
        return removedUser;
    }
    public void setRemovedUser(User removedUser) {
        this.removedUser = removedUser;
    }

}