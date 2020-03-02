package se.umu.cs.githubtypes;

public class PullRequestReviewContributionsByRepository {

    private CreatedPullRequestReviewContributionConnection contributions;
    private Repository repository;

    public PullRequestReviewContributionsByRepository() {
    }

    public PullRequestReviewContributionsByRepository(CreatedPullRequestReviewContributionConnection contributions, Repository repository) {
        this.contributions = contributions;
        this.repository = repository;
    }

    public CreatedPullRequestReviewContributionConnection getContributions() {
        return contributions;
    }
    public void setContributions(CreatedPullRequestReviewContributionConnection contributions) {
        this.contributions = contributions;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}