package se.umu.cs.graphql;

import java.util.*;

public interface UnfollowUserMutation {

    UnfollowUserPayload unfollowUser(UnfollowUserInput input) throws Exception;

}