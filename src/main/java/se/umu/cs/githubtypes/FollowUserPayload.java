package se.umu.cs.githubtypes;

public class FollowUserPayload {

    private String clientMutationId;
    private User user;

    public FollowUserPayload() {
    }

    public FollowUserPayload(String clientMutationId, User user) {
        this.clientMutationId = clientMutationId;
        this.user = user;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}