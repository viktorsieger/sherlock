package se.umu.cs.githubtypes;

public interface MergeBranchMutation {

    MergeBranchPayload mergeBranch(MergeBranchInput input) throws Exception;

}