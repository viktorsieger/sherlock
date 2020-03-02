package se.umu.cs.githubtypes;

public class ChangeUserStatusPayload {

    private String clientMutationId;
    private UserStatus status;

    public ChangeUserStatusPayload() {
    }

    public ChangeUserStatusPayload(String clientMutationId, UserStatus status) {
        this.clientMutationId = clientMutationId;
        this.status = status;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public UserStatus getStatus() {
        return status;
    }
    public void setStatus(UserStatus status) {
        this.status = status;
    }

}