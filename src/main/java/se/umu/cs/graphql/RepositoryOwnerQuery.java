package se.umu.cs.graphql;

import java.util.*;

public interface RepositoryOwnerQuery {

    RepositoryOwner repositoryOwner(String login) throws Exception;

}