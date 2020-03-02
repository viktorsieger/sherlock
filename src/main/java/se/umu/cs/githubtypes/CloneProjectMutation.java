package se.umu.cs.githubtypes;

public interface CloneProjectMutation {

    CloneProjectPayload cloneProject(CloneProjectInput input) throws Exception;

}