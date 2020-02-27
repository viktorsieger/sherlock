package se.umu.cs.graphql;

import java.util.*;

public interface RepositoryQuery {

    Repository repository(String name, String owner) throws Exception;

}