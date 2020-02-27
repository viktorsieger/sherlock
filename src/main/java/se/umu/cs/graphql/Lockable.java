package se.umu.cs.graphql;

import java.util.*;

public interface Lockable {

    LockReason getActiveLockReason();

    Boolean getLocked();

}