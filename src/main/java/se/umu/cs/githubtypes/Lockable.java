package se.umu.cs.githubtypes;

public interface Lockable {

    LockReason getActiveLockReason();

    Boolean getLocked();

}