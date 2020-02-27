package se.umu.cs.graphql;

import java.util.*;

public interface ClosePullRequestMutation {

    ClosePullRequestPayload closePullRequest(ClosePullRequestInput input) throws Exception;

}