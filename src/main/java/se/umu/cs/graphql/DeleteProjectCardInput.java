package se.umu.cs.graphql;

import java.util.*;

public class DeleteProjectCardInput {

    private String cardId;
    private String clientMutationId;

    public DeleteProjectCardInput() {
    }

    public DeleteProjectCardInput(String cardId, String clientMutationId) {
        this.cardId = cardId;
        this.clientMutationId = clientMutationId;
    }

    public String getCardId() {
        return cardId;
    }
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}