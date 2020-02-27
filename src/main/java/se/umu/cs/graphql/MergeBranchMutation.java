package se.umu.cs.graphql;

import java.util.*;

public interface MergeBranchMutation {

    MergeBranchPayload mergeBranch(MergeBranchInput input) throws Exception;

}