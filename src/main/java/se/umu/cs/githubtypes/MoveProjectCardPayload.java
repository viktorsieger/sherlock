package se.umu.cs.githubtypes;

public class MoveProjectCardPayload {

    private ProjectCardEdge cardEdge;
    private String clientMutationId;

    public MoveProjectCardPayload() {
    }

    public MoveProjectCardPayload(ProjectCardEdge cardEdge, String clientMutationId) {
        this.cardEdge = cardEdge;
        this.clientMutationId = clientMutationId;
    }

    public ProjectCardEdge getCardEdge() {
        return cardEdge;
    }
    public void setCardEdge(ProjectCardEdge cardEdge) {
        this.cardEdge = cardEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}