package se.umu.cs.graphql;

import java.util.*;

public interface CreateIssueMutation {

    CreateIssuePayload createIssue(CreateIssueInput input) throws Exception;

}