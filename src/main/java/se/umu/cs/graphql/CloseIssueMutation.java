package se.umu.cs.graphql;

import java.util.*;

public interface CloseIssueMutation {

    CloseIssuePayload closeIssue(CloseIssueInput input) throws Exception;

}