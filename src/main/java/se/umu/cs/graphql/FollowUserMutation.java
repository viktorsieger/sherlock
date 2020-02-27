package se.umu.cs.graphql;

import java.util.*;

public interface FollowUserMutation {

    FollowUserPayload followUser(FollowUserInput input) throws Exception;

}