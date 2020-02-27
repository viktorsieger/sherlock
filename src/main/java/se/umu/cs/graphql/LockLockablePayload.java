package se.umu.cs.graphql;

import java.util.*;

public class LockLockablePayload {

    private Actor actor;
    private String clientMutationId;
    private Lockable lockedRecord;

    public LockLockablePayload() {
    }

    public LockLockablePayload(Actor actor, String clientMutationId, Lockable lockedRecord) {
        this.actor = actor;
        this.clientMutationId = clientMutationId;
        this.lockedRecord = lockedRecord;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Lockable getLockedRecord() {
        return lockedRecord;
    }
    public void setLockedRecord(Lockable lockedRecord) {
        this.lockedRecord = lockedRecord;
    }

}