package se.umu.cs.graphql;

import java.util.*;

public class UnfollowUserPayload {

    private String clientMutationId;
    private User user;

    public UnfollowUserPayload() {
    }

    public UnfollowUserPayload(String clientMutationId, User user) {
        this.clientMutationId = clientMutationId;
        this.user = user;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}