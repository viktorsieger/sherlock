package se.umu.cs.githubtypes;

public interface CreateRepositoryMutation {

    CreateRepositoryPayload createRepository(CreateRepositoryInput input) throws Exception;

}