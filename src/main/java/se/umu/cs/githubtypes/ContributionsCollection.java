package se.umu.cs.githubtypes;

import java.util.Collection;

public class ContributionsCollection {

    private Collection<CommitContributionsByRepository> commitContributionsByRepository;
    private ContributionCalendar contributionCalendar;
    private Collection<Integer> contributionYears;
    private Boolean doesEndInCurrentMonth;
    private String earliestRestrictedContributionDate;
    private String endedAt;
    private CreatedIssueOrRestrictedContribution firstIssueContribution;
    private CreatedPullRequestOrRestrictedContribution firstPullRequestContribution;
    private CreatedRepositoryOrRestrictedContribution firstRepositoryContribution;
    private Boolean hasActivityInThePast;
    private Boolean hasAnyContributions;
    private Boolean hasAnyRestrictedContributions;
    private Boolean isSingleDay;
    private CreatedIssueContributionConnection issueContributions;
    private Collection<IssueContributionsByRepository> issueContributionsByRepository;
    private JoinedGitHubContribution joinedGitHubContribution;
    private String latestRestrictedContributionDate;
    private ContributionsCollection mostRecentCollectionWithActivity;
    private ContributionsCollection mostRecentCollectionWithoutActivity;
    private CreatedIssueContribution popularIssueContribution;
    private CreatedPullRequestContribution popularPullRequestContribution;
    private CreatedPullRequestContributionConnection pullRequestContributions;
    private Collection<PullRequestContributionsByRepository> pullRequestContributionsByRepository;
    private CreatedPullRequestReviewContributionConnection pullRequestReviewContributions;
    private Collection<PullRequestReviewContributionsByRepository> pullRequestReviewContributionsByRepository;
    private CreatedRepositoryContributionConnection repositoryContributions;
    private Integer restrictedContributionsCount;
    private String startedAt;
    private Integer totalCommitContributions;
    private Integer totalIssueContributions;
    private Integer totalPullRequestContributions;
    private Integer totalPullRequestReviewContributions;
    private Integer totalRepositoriesWithContributedCommits;
    private Integer totalRepositoriesWithContributedIssues;
    private Integer totalRepositoriesWithContributedPullRequestReviews;
    private Integer totalRepositoriesWithContributedPullRequests;
    private Integer totalRepositoryContributions;
    private User user;

    public ContributionsCollection() {
    }

