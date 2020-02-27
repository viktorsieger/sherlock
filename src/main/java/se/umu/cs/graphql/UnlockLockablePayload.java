package se.umu.cs.graphql;

import java.util.*;

public class UnlockLockablePayload {

    private Actor actor;
    private String clientMutationId;
    private Lockable unlockedRecord;

    public UnlockLockablePayload() {
    }

    public UnlockLockablePayload(Actor actor, String clientMutationId, Lockable unlockedRecord) {
        this.actor = actor;
        this.clientMutationId = clientMutationId;
        this.unlockedRecord = unlockedRecord;
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

    public Lockable getUnlockedRecord() {
        return unlockedRecord;
    }
    public void setUnlockedRecord(Lockable unlockedRecord) {
        this.unlockedRecord = unlockedRecord;
    }

}