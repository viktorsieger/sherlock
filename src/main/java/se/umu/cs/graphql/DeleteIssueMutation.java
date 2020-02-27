package se.umu.cs.graphql;

import java.util.*;

public interface DeleteIssueMutation {

    DeleteIssuePayload deleteIssue(DeleteIssueInput input) throws Exception;

}