    public ContributionsCollection(Collection<CommitContributionsByRepository> commitContributionsByRepository, ContributionCalendar contributionCalendar, Collection<Integer> contributionYears, Boolean doesEndInCurrentMonth, String earliestRestrictedContributionDate, String endedAt, CreatedIssueOrRestrictedContribution firstIssueContribution, CreatedPullRequestOrRestrictedContribution firstPullRequestContribution, CreatedRepositoryOrRestrictedContribution firstRepositoryContribution, Boolean hasActivityInThePast, Boolean hasAnyContributions, Boolean hasAnyRestrictedContributions, Boolean isSingleDay, CreatedIssueContributionConnection issueContributions, Collection<IssueContributionsByRepository> issueContributionsByRepository, JoinedGitHubContribution joinedGitHubContribution, String latestRestrictedContributionDate, ContributionsCollection mostRecentCollectionWithActivity, ContributionsCollection mostRecentCollectionWithoutActivity, CreatedIssueContribution popularIssueContribution, CreatedPullRequestContribution popularPullRequestContribution, CreatedPullRequestContributionConnection pullRequestContributions, Collection<PullRequestContributionsByRepository> pullRequestContributionsByRepository, CreatedPullRequestReviewContributionConnection pullRequestReviewContributions, Collection<PullRequestReviewContributionsByRepository> pullRequestReviewContributionsByRepository, CreatedRepositoryContributionConnection repositoryContributions, Integer restrictedContributionsCount, String startedAt, Integer totalCommitContributions, Integer totalIssueContributions, Integer totalPullRequestContributions, Integer totalPullRequestReviewContributions, Integer totalRepositoriesWithContributedCommits, Integer totalRepositoriesWithContributedIssues, Integer totalRepositoriesWithContributedPullRequestReviews, Integer totalRepositoriesWithContributedPullRequests, Integer totalRepositoryContributions, User user) {
        this.commitContributionsByRepository = commitContributionsByRepository;
        this.contributionCalendar = contributionCalendar;
        this.contributionYears = contributionYears;
        this.doesEndInCurrentMonth = doesEndInCurrentMonth;
        this.earliestRestrictedContributionDate = earliestRestrictedContributionDate;
        this.endedAt = endedAt;
        this.firstIssueContribution = firstIssueContribution;
        this.firstPullRequestContribution = firstPullRequestContribution;
        this.firstRepositoryContribution = firstRepositoryContribution;
        this.hasActivityInThePast = hasActivityInThePast;
        this.hasAnyContributions = hasAnyContributions;
        this.hasAnyRestrictedContributions = hasAnyRestrictedContributions;
        this.isSingleDay = isSingleDay;
        this.issueContributions = issueContributions;
        this.issueContributionsByRepository = issueContributionsByRepository;
        this.joinedGitHubContribution = joinedGitHubContribution;
        this.latestRestrictedContributionDate = latestRestrictedContributionDate;
        this.mostRecentCollectionWithActivity = mostRecentCollectionWithActivity;
        this.mostRecentCollectionWithoutActivity = mostRecentCollectionWithoutActivity;
        this.popularIssueContribution = popularIssueContribution;
        this.popularPullRequestContribution = popularPullRequestContribution;
        this.pullRequestContributions = pullRequestContributions;
        this.pullRequestContributionsByRepository = pullRequestContributionsByRepository;
        this.pullRequestReviewContributions = pullRequestReviewContributions;
        this.pullRequestReviewContributionsByRepository = pullRequestReviewContributionsByRepository;
        this.repositoryContributions = repositoryContributions;
        this.restrictedContributionsCount = restrictedContributionsCount;
        this.startedAt = startedAt;
        this.totalCommitContributions = totalCommitContributions;
        this.totalIssueContributions = totalIssueContributions;
        this.totalPullRequestContributions = totalPullRequestContributions;
        this.totalPullRequestReviewContributions = totalPullRequestReviewContributions;
        this.totalRepositoriesWithContributedCommits = totalRepositoriesWithContributedCommits;
        this.totalRepositoriesWithContributedIssues = totalRepositoriesWithContributedIssues;
        this.totalRepositoriesWithContributedPullRequestReviews = totalRepositoriesWithContributedPullRequestReviews;
        this.totalRepositoriesWithContributedPullRequests = totalRepositoriesWithContributedPullRequests;
        this.totalRepositoryContributions = totalRepositoryContributions;
        this.user = user;
    }

    public Collection<CommitContributionsByRepository> getCommitContributionsByRepository() {
        return commitContributionsByRepository;
    }
    public void setCommitContributionsByRepository(Collection<CommitContributionsByRepository> commitContributionsByRepository) {
        this.commitContributionsByRepository = commitContributionsByRepository;
    }

    public ContributionCalendar getContributionCalendar() {
        return contributionCalendar;
    }
    public void setContributionCalendar(ContributionCalendar contributionCalendar) {
        this.contributionCalendar = contributionCalendar;
    }

    public Collection<Integer> getContributionYears() {
        return contributionYears;
    }
    public void setContributionYears(Collection<Integer> contributionYears) {
        this.contributionYears = contributionYears;
    }

    public Boolean getDoesEndInCurrentMonth() {
        return doesEndInCurrentMonth;
    }
    public void setDoesEndInCurrentMonth(Boolean doesEndInCurrentMonth) {
        this.doesEndInCurrentMonth = doesEndInCurrentMonth;
    }

    public String getEarliestRestrictedContributionDate() {
        return earliestRestrictedContributionDate;
    }
    public void setEarliestRestrictedContributionDate(String earliestRestrictedContributionDate) {
        this.earliestRestrictedContributionDate = earliestRestrictedContributionDate;
    }

