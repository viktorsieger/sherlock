package se.umu.cs.graphql;

import java.util.*;

public interface MergePullRequestMutation {

    MergePullRequestPayload mergePullRequest(MergePullRequestInput input) throws Exception;

}