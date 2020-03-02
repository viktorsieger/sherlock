package se.umu.cs.githubtypes;

public interface RepositoryOwner {

    String getAvatarUrl();

    String getId();

    String getLogin();

    RepositoryConnection getPinnedRepositories();

    RepositoryConnection getRepositories();

    Repository getRepository();

    String getResourcePath();

    String getUrl();

}