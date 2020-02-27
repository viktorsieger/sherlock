package se.umu.cs.graphql;

import java.util.*;

public class UpdateRefsPayload {

    private String clientMutationId;

    public UpdateRefsPayload() {
    }

    public UpdateRefsPayload(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}