    public String getEndedAt() {
        return endedAt;
    }
    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }

    public CreatedIssueOrRestrictedContribution getFirstIssueContribution() {
        return firstIssueContribution;
    }
    public void setFirstIssueContribution(CreatedIssueOrRestrictedContribution firstIssueContribution) {
        this.firstIssueContribution = firstIssueContribution;
    }

    public CreatedPullRequestOrRestrictedContribution getFirstPullRequestContribution() {
        return firstPullRequestContribution;
    }
    public void setFirstPullRequestContribution(CreatedPullRequestOrRestrictedContribution firstPullRequestContribution) {
        this.firstPullRequestContribution = firstPullRequestContribution;
    }

    public CreatedRepositoryOrRestrictedContribution getFirstRepositoryContribution() {
        return firstRepositoryContribution;
    }
    public void setFirstRepositoryContribution(CreatedRepositoryOrRestrictedContribution firstRepositoryContribution) {
        this.firstRepositoryContribution = firstRepositoryContribution;
    }

    public Boolean getHasActivityInThePast() {
        return hasActivityInThePast;
    }
    public void setHasActivityInThePast(Boolean hasActivityInThePast) {
        this.hasActivityInThePast = hasActivityInThePast;
    }

    public Boolean getHasAnyContributions() {
        return hasAnyContributions;
    }
    public void setHasAnyContributions(Boolean hasAnyContributions) {
        this.hasAnyContributions = hasAnyContributions;
    }

    public Boolean getHasAnyRestrictedContributions() {
        return hasAnyRestrictedContributions;
    }
    public void setHasAnyRestrictedContributions(Boolean hasAnyRestrictedContributions) {
        this.hasAnyRestrictedContributions = hasAnyRestrictedContributions;
    }

    public Boolean getIsSingleDay() {
        return isSingleDay;
    }
    public void setIsSingleDay(Boolean isSingleDay) {
        this.isSingleDay = isSingleDay;
    }

    public CreatedIssueContributionConnection getIssueContributions() {
        return issueContributions;
    }
    public void setIssueContributions(CreatedIssueContributionConnection issueContributions) {
        this.issueContributions = issueContributions;
    }

    public Collection<IssueContributionsByRepository> getIssueContributionsByRepository() {
        return issueContributionsByRepository;
    }
    public void setIssueContributionsByRepository(Collection<IssueContributionsByRepository> issueContributionsByRepository) {
        this.issueContributionsByRepository = issueContributionsByRepository;
    }

    public JoinedGitHubContribution getJoinedGitHubContribution() {
        return joinedGitHubContribution;
    }
    public void setJoinedGitHubContribution(JoinedGitHubContribution joinedGitHubContribution) {
        this.joinedGitHubContribution = joinedGitHubContribution;
    }

    public String getLatestRestrictedContributionDate() {
        return latestRestrictedContributionDate;
    }
    public void setLatestRestrictedContributionDate(String latestRestrictedContributionDate) {
        this.latestRestrictedContributionDate = latestRestrictedContributionDate;
    }

    public ContributionsCollection getMostRecentCollectionWithActivity() {
        return mostRecentCollectionWithActivity;
    }
    public void setMostRecentCollectionWithActivity(ContributionsCollection mostRecentCollectionWithActivity) {
        this.mostRecentCollectionWithActivity = mostRecentCollectionWithActivity;
    }

    public ContributionsCollection getMostRecentCollectionWithoutActivity() {
        return mostRecentCollectionWithoutActivity;
    }
    public void setMostRecentCollectionWithoutActivity(ContributionsCollection mostRecentCollectionWithoutActivity) {
        this.mostRecentCollectionWithoutActivity = mostRecentCollectionWithoutActivity;
    }

    public CreatedIssueContribution getPopularIssueContribution() {
        return popularIssueContribution;
    }
    public void setPopularIssueContribution(CreatedIssueContribution popularIssueContribution) {
        this.popularIssueContribution = popularIssueContribution;
    }

    public CreatedPullRequestContribution getPopularPullRequestContribution() {
        return popularPullRequestContribution;
    }
    public void setPopularPullRequestContribution(CreatedPullRequestContribution popularPullRequestContribution) {
        this.popularPullRequestContribution = popularPullRequestContribution;
    }

    public CreatedPullRequestContributionConnection getPullRequestContributions() {
        return pullRequestContributions;
    }
    public void setPullRequestContributions(CreatedPullRequestContributionConnection pullRequestContributions) {
        this.pullRequestContributions = pullRequestContributions;
    }

    public Collection<PullRequestContributionsByRepository> getPullRequestContributionsByRepository() {
        return pullRequestContributionsByRepository;
    }
    public void setPullRequestContributionsByRepository(Collection<PullRequestContributionsByRepository> pullRequestContributionsByRepository) {
        this.pullRequestContributionsByRepository = pullRequestContributionsByRepository;
    }

    public CreatedPullRequestReviewContributionConnection getPullRequestReviewContributions() {
        return pullRequestReviewContributions;
    }
    public void setPullRequestReviewContributions(CreatedPullRequestReviewContributionConnection pullRequestReviewContributions) {
        this.pullRequestReviewContributions = pullRequestReviewContributions;
    }

    public Collection<PullRequestReviewContributionsByRepository> getPullRequestReviewContributionsByRepository() {
        return pullRequestReviewContributionsByRepository;
    }
    public void setPullRequestReviewContributionsByRepository(Collection<PullRequestReviewContributionsByRepository> pullRequestReviewContributionsByRepository) {
        this.pullRequestReviewContributionsByRepository = pullRequestReviewContributionsByRepository;
    }

    public CreatedRepositoryContributionConnection getRepositoryContributions() {
        return repositoryContributions;
    }
    public void setRepositoryContributions(CreatedRepositoryContributionConnection repositoryContributions) {
        this.repositoryContributions = repositoryContributions;
    }

    public Integer getRestrictedContributionsCount() {
        return restrictedContributionsCount;
    }
    public void setRestrictedContributionsCount(Integer restrictedContributionsCount) {
        this.restrictedContributionsCount = restrictedContributionsCount;
    }

    public String getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public Integer getTotalCommitContributions() {
        return totalCommitContributions;
    }
    public void setTotalCommitContributions(Integer totalCommitContributions) {
        this.totalCommitContributions = totalCommitContributions;
    }

    public Integer getTotalIssueContributions() {
        return totalIssueContributions;
    }
    public void setTotalIssueContributions(Integer totalIssueContributions) {
        this.totalIssueContributions = totalIssueContributions;
    }

    public Integer getTotalPullRequestContributions() {
        return totalPullRequestContributions;
    }
    public void setTotalPullRequestContributions(Integer totalPullRequestContributions) {
        this.totalPullRequestContributions = totalPullRequestContributions;
    }

    public Integer getTotalPullRequestReviewContributions() {
        return totalPullRequestReviewContributions;
    }
    public void setTotalPullRequestReviewContributions(Integer totalPullRequestReviewContributions) {
        this.totalPullRequestReviewContributions = totalPullRequestReviewContributions;
    }

    public Integer getTotalRepositoriesWithContributedCommits() {
        return totalRepositoriesWithContributedCommits;
    }
    public void setTotalRepositoriesWithContributedCommits(Integer totalRepositoriesWithContributedCommits) {
        this.totalRepositoriesWithContributedCommits = totalRepositoriesWithContributedCommits;
    }

    public Integer getTotalRepositoriesWithContributedIssues() {
        return totalRepositoriesWithContributedIssues;
    }
    public void setTotalRepositoriesWithContributedIssues(Integer totalRepositoriesWithContributedIssues) {
        this.totalRepositoriesWithContributedIssues = totalRepositoriesWithContributedIssues;
    }

    public Integer getTotalRepositoriesWithContributedPullRequestReviews() {
        return totalRepositoriesWithContributedPullRequestReviews;
    }
    public void setTotalRepositoriesWithContributedPullRequestReviews(Integer totalRepositoriesWithContributedPullRequestReviews) {
        this.totalRepositoriesWithContributedPullRequestReviews = totalRepositoriesWithContributedPullRequestReviews;
    }

    public Integer getTotalRepositoriesWithContributedPullRequests() {
        return totalRepositoriesWithContributedPullRequests;
    }
    public void setTotalRepositoriesWithContributedPullRequests(Integer totalRepositoriesWithContributedPullRequests) {
        this.totalRepositoriesWithContributedPullRequests = totalRepositoriesWithContributedPullRequests;
    }

    public Integer getTotalRepositoryContributions() {
        return totalRepositoryContributions;
    }
    public void setTotalRepositoryContributions(Integer totalRepositoryContributions) {
        this.totalRepositoryContributions = totalRepositoryContributions;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}