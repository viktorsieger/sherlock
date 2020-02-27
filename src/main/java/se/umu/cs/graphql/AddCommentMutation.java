package se.umu.cs.graphql;

import java.util.*;

public interface AddCommentMutation {

    AddCommentPayload addComment(AddCommentInput input) throws Exception;

}