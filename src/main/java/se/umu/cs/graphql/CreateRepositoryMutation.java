package se.umu.cs.graphql;

import java.util.*;

public interface CreateRepositoryMutation {

    CreateRepositoryPayload createRepository(CreateRepositoryInput input) throws Exception;

}