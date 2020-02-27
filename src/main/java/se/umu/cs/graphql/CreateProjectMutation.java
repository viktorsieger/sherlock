package se.umu.cs.graphql;

import java.util.*;

public interface CreateProjectMutation {

    CreateProjectPayload createProject(CreateProjectInput input) throws Exception;

}