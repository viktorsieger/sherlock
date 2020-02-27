package se.umu.cs.graphql;

import java.util.*;

public interface UpdateIssueMutation {

    UpdateIssuePayload updateIssue(UpdateIssueInput input) throws Exception;

}