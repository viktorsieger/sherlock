package se.umu.cs.graphql;

import java.util.*;

public class User implements Assignee, AuditEntryActor, EnterpriseMember, PushAllowanceActor, RequestedReviewer, ReviewDismissalAllowanceActor, SearchResultItem, Actor, Node, PackageOwner, ProfileOwner, ProjectOwner, RegistryPackageOwner, RegistryPackageSearch, RepositoryOwner, Sponsorable, UniformResourceLocatable{

    private Boolean anyPinnableItems;
    private String avatarUrl;
    private String bio;
    private String bioHTML;
    private CommitCommentConnection commitComments;
    private String company;
    private String companyHTML;
    private ContributionsCollection contributionsCollection;
    private String createdAt;
    private Integer databaseId;
    private String email;
    private FollowerConnection followers;
    private FollowingConnection following;
    private Gist gist;
    private GistCommentConnection gistComments;
    private GistConnection gists;
    private Hovercard hovercard;
    private String id;
    private Boolean isBountyHunter;
    private Boolean isCampusExpert;
    private Boolean isDeveloperProgramMember;
    private Boolean isEmployee;
    private Boolean isHireable;
    private Boolean isSiteAdmin;
    private Boolean isViewer;
    private IssueCommentConnection issueComments;
    private IssueConnection issues;
    private ProfileItemShowcase itemShowcase;
    private String location;
    private String login;
    private String name;
    private Organization organization;
    private OrganizationConnection organizations;
    private PackageConnection packages;
    private PinnableItemConnection pinnableItems;
    private PinnableItemConnection pinnedItems;
    private Integer pinnedItemsRemaining;
    private RepositoryConnection pinnedRepositories;
    private Project project;
    private ProjectConnection projects;
    private String projectsResourcePath;
    private String projectsUrl;
    private PublicKeyConnection publicKeys;
    private PullRequestConnection pullRequests;
    private RegistryPackageConnection registryPackages;
    private RegistryPackageConnection registryPackagesForQuery;
    private RepositoryConnection repositories;
    private RepositoryConnection repositoriesContributedTo;
    private Repository repository;
    private String resourcePath;
    private SavedReplyConnection savedReplies;
    private SponsorsListing sponsorsListing;
    private SponsorshipConnection sponsorshipsAsMaintainer;
    private SponsorshipConnection sponsorshipsAsSponsor;
    private StarredRepositoryConnection starredRepositories;
    private UserStatus status;
    private RepositoryConnection topRepositories;
    private String updatedAt;
    private String url;
    private Boolean viewerCanChangePinnedItems;
    private Boolean viewerCanCreateProjects;
    private Boolean viewerCanFollow;
    private Boolean viewerIsFollowing;
    private RepositoryConnection watching;
    private String websiteUrl;

    public User() {
    }

