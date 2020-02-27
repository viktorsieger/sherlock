package se.umu.cs.graphql;

import java.util.*;

public class Repository implements PermissionGranter, PinnableItem, SearchResultItem, Node, PackageOwner, ProjectOwner, RegistryPackageOwner, RegistryPackageSearch, RepositoryInfo, Starrable, Subscribable, UniformResourceLocatable{

    private UserConnection assignableUsers;
    private BranchProtectionRuleConnection branchProtectionRules;
    private CodeOfConduct codeOfConduct;
    private RepositoryCollaboratorConnection collaborators;
    private CommitCommentConnection commitComments;
    private String createdAt;
    private Integer databaseId;
    private Ref defaultBranchRef;
    private Boolean deleteBranchOnMerge;
    private DependencyGraphManifestConnection dependencyGraphManifests;
    private DeployKeyConnection deployKeys;
    private DeploymentConnection deployments;
    private String description;
    private String descriptionHTML;
    private Integer diskUsage;
    private Integer forkCount;
    private RepositoryConnection forks;
    private Collection<FundingLink> fundingLinks;
    private Boolean hasIssuesEnabled;
    private Boolean hasProjectsEnabled;
    private Boolean hasWikiEnabled;
    private String homepageUrl;
    private String id;
    private Boolean isArchived;
    private Boolean isDisabled;
    private Boolean isFork;
    private Boolean isLocked;
    private Boolean isMirror;
    private Boolean isPrivate;
    private Boolean isTemplate;
    private Issue issue;
    private IssueOrPullRequest issueOrPullRequest;
    private IssueConnection issues;
    private Label label;
    private LabelConnection labels;
    private LanguageConnection languages;
    private License licenseInfo;
    private RepositoryLockReason lockReason;
    private UserConnection mentionableUsers;
    private Boolean mergeCommitAllowed;
    private Milestone milestone;
    private MilestoneConnection milestones;
    private String mirrorUrl;
    private String name;
    private String nameWithOwner;
    private GitObject object;
    private String openGraphImageUrl;
    private RepositoryOwner owner;
    private PackageConnection packages;
    private Repository parent;
    private PinnedIssueConnection pinnedIssues;
    private Language primaryLanguage;
    private Project project;
    private ProjectConnection projects;
    private String projectsResourcePath;
    private String projectsUrl;
    private PullRequest pullRequest;
    private PullRequestConnection pullRequests;
    private String pushedAt;
    private Boolean rebaseMergeAllowed;
    private Ref ref;
    private RefConnection refs;
    private RegistryPackageConnection registryPackages;
    private RegistryPackageConnection registryPackagesForQuery;
    private Release release;
    private ReleaseConnection releases;
    private RepositoryTopicConnection repositoryTopics;
    private String resourcePath;
    private String shortDescriptionHTML;
    private Boolean squashMergeAllowed;
    private String sshUrl;
    private StargazerConnection stargazers;
    private String tempCloneToken;
    private Repository templateRepository;
    private String updatedAt;
    private String url;
    private Boolean usesCustomOpenGraphImage;
    private Boolean viewerCanAdminister;
    private Boolean viewerCanCreateProjects;
    private Boolean viewerCanSubscribe;
    private Boolean viewerCanUpdateTopics;
    private Boolean viewerHasStarred;
    private RepositoryPermission viewerPermission;
    private SubscriptionState viewerSubscription;
    private RepositoryVulnerabilityAlertConnection vulnerabilityAlerts;
    private UserConnection watchers;

    public Repository() {
    }

    public Repository(UserConnection assignableUsers, BranchProtectionRuleConnection branchProtectionRules, CodeOfConduct codeOfConduct, RepositoryCollaboratorConnection collaborators, CommitCommentConnection commitComments, String createdAt, Integer databaseId, Ref defaultBranchRef, Boolean deleteBranchOnMerge, DependencyGraphManifestConnection dependencyGraphManifests, DeployKeyConnection deployKeys, DeploymentConnection deployments, String description, String descriptionHTML, Integer diskUsage, Integer forkCount, RepositoryConnection forks, Collection<FundingLink> fundingLinks, Boolean hasIssuesEnabled, Boolean hasProjectsEnabled, Boolean hasWikiEnabled, String homepageUrl, String id, Boolean isArchived, Boolean isDisabled, Boolean isFork, Boolean isLocked, Boolean isMirror, Boolean isPrivate, Boolean isTemplate, Issue issue, IssueOrPullRequest issueOrPullRequest, IssueConnection issues, Label label, LabelConnection labels, LanguageConnection languages, License licenseInfo, RepositoryLockReason lockReason, UserConnection mentionableUsers, Boolean mergeCommitAllowed, Milestone milestone, MilestoneConnection milestones, String mirrorUrl, String name, String nameWithOwner, GitObject object, String openGraphImageUrl, RepositoryOwner owner, PackageConnection packages, Repository parent, PinnedIssueConnection pinnedIssues, Language primaryLanguage, Project project, ProjectConnection projects, String projectsResourcePath, String projectsUrl, PullRequest pullRequest, PullRequestConnection pullRequests, String pushedAt, Boolean rebaseMergeAllowed, Ref ref, RefConnection refs, RegistryPackageConnection registryPackages, RegistryPackageConnection registryPackagesForQuery, Release release, ReleaseConnection releases, RepositoryTopicConnection repositoryTopics, String resourcePath, String shortDescriptionHTML, Boolean squashMergeAllowed, String sshUrl, StargazerConnection stargazers, String tempCloneToken, Repository templateRepository, String updatedAt, String url, Boolean usesCustomOpenGraphImage, Boolean viewerCanAdminister, Boolean viewerCanCreateProjects, Boolean viewerCanSubscribe, Boolean viewerCanUpdateTopics, Boolean viewerHasStarred, RepositoryPermission viewerPermission, SubscriptionState viewerSubscription, RepositoryVulnerabilityAlertConnection vulnerabilityAlerts, UserConnection watchers) {
        this.assignableUsers = assignableUsers;
        this.branchProtectionRules = branchProtectionRules;
        this.codeOfConduct = codeOfConduct;
        this.collaborators = collaborators;
        this.commitComments = commitComments;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.defaultBranchRef = defaultBranchRef;
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        this.dependencyGraphManifests = dependencyGraphManifests;
        this.deployKeys = deployKeys;
        this.deployments = deployments;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.diskUsage = diskUsage;
        this.forkCount = forkCount;
        this.forks = forks;
        this.fundingLinks = fundingLinks;
        this.hasIssuesEnabled = hasIssuesEnabled;
        this.hasProjectsEnabled = hasProjectsEnabled;
        this.hasWikiEnabled = hasWikiEnabled;
        this.homepageUrl = homepageUrl;
        this.id = id;
        this.isArchived = isArchived;
        this.isDisabled = isDisabled;
        this.isFork = isFork;
        this.isLocked = isLocked;
        this.isMirror = isMirror;
        this.isPrivate = isPrivate;
        this.isTemplate = isTemplate;
        this.issue = issue;
        this.issueOrPullRequest = issueOrPullRequest;
        this.issues = issues;
        this.label = label;
        this.labels = labels;
        this.languages = languages;
        this.licenseInfo = licenseInfo;
        this.lockReason = lockReason;
        this.mentionableUsers = mentionableUsers;
        this.mergeCommitAllowed = mergeCommitAllowed;
        this.milestone = milestone;
        this.milestones = milestones;
        this.mirrorUrl = mirrorUrl;
        this.name = name;
        this.nameWithOwner = nameWithOwner;
        this.object = object;
        this.openGraphImageUrl = openGraphImageUrl;
        this.owner = owner;
        this.packages = packages;
        this.parent = parent;
        this.pinnedIssues = pinnedIssues;
        this.primaryLanguage = primaryLanguage;
        this.project = project;
        this.projects = projects;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.pullRequest = pullRequest;
        this.pullRequests = pullRequests;
        this.pushedAt = pushedAt;
        this.rebaseMergeAllowed = rebaseMergeAllowed;
        this.ref = ref;
        this.refs = refs;
        this.registryPackages = registryPackages;
        this.registryPackagesForQuery = registryPackagesForQuery;
        this.release = release;
        this.releases = releases;
        this.repositoryTopics = repositoryTopics;
        this.resourcePath = resourcePath;
        this.shortDescriptionHTML = shortDescriptionHTML;
        this.squashMergeAllowed = squashMergeAllowed;
        this.sshUrl = sshUrl;
        this.stargazers = stargazers;
        this.tempCloneToken = tempCloneToken;
        this.templateRepository = templateRepository;
        this.updatedAt = updatedAt;
        this.url = url;
        this.usesCustomOpenGraphImage = usesCustomOpenGraphImage;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerCanUpdateTopics = viewerCanUpdateTopics;
        this.viewerHasStarred = viewerHasStarred;
        this.viewerPermission = viewerPermission;
        this.viewerSubscription = viewerSubscription;
        this.vulnerabilityAlerts = vulnerabilityAlerts;
        this.watchers = watchers;
    }

    public UserConnection getAssignableUsers() {
        return assignableUsers;
    }
    public void setAssignableUsers(UserConnection assignableUsers) {
        this.assignableUsers = assignableUsers;
    }

    public BranchProtectionRuleConnection getBranchProtectionRules() {
        return branchProtectionRules;
    }
    public void setBranchProtectionRules(BranchProtectionRuleConnection branchProtectionRules) {
        this.branchProtectionRules = branchProtectionRules;
    }

    public CodeOfConduct getCodeOfConduct() {
        return codeOfConduct;
    }
    public void setCodeOfConduct(CodeOfConduct codeOfConduct) {
        this.codeOfConduct = codeOfConduct;
    }

    public RepositoryCollaboratorConnection getCollaborators() {
        return collaborators;
    }
    public void setCollaborators(RepositoryCollaboratorConnection collaborators) {
        this.collaborators = collaborators;
    }

    public CommitCommentConnection getCommitComments() {
        return commitComments;
    }
    public void setCommitComments(CommitCommentConnection commitComments) {
        this.commitComments = commitComments;
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

    public Ref getDefaultBranchRef() {
        return defaultBranchRef;
    }
    public void setDefaultBranchRef(Ref defaultBranchRef) {
        this.defaultBranchRef = defaultBranchRef;
    }

    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }
    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    public DependencyGraphManifestConnection getDependencyGraphManifests() {
        return dependencyGraphManifests;
    }
    public void setDependencyGraphManifests(DependencyGraphManifestConnection dependencyGraphManifests) {
        this.dependencyGraphManifests = dependencyGraphManifests;
    }

    public DeployKeyConnection getDeployKeys() {
        return deployKeys;
    }
    public void setDeployKeys(DeployKeyConnection deployKeys) {
        this.deployKeys = deployKeys;
    }

    public DeploymentConnection getDeployments() {
        return deployments;
    }
    public void setDeployments(DeploymentConnection deployments) {
        this.deployments = deployments;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionHTML() {
        return descriptionHTML;
    }
    public void setDescriptionHTML(String descriptionHTML) {
        this.descriptionHTML = descriptionHTML;
    }

    public Integer getDiskUsage() {
        return diskUsage;
    }
    public void setDiskUsage(Integer diskUsage) {
        this.diskUsage = diskUsage;
    }

    public Integer getForkCount() {
        return forkCount;
    }
    public void setForkCount(Integer forkCount) {
        this.forkCount = forkCount;
    }

    public RepositoryConnection getForks() {
        return forks;
    }
    public void setForks(RepositoryConnection forks) {
        this.forks = forks;
    }

    public Collection<FundingLink> getFundingLinks() {
        return fundingLinks;
    }
    public void setFundingLinks(Collection<FundingLink> fundingLinks) {
        this.fundingLinks = fundingLinks;
    }

    public Boolean getHasIssuesEnabled() {
        return hasIssuesEnabled;
    }
    public void setHasIssuesEnabled(Boolean hasIssuesEnabled) {
        this.hasIssuesEnabled = hasIssuesEnabled;
    }

    public Boolean getHasProjectsEnabled() {
        return hasProjectsEnabled;
    }
    public void setHasProjectsEnabled(Boolean hasProjectsEnabled) {
        this.hasProjectsEnabled = hasProjectsEnabled;
    }

    public Boolean getHasWikiEnabled() {
        return hasWikiEnabled;
    }
    public void setHasWikiEnabled(Boolean hasWikiEnabled) {
        this.hasWikiEnabled = hasWikiEnabled;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }
    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsFork() {
        return isFork;
    }
    public void setIsFork(Boolean isFork) {
        this.isFork = isFork;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Boolean getIsMirror() {
        return isMirror;
    }
    public void setIsMirror(Boolean isMirror) {
        this.isMirror = isMirror;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Boolean getIsTemplate() {
        return isTemplate;
    }
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Issue getIssue() {
        return issue;
    }
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public IssueOrPullRequest getIssueOrPullRequest() {
        return issueOrPullRequest;
    }
    public void setIssueOrPullRequest(IssueOrPullRequest issueOrPullRequest) {
        this.issueOrPullRequest = issueOrPullRequest;
    }

    public IssueConnection getIssues() {
        return issues;
    }
    public void setIssues(IssueConnection issues) {
        this.issues = issues;
    }

    public Label getLabel() {
        return label;
    }
    public void setLabel(Label label) {
        this.label = label;
    }

    public LabelConnection getLabels() {
        return labels;
    }
    public void setLabels(LabelConnection labels) {
        this.labels = labels;
    }

    public LanguageConnection getLanguages() {
        return languages;
    }
    public void setLanguages(LanguageConnection languages) {
        this.languages = languages;
    }

    public License getLicenseInfo() {
        return licenseInfo;
    }
    public void setLicenseInfo(License licenseInfo) {
        this.licenseInfo = licenseInfo;
    }

    public RepositoryLockReason getLockReason() {
        return lockReason;
    }
    public void setLockReason(RepositoryLockReason lockReason) {
        this.lockReason = lockReason;
    }

    public UserConnection getMentionableUsers() {
        return mentionableUsers;
    }
    public void setMentionableUsers(UserConnection mentionableUsers) {
        this.mentionableUsers = mentionableUsers;
    }

    public Boolean getMergeCommitAllowed() {
        return mergeCommitAllowed;
    }
    public void setMergeCommitAllowed(Boolean mergeCommitAllowed) {
        this.mergeCommitAllowed = mergeCommitAllowed;
    }

    public Milestone getMilestone() {
        return milestone;
    }
    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public MilestoneConnection getMilestones() {
        return milestones;
    }
    public void setMilestones(MilestoneConnection milestones) {
        this.milestones = milestones;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }
    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameWithOwner() {
        return nameWithOwner;
    }
    public void setNameWithOwner(String nameWithOwner) {
        this.nameWithOwner = nameWithOwner;
    }

    public GitObject getObject() {
        return object;
    }
    public void setObject(GitObject object) {
        this.object = object;
    }

    public String getOpenGraphImageUrl() {
        return openGraphImageUrl;
    }
    public void setOpenGraphImageUrl(String openGraphImageUrl) {
        this.openGraphImageUrl = openGraphImageUrl;
    }

    public RepositoryOwner getOwner() {
        return owner;
    }
    public void setOwner(RepositoryOwner owner) {
        this.owner = owner;
    }

    public PackageConnection getPackages() {
        return packages;
    }
    public void setPackages(PackageConnection packages) {
        this.packages = packages;
    }

    public Repository getParent() {
        return parent;
    }
    public void setParent(Repository parent) {
        this.parent = parent;
    }

    public PinnedIssueConnection getPinnedIssues() {
        return pinnedIssues;
    }
    public void setPinnedIssues(PinnedIssueConnection pinnedIssues) {
        this.pinnedIssues = pinnedIssues;
    }

    public Language getPrimaryLanguage() {
        return primaryLanguage;
    }
    public void setPrimaryLanguage(Language primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
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

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public PullRequestConnection getPullRequests() {
        return pullRequests;
    }
    public void setPullRequests(PullRequestConnection pullRequests) {
        this.pullRequests = pullRequests;
    }

    public String getPushedAt() {
        return pushedAt;
    }
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Boolean getRebaseMergeAllowed() {
        return rebaseMergeAllowed;
    }
    public void setRebaseMergeAllowed(Boolean rebaseMergeAllowed) {
        this.rebaseMergeAllowed = rebaseMergeAllowed;
    }

    public Ref getRef() {
        return ref;
    }
    public void setRef(Ref ref) {
        this.ref = ref;
    }

    public RefConnection getRefs() {
        return refs;
    }
    public void setRefs(RefConnection refs) {
        this.refs = refs;
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

    public Release getRelease() {
        return release;
    }
    public void setRelease(Release release) {
        this.release = release;
    }

    public ReleaseConnection getReleases() {
        return releases;
    }
    public void setReleases(ReleaseConnection releases) {
        this.releases = releases;
    }

    public RepositoryTopicConnection getRepositoryTopics() {
        return repositoryTopics;
    }
    public void setRepositoryTopics(RepositoryTopicConnection repositoryTopics) {
        this.repositoryTopics = repositoryTopics;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getShortDescriptionHTML() {
        return shortDescriptionHTML;
    }
    public void setShortDescriptionHTML(String shortDescriptionHTML) {
        this.shortDescriptionHTML = shortDescriptionHTML;
    }

    public Boolean getSquashMergeAllowed() {
        return squashMergeAllowed;
    }
    public void setSquashMergeAllowed(Boolean squashMergeAllowed) {
        this.squashMergeAllowed = squashMergeAllowed;
    }

    public String getSshUrl() {
        return sshUrl;
    }
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public StargazerConnection getStargazers() {
        return stargazers;
    }
    public void setStargazers(StargazerConnection stargazers) {
        this.stargazers = stargazers;
    }

    public String getTempCloneToken() {
        return tempCloneToken;
    }
    public void setTempCloneToken(String tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    public Repository getTemplateRepository() {
        return templateRepository;
    }
    public void setTemplateRepository(Repository templateRepository) {
        this.templateRepository = templateRepository;
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

    public Boolean getUsesCustomOpenGraphImage() {
        return usesCustomOpenGraphImage;
    }
    public void setUsesCustomOpenGraphImage(Boolean usesCustomOpenGraphImage) {
        this.usesCustomOpenGraphImage = usesCustomOpenGraphImage;
    }

    public Boolean getViewerCanAdminister() {
        return viewerCanAdminister;
    }
    public void setViewerCanAdminister(Boolean viewerCanAdminister) {
        this.viewerCanAdminister = viewerCanAdminister;
    }

    public Boolean getViewerCanCreateProjects() {
        return viewerCanCreateProjects;
    }
    public void setViewerCanCreateProjects(Boolean viewerCanCreateProjects) {
        this.viewerCanCreateProjects = viewerCanCreateProjects;
    }

    public Boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }
    public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
        this.viewerCanSubscribe = viewerCanSubscribe;
    }

    public Boolean getViewerCanUpdateTopics() {
        return viewerCanUpdateTopics;
    }
    public void setViewerCanUpdateTopics(Boolean viewerCanUpdateTopics) {
        this.viewerCanUpdateTopics = viewerCanUpdateTopics;
    }

    public Boolean getViewerHasStarred() {
        return viewerHasStarred;
    }
    public void setViewerHasStarred(Boolean viewerHasStarred) {
        this.viewerHasStarred = viewerHasStarred;
    }

    public RepositoryPermission getViewerPermission() {
        return viewerPermission;
    }
    public void setViewerPermission(RepositoryPermission viewerPermission) {
        this.viewerPermission = viewerPermission;
    }

    public SubscriptionState getViewerSubscription() {
        return viewerSubscription;
    }
    public void setViewerSubscription(SubscriptionState viewerSubscription) {
        this.viewerSubscription = viewerSubscription;
    }

    public RepositoryVulnerabilityAlertConnection getVulnerabilityAlerts() {
        return vulnerabilityAlerts;
    }
    public void setVulnerabilityAlerts(RepositoryVulnerabilityAlertConnection vulnerabilityAlerts) {
        this.vulnerabilityAlerts = vulnerabilityAlerts;
    }

    public UserConnection getWatchers() {
        return watchers;
    }
    public void setWatchers(UserConnection watchers) {
        this.watchers = watchers;
    }

}