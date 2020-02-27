package se.umu.cs.graphql;

import java.util.*;

public class UnlockLockableInput {

    private String clientMutationId;
    private String lockableId;

    public UnlockLockableInput() {
    }

    public UnlockLockableInput(String clientMutationId, String lockableId) {
        this.clientMutationId = clientMutationId;
        this.lockableId = lockableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getLockableId() {
        return lockableId;
    }
    public void setLockableId(String lockableId) {
        this.lockableId = lockableId;
    }

}