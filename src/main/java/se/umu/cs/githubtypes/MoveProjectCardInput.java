package se.umu.cs.githubtypes;

public class MoveProjectCardInput {

    private String afterCardId;
    private String cardId;
    private String clientMutationId;
    private String columnId;

    public MoveProjectCardInput() {
    }

    public MoveProjectCardInput(String afterCardId, String cardId, String clientMutationId, String columnId) {
        this.afterCardId = afterCardId;
        this.cardId = cardId;
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
    }

    public String getAfterCardId() {
        return afterCardId;
    }
    public void setAfterCardId(String afterCardId) {
        this.afterCardId = afterCardId;
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

    public String getColumnId() {
        return columnId;
    }
    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

}