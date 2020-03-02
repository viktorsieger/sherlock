package se.umu.cs.githubtypes;

public interface RepositoryQuery {

    Repository repository(String name, String owner) throws Exception;

}