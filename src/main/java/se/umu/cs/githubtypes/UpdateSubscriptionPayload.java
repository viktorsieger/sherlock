package se.umu.cs.githubtypes;

public class UpdateSubscriptionPayload {

    private String clientMutationId;
    private Subscribable subscribable;

    public UpdateSubscriptionPayload() {
    }

    public UpdateSubscriptionPayload(String clientMutationId, Subscribable subscribable) {
        this.clientMutationId = clientMutationId;
        this.subscribable = subscribable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Subscribable getSubscribable() {
        return subscribable;
    }
    public void setSubscribable(Subscribable subscribable) {
        this.subscribable = subscribable;
    }

}