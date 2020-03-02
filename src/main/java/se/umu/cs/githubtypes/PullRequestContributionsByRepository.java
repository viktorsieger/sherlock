package se.umu.cs.githubtypes;

public class PullRequestContributionsByRepository {

    private CreatedPullRequestContributionConnection contributions;
    private Repository repository;

    public PullRequestContributionsByRepository() {
    }

    public PullRequestContributionsByRepository(CreatedPullRequestContributionConnection contributions, Repository repository) {
        this.contributions = contributions;
        this.repository = repository;
    }

    public CreatedPullRequestContributionConnection getContributions() {
        return contributions;
    }
    public void setContributions(CreatedPullRequestContributionConnection contributions) {
        this.contributions = contributions;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}