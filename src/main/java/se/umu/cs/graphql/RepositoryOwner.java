package se.umu.cs.graphql;

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