package se.umu.cs.githubtypes;

public class UpdateSubscriptionInput {

    private String clientMutationId;
    private SubscriptionState state;
    private String subscribableId;

    public UpdateSubscriptionInput() {
    }

    public UpdateSubscriptionInput(String clientMutationId, SubscriptionState state, String subscribableId) {
        this.clientMutationId = clientMutationId;
        this.state = state;
        this.subscribableId = subscribableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public SubscriptionState getState() {
        return state;
    }
    public void setState(SubscriptionState state) {
        this.state = state;
    }

    public String getSubscribableId() {
        return subscribableId;
    }
    public void setSubscribableId(String subscribableId) {
        this.subscribableId = subscribableId;
    }

}