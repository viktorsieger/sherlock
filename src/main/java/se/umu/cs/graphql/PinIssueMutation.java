package se.umu.cs.graphql;

import java.util.*;

public interface PinIssueMutation {

    PinIssuePayload pinIssue(PinIssueInput input) throws Exception;

}