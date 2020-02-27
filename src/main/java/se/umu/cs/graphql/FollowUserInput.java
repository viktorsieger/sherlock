package se.umu.cs.graphql;

import java.util.*;

public class FollowUserInput {

    private String clientMutationId;
    private String userId;

    public FollowUserInput() {
    }

    public FollowUserInput(String clientMutationId, String userId) {
        this.clientMutationId = clientMutationId;
        this.userId = userId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}