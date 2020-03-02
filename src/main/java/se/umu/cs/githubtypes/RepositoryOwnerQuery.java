package se.umu.cs.githubtypes;

public interface RepositoryOwnerQuery {

    RepositoryOwner repositoryOwner(String login) throws Exception;

}