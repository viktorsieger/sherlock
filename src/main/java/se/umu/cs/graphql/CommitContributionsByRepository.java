package se.umu.cs.graphql;

import java.util.*;

public class CommitContributionsByRepository {

    private CreatedCommitContributionConnection contributions;
    private Repository repository;
    private String resourcePath;
    private String url;

    public CommitContributionsByRepository() {
    }

    public CommitContributionsByRepository(CreatedCommitContributionConnection contributions, Repository repository, String resourcePath, String url) {
        this.contributions = contributions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public CreatedCommitContributionConnection getContributions() {
        return contributions;
    }
    public void setContributions(CreatedCommitContributionConnection contributions) {
        this.contributions = contributions;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}