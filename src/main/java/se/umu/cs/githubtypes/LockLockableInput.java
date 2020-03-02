package se.umu.cs.githubtypes;

public class LockLockableInput {

    private String clientMutationId;
    private LockReason lockReason;
    private String lockableId;

    public LockLockableInput() {
    }

    public LockLockableInput(String clientMutationId, LockReason lockReason, String lockableId) {
        this.clientMutationId = clientMutationId;
        this.lockReason = lockReason;
        this.lockableId = lockableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public LockReason getLockReason() {
        return lockReason;
    }
    public void setLockReason(LockReason lockReason) {
        this.lockReason = lockReason;
    }

    public String getLockableId() {
        return lockableId;
    }
    public void setLockableId(String lockableId) {
        this.lockableId = lockableId;
    }

}