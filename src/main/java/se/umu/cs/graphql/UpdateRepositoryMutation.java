package se.umu.cs.graphql;

import java.util.*;

public interface UpdateRepositoryMutation {

    UpdateRepositoryPayload updateRepository(UpdateRepositoryInput input) throws Exception;

}