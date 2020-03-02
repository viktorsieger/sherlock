package se.umu.cs.githubtypes;

public class Organization implements Assignee, AuditEntryActor, PermissionGranter, SearchResultItem, Actor, MemberStatusable, Node, PackageOwner, ProfileOwner, ProjectOwner, RegistryPackageOwner, RegistryPackageSearch, RepositoryOwner, Sponsorable, UniformResourceLocatable{

    private Boolean anyPinnableItems;
    private OrganizationAuditEntryConnection auditLog;
    private String avatarUrl;
    private String createdAt;
    private Integer databaseId;
    private String description;
    private String descriptionHTML;
    private String email;
    private String id;
    private Boolean isVerified;
    private ProfileItemShowcase itemShowcase;
    private String location;
    private String login;
    private UserStatusConnection memberStatuses;
    private OrganizationMemberConnection membersWithRole;
    private String name;
    private String newTeamResourcePath;
    private String newTeamUrl;
    private String organizationBillingEmail;
    private PackageConnection packages;
    private UserConnection pendingMembers;
    private PinnableItemConnection pinnableItems;
    private PinnableItemConnection pinnedItems;
    private Integer pinnedItemsRemaining;
    private RepositoryConnection pinnedRepositories;
    private Project project;
    private ProjectConnection projects;
    private String projectsResourcePath;
    private String projectsUrl;
    private RegistryPackageConnection registryPackages;
    private RegistryPackageConnection registryPackagesForQuery;
    private RepositoryConnection repositories;
    private Repository repository;
    private Boolean requiresTwoFactorAuthentication;
    private String resourcePath;
    private OrganizationIdentityProvider samlIdentityProvider;
    private SponsorsListing sponsorsListing;
    private SponsorshipConnection sponsorshipsAsMaintainer;
    private SponsorshipConnection sponsorshipsAsSponsor;
    private Team team;
    private TeamConnection teams;
    private String teamsResourcePath;
    private String teamsUrl;
    private String updatedAt;
    private String url;
    private Boolean viewerCanAdminister;
    private Boolean viewerCanChangePinnedItems;
    private Boolean viewerCanCreateProjects;
    private Boolean viewerCanCreateRepositories;
    private Boolean viewerCanCreateTeams;
    private Boolean viewerIsAMember;
    private String websiteUrl;

    public Organization() {
    }

    public Organization(Boolean anyPinnableItems, OrganizationAuditEntryConnection auditLog, String avatarUrl, String createdAt, Integer databaseId, String description, String descriptionHTML, String email, String id, Boolean isVerified, ProfileItemShowcase itemShowcase, String location, String login, UserStatusConnection memberStatuses, OrganizationMemberConnection membersWithRole, String name, String newTeamResourcePath, String newTeamUrl, String organizationBillingEmail, PackageConnection packages, UserConnection pendingMembers, PinnableItemConnection pinnableItems, PinnableItemConnection pinnedItems, Integer pinnedItemsRemaining, RepositoryConnection pinnedRepositories, Project project, ProjectConnection projects, String projectsResourcePath, String projectsUrl, RegistryPackageConnection registryPackages, RegistryPackageConnection registryPackagesForQuery, RepositoryConnection repositories, Repository repository, Boolean requiresTwoFactorAuthentication, String resourcePath, OrganizationIdentityProvider samlIdentityProvider, SponsorsListing sponsorsListing, SponsorshipConnection sponsorshipsAsMaintainer, SponsorshipConnection sponsorshipsAsSponsor, Team team, TeamConnection teams, String teamsResourcePath, String teamsUrl, String updatedAt, String url, Boolean viewerCanAdminister, Boolean viewerCanChangePinnedItems, Boolean viewerCanCreateProjects, Boolean viewerCanCreateRepositories, Boolean viewerCanCreateTeams, Boolean viewerIsAMember, String websiteUrl) {
        this.anyPinnableItems = anyPinnableItems;
        this.auditLog = auditLog;
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.email = email;
        this.id = id;
        this.isVerified = isVerified;
        this.itemShowcase = itemShowcase;
        this.location = location;
        this.login = login;
        this.memberStatuses = memberStatuses;
        this.membersWithRole = membersWithRole;
        this.name = name;
        this.newTeamResourcePath = newTeamResourcePath;
        this.newTeamUrl = newTeamUrl;
        this.organizationBillingEmail = organizationBillingEmail;
        this.packages = packages;
        this.pendingMembers = pendingMembers;
        this.pinnableItems = pinnableItems;
        this.pinnedItems = pinnedItems;
        this.pinnedItemsRemaining = pinnedItemsRemaining;
        this.pinnedRepositories = pinnedRepositories;
        this.project = project;
        this.projects = projects;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.registryPackages = registryPackages;
        this.registryPackagesForQuery = registryPackagesForQuery;
        this.repositories = repositories;
        this.repository = repository;
        this.requiresTwoFactorAuthentication = requiresTwoFactorAuthentication;
        this.resourcePath = resourcePath;
        this.samlIdentityProvider = samlIdentityProvider;
        this.sponsorsListing = sponsorsListing;
        this.sponsorshipsAsMaintainer = sponsorshipsAsMaintainer;
        this.sponsorshipsAsSponsor = sponsorshipsAsSponsor;
        this.team = team;
        this.teams = teams;
        this.teamsResourcePath = teamsResourcePath;
        this.teamsUrl = teamsUrl;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanCreateRepositories = viewerCanCreateRepositories;
        this.viewerCanCreateTeams = viewerCanCreateTeams;
        this.viewerIsAMember = viewerIsAMember;
        this.websiteUrl = websiteUrl;
    }

