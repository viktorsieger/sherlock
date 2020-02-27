package se.umu.cs.graphql;

import java.util.*;

public class IssueContributionsByRepository {

    private CreatedIssueContributionConnection contributions;
    private Repository repository;

    public IssueContributionsByRepository() {
    }

    public IssueContributionsByRepository(CreatedIssueContributionConnection contributions, Repository repository) {
        this.contributions = contributions;
        this.repository = repository;
    }

    public CreatedIssueContributionConnection getContributions() {
        return contributions;
    }
    public void setContributions(CreatedIssueContributionConnection contributions) {
        this.contributions = contributions;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}