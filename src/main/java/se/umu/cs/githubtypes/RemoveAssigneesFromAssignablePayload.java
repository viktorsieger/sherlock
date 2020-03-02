package se.umu.cs.githubtypes;

public class RemoveAssigneesFromAssignablePayload {

    private Assignable assignable;
    private String clientMutationId;

    public RemoveAssigneesFromAssignablePayload() {
    }

    public RemoveAssigneesFromAssignablePayload(Assignable assignable, String clientMutationId) {
        this.assignable = assignable;
        this.clientMutationId = clientMutationId;
    }

    public Assignable getAssignable() {
        return assignable;
    }
    public void setAssignable(Assignable assignable) {
        this.assignable = assignable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}