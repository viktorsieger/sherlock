package se.umu.cs.githubtypes;

public class CreateRefPayload {

    private String clientMutationId;
    private Ref ref;

    public CreateRefPayload() {
    }

    public CreateRefPayload(String clientMutationId, Ref ref) {
        this.clientMutationId = clientMutationId;
        this.ref = ref;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Ref getRef() {
        return ref;
    }
    public void setRef(Ref ref) {
        this.ref = ref;
    }

}