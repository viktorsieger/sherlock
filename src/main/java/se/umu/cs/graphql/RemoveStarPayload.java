package se.umu.cs.graphql;

import java.util.*;

public class RemoveStarPayload {

    private String clientMutationId;
    private Starrable starrable;

    public RemoveStarPayload() {
    }

    public RemoveStarPayload(String clientMutationId, Starrable starrable) {
        this.clientMutationId = clientMutationId;
        this.starrable = starrable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Starrable getStarrable() {
        return starrable;
    }
    public void setStarrable(Starrable starrable) {
        this.starrable = starrable;
    }

}