package se.umu.cs.graphql;

import java.util.*;

public interface CreatePullRequestMutation {

    CreatePullRequestPayload createPullRequest(CreatePullRequestInput input) throws Exception;

}