    public User(Boolean anyPinnableItems, String avatarUrl, String bio, String bioHTML, CommitCommentConnection commitComments, String company, String companyHTML, ContributionsCollection contributionsCollection, String createdAt, Integer databaseId, String email, FollowerConnection followers, FollowingConnection following, Gist gist, GistCommentConnection gistComments, GistConnection gists, Hovercard hovercard, String id, Boolean isBountyHunter, Boolean isCampusExpert, Boolean isDeveloperProgramMember, Boolean isEmployee, Boolean isHireable, Boolean isSiteAdmin, Boolean isViewer, IssueCommentConnection issueComments, IssueConnection issues, ProfileItemShowcase itemShowcase, String location, String login, String name, Organization organization, OrganizationConnection organizations, PackageConnection packages, PinnableItemConnection pinnableItems, PinnableItemConnection pinnedItems, Integer pinnedItemsRemaining, RepositoryConnection pinnedRepositories, Project project, ProjectConnection projects, String projectsResourcePath, String projectsUrl, PublicKeyConnection publicKeys, PullRequestConnection pullRequests, RegistryPackageConnection registryPackages, RegistryPackageConnection registryPackagesForQuery, RepositoryConnection repositories, RepositoryConnection repositoriesContributedTo, Repository repository, String resourcePath, SavedReplyConnection savedReplies, SponsorsListing sponsorsListing, SponsorshipConnection sponsorshipsAsMaintainer, SponsorshipConnection sponsorshipsAsSponsor, StarredRepositoryConnection starredRepositories, UserStatus status, RepositoryConnection topRepositories, String updatedAt, String url, Boolean viewerCanChangePinnedItems, Boolean viewerCanCreateProjects, Boolean viewerCanFollow, Boolean viewerIsFollowing, RepositoryConnection watching, String websiteUrl) {
        this.anyPinnableItems = anyPinnableItems;
        this.avatarUrl = avatarUrl;
        this.bio = bio;
        this.bioHTML = bioHTML;
        this.commitComments = commitComments;
        this.company = company;
        this.companyHTML = companyHTML;
        this.contributionsCollection = contributionsCollection;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.email = email;
        this.followers = followers;
        this.following = following;
        this.gist = gist;
        this.gistComments = gistComments;
        this.gists = gists;
        this.hovercard = hovercard;
        this.id = id;
        this.isBountyHunter = isBountyHunter;
        this.isCampusExpert = isCampusExpert;
        this.isDeveloperProgramMember = isDeveloperProgramMember;
        this.isEmployee = isEmployee;
        this.isHireable = isHireable;
        this.isSiteAdmin = isSiteAdmin;
        this.isViewer = isViewer;
        this.issueComments = issueComments;
        this.issues = issues;
        this.itemShowcase = itemShowcase;
        this.location = location;
        this.login = login;
        this.name = name;
        this.organization = organization;
        this.organizations = organizations;
        this.packages = packages;
        this.pinnableItems = pinnableItems;
        this.pinnedItems = pinnedItems;
        this.pinnedItemsRemaining = pinnedItemsRemaining;
        this.pinnedRepositories = pinnedRepositories;
        this.project = project;
        this.projects = projects;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.publicKeys = publicKeys;
        this.pullRequests = pullRequests;
        this.registryPackages = registryPackages;
        this.registryPackagesForQuery = registryPackagesForQuery;
        this.repositories = repositories;
        this.repositoriesContributedTo = repositoriesContributedTo;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.savedReplies = savedReplies;
        this.sponsorsListing = sponsorsListing;
        this.sponsorshipsAsMaintainer = sponsorshipsAsMaintainer;
        this.sponsorshipsAsSponsor = sponsorshipsAsSponsor;
        this.starredRepositories = starredRepositories;
        this.status = status;
        this.topRepositories = topRepositories;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanFollow = viewerCanFollow;
        this.viewerIsFollowing = viewerIsFollowing;
        this.watching = watching;
        this.websiteUrl = websiteUrl;
        this.email = email;
    }

    public Boolean getAnyPinnableItems() {
        return anyPinnableItems;
    }
    public void setAnyPinnableItems(Boolean anyPinnableItems) {
        this.anyPinnableItems = anyPinnableItems;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBioHTML() {
        return bioHTML;
    }
    public void setBioHTML(String bioHTML) {
        this.bioHTML = bioHTML;
    }

    public CommitCommentConnection getCommitComments() {
        return commitComments;
    }
    public void setCommitComments(CommitCommentConnection commitComments) {
        this.commitComments = commitComments;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyHTML() {
        return companyHTML;
    }
    public void setCompanyHTML(String companyHTML) {
        this.companyHTML = companyHTML;
    }

    public ContributionsCollection getContributionsCollection() {
        return contributionsCollection;
    }
    public void setContributionsCollection(ContributionsCollection contributionsCollection) {
        this.contributionsCollection = contributionsCollection;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public FollowerConnection getFollowers() {
        return followers;
    }
    public void setFollowers(FollowerConnection followers) {
        this.followers = followers;
    }

    public FollowingConnection getFollowing() {
        return following;
    }
    public void setFollowing(FollowingConnection following) {
        this.following = following;
    }

    public Gist getGist() {
        return gist;
    }
    public void setGist(Gist gist) {
        this.gist = gist;
    }

    public GistCommentConnection getGistComments() {
        return gistComments;
    }
    public void setGistComments(GistCommentConnection gistComments) {
        this.gistComments = gistComments;
    }

    public GistConnection getGists() {
        return gists;
    }
    public void setGists(GistConnection gists) {
        this.gists = gists;
    }

    public Hovercard getHovercard() {
        return hovercard;
    }
    public void setHovercard(Hovercard hovercard) {
        this.hovercard = hovercard;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsBountyHunter() {
        return isBountyHunter;
    }
    public void setIsBountyHunter(Boolean isBountyHunter) {
        this.isBountyHunter = isBountyHunter;
    }

    public Boolean getIsCampusExpert() {
        return isCampusExpert;
    }
    public void setIsCampusExpert(Boolean isCampusExpert) {
        this.isCampusExpert = isCampusExpert;
    }

    public Boolean getIsDeveloperProgramMember() {
        return isDeveloperProgramMember;
    }
    public void setIsDeveloperProgramMember(Boolean isDeveloperProgramMember) {
        this.isDeveloperProgramMember = isDeveloperProgramMember;
    }

    public Boolean getIsEmployee() {
        return isEmployee;
    }
    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public Boolean getIsHireable() {
        return isHireable;
    }
    public void setIsHireable(Boolean isHireable) {
        this.isHireable = isHireable;
    }

    public Boolean getIsSiteAdmin() {
        return isSiteAdmin;
    }
    public void setIsSiteAdmin(Boolean isSiteAdmin) {
        this.isSiteAdmin = isSiteAdmin;
    }

    public Boolean getIsViewer() {
        return isViewer;
    }
    public void setIsViewer(Boolean isViewer) {
        this.isViewer = isViewer;
    }

    public IssueCommentConnection getIssueComments() {
        return issueComments;
    }
    public void setIssueComments(IssueCommentConnection issueComments) {
        this.issueComments = issueComments;
    }

    public IssueConnection getIssues() {
        return issues;
    }
    public void setIssues(IssueConnection issues) {
        this.issues = issues;
    }

    public ProfileItemShowcase getItemShowcase() {
        return itemShowcase;
    }
    public void setItemShowcase(ProfileItemShowcase itemShowcase) {
        this.itemShowcase = itemShowcase;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public OrganizationConnection getOrganizations() {
        return organizations;
    }
    public void setOrganizations(OrganizationConnection organizations) {
        this.organizations = organizations;
    }

    public PackageConnection getPackages() {
        return packages;
    }
    public void setPackages(PackageConnection packages) {
        this.packages = packages;
    }

    public PinnableItemConnection getPinnableItems() {
        return pinnableItems;
    }
    public void setPinnableItems(PinnableItemConnection pinnableItems) {
        this.pinnableItems = pinnableItems;
    }

    public PinnableItemConnection getPinnedItems() {
        return pinnedItems;
    }
    public void setPinnedItems(PinnableItemConnection pinnedItems) {
        this.pinnedItems = pinnedItems;
    }

    public Integer getPinnedItemsRemaining() {
        return pinnedItemsRemaining;
    }
    public void setPinnedItemsRemaining(Integer pinnedItemsRemaining) {
        this.pinnedItemsRemaining = pinnedItemsRemaining;
    }

    public RepositoryConnection getPinnedRepositories() {
        return pinnedRepositories;
    }
    public void setPinnedRepositories(RepositoryConnection pinnedRepositories) {
        this.pinnedRepositories = pinnedRepositories;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectConnection getProjects() {
        return projects;
    }
    public void setProjects(ProjectConnection projects) {
        this.projects = projects;
    }

    public String getProjectsResourcePath() {
        return projectsResourcePath;
    }
    public void setProjectsResourcePath(String projectsResourcePath) {
        this.projectsResourcePath = projectsResourcePath;
    }

    public String getProjectsUrl() {
        return projectsUrl;
    }
    public void setProjectsUrl(String projectsUrl) {
        this.projectsUrl = projectsUrl;
    }

    public PublicKeyConnection getPublicKeys() {
        return publicKeys;
    }
    public void setPublicKeys(PublicKeyConnection publicKeys) {
        this.publicKeys = publicKeys;
    }

    public PullRequestConnection getPullRequests() {
        return pullRequests;
    }
    public void setPullRequests(PullRequestConnection pullRequests) {
        this.pullRequests = pullRequests;
    }

    public RegistryPackageConnection getRegistryPackages() {
        return registryPackages;
    }
    public void setRegistryPackages(RegistryPackageConnection registryPackages) {
        this.registryPackages = registryPackages;
    }

    public RegistryPackageConnection getRegistryPackagesForQuery() {
        return registryPackagesForQuery;
    }
    public void setRegistryPackagesForQuery(RegistryPackageConnection registryPackagesForQuery) {
        this.registryPackagesForQuery = registryPackagesForQuery;
    }

    public RepositoryConnection getRepositories() {
        return repositories;
    }
    public void setRepositories(RepositoryConnection repositories) {
        this.repositories = repositories;
    }

    public RepositoryConnection getRepositoriesContributedTo() {
        return repositoriesContributedTo;
    }
    public void setRepositoriesContributedTo(RepositoryConnection repositoriesContributedTo) {
        this.repositoriesContributedTo = repositoriesContributedTo;
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

    public SavedReplyConnection getSavedReplies() {
        return savedReplies;
    }
    public void setSavedReplies(SavedReplyConnection savedReplies) {
        this.savedReplies = savedReplies;
    }

    public SponsorsListing getSponsorsListing() {
        return sponsorsListing;
    }
    public void setSponsorsListing(SponsorsListing sponsorsListing) {
        this.sponsorsListing = sponsorsListing;
    }

    public SponsorshipConnection getSponsorshipsAsMaintainer() {
        return sponsorshipsAsMaintainer;
    }
    public void setSponsorshipsAsMaintainer(SponsorshipConnection sponsorshipsAsMaintainer) {
        this.sponsorshipsAsMaintainer = sponsorshipsAsMaintainer;
    }

    public SponsorshipConnection getSponsorshipsAsSponsor() {
        return sponsorshipsAsSponsor;
    }
    public void setSponsorshipsAsSponsor(SponsorshipConnection sponsorshipsAsSponsor) {
        this.sponsorshipsAsSponsor = sponsorshipsAsSponsor;
    }

    public StarredRepositoryConnection getStarredRepositories() {
        return starredRepositories;
    }
    public void setStarredRepositories(StarredRepositoryConnection starredRepositories) {
        this.starredRepositories = starredRepositories;
    }

    public UserStatus getStatus() {
        return status;
    }
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public RepositoryConnection getTopRepositories() {
        return topRepositories;
    }
    public void setTopRepositories(RepositoryConnection topRepositories) {
        this.topRepositories = topRepositories;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getViewerCanChangePinnedItems() {
        return viewerCanChangePinnedItems;
    }
    public void setViewerCanChangePinnedItems(Boolean viewerCanChangePinnedItems) {
        this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
    }

    public Boolean getViewerCanCreateProjects() {
        return viewerCanCreateProjects;
    }
    public void setViewerCanCreateProjects(Boolean viewerCanCreateProjects) {
        this.viewerCanCreateProjects = viewerCanCreateProjects;
    }

    public Boolean getViewerCanFollow() {
        return viewerCanFollow;
    }
    public void setViewerCanFollow(Boolean viewerCanFollow) {
        this.viewerCanFollow = viewerCanFollow;
    }

    public Boolean getViewerIsFollowing() {
        return viewerIsFollowing;
    }
    public void setViewerIsFollowing(Boolean viewerIsFollowing) {
        this.viewerIsFollowing = viewerIsFollowing;
    }

    public RepositoryConnection getWatching() {
        return watching;
    }
    public void setWatching(RepositoryConnection watching) {
        this.watching = watching;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

}