    public Boolean getAnyPinnableItems() {
        return anyPinnableItems;
    }
    public void setAnyPinnableItems(Boolean anyPinnableItems) {
        this.anyPinnableItems = anyPinnableItems;
    }

    public OrganizationAuditEntryConnection getAuditLog() {
        return auditLog;
    }
    public void setAuditLog(OrganizationAuditEntryConnection auditLog) {
        this.auditLog = auditLog;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
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

    public UserStatusConnection getMemberStatuses() {
        return memberStatuses;
    }
    public void setMemberStatuses(UserStatusConnection memberStatuses) {
        this.memberStatuses = memberStatuses;
    }

    public OrganizationMemberConnection getMembersWithRole() {
        return membersWithRole;
    }
    public void setMembersWithRole(OrganizationMemberConnection membersWithRole) {
        this.membersWithRole = membersWithRole;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNewTeamResourcePath() {
        return newTeamResourcePath;
    }
    public void setNewTeamResourcePath(String newTeamResourcePath) {
        this.newTeamResourcePath = newTeamResourcePath;
    }

    public String getNewTeamUrl() {
        return newTeamUrl;
    }
    public void setNewTeamUrl(String newTeamUrl) {
        this.newTeamUrl = newTeamUrl;
    }

    public String getOrganizationBillingEmail() {
        return organizationBillingEmail;
    }
    public void setOrganizationBillingEmail(String organizationBillingEmail) {
        this.organizationBillingEmail = organizationBillingEmail;
    }

    public PackageConnection getPackages() {
        return packages;
    }
    public void setPackages(PackageConnection packages) {
        this.packages = packages;
    }

    public UserConnection getPendingMembers() {
        return pendingMembers;
    }
    public void setPendingMembers(UserConnection pendingMembers) {
        this.pendingMembers = pendingMembers;
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

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Boolean getRequiresTwoFactorAuthentication() {
        return requiresTwoFactorAuthentication;
    }
    public void setRequiresTwoFactorAuthentication(Boolean requiresTwoFactorAuthentication) {
        this.requiresTwoFactorAuthentication = requiresTwoFactorAuthentication;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public OrganizationIdentityProvider getSamlIdentityProvider() {
        return samlIdentityProvider;
    }
    public void setSamlIdentityProvider(OrganizationIdentityProvider samlIdentityProvider) {
        this.samlIdentityProvider = samlIdentityProvider;
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

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

    public TeamConnection getTeams() {
        return teams;
    }
    public void setTeams(TeamConnection teams) {
        this.teams = teams;
    }

    public String getTeamsResourcePath() {
        return teamsResourcePath;
    }
    public void setTeamsResourcePath(String teamsResourcePath) {
        this.teamsResourcePath = teamsResourcePath;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
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

    public Boolean getViewerCanAdminister() {
        return viewerCanAdminister;
    }
    public void setViewerCanAdminister(Boolean viewerCanAdminister) {
        this.viewerCanAdminister = viewerCanAdminister;
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

    public Boolean getViewerCanCreateRepositories() {
        return viewerCanCreateRepositories;
    }
    public void setViewerCanCreateRepositories(Boolean viewerCanCreateRepositories) {
        this.viewerCanCreateRepositories = viewerCanCreateRepositories;
    }

    public Boolean getViewerCanCreateTeams() {
        return viewerCanCreateTeams;
    }
    public void setViewerCanCreateTeams(Boolean viewerCanCreateTeams) {
        this.viewerCanCreateTeams = viewerCanCreateTeams;
    }

    public Boolean getViewerIsAMember() {
        return viewerIsAMember;
    }
    public void setViewerIsAMember(Boolean viewerIsAMember) {
        this.viewerIsAMember = viewerIsAMember;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

}