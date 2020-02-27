package se.umu.cs.graphql;

import java.util.*;

public interface TransferIssueMutation {

    TransferIssuePayload transferIssue(TransferIssueInput input) throws Exception;

}