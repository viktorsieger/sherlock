package se.umu.cs.graphql;

import java.util.*;

public interface ChangeUserStatusMutation {

    ChangeUserStatusPayload changeUserStatus(ChangeUserStatusInput input) throws Exception;

}