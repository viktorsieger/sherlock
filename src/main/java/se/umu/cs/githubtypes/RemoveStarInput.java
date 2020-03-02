package se.umu.cs.githubtypes;

public class RemoveStarInput {

    private String clientMutationId;
    private String starrableId;

    public RemoveStarInput() {
    }

    public RemoveStarInput(String clientMutationId, String starrableId) {
        this.clientMutationId = clientMutationId;
        this.starrableId = starrableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getStarrableId() {
        return starrableId;
    }
    public void setStarrableId(String starrableId) {
        this.starrableId = starrableId;
    }

}