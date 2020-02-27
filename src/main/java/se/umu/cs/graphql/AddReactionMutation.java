package se.umu.cs.graphql;

import java.util.*;

public interface AddReactionMutation {

    AddReactionPayload addReaction(AddReactionInput input) throws Exception;

}