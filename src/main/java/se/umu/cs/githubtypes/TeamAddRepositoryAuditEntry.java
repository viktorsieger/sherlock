package se.umu.cs.githubtypes;

public class TeamAddRepositoryAuditEntry implements OrganizationAuditEntry, AuditEntry, Node, OrganizationAuditEntryData, RepositoryAuditEntryData, TeamAuditEntryData{

    private String action;
    private AuditEntryActor actor;
    private String actorIp;
    private ActorLocation actorLocation;
    private String actorLogin;
    private String actorResourcePath;
    private String actorUrl;
    private String createdAt;
    private String id;
    private Boolean isLdapMapped;
    private OperationType operationType;
    private Organization organization;
    private String organizationName;
    private String organizationResourcePath;
    private String organizationUrl;
    private Repository repository;
    private String repositoryName;
    private String repositoryResourcePath;
    private String repositoryUrl;
    private Team team;
    private String teamName;
    private String teamResourcePath;
    private String teamUrl;
    private User user;
    private String userLogin;
    private String userResourcePath;
    private String userUrl;

    public TeamAddRepositoryAuditEntry() {
    }

    public TeamAddRepositoryAuditEntry(String action, AuditEntryActor actor, String actorIp, ActorLocation actorLocation, String actorLogin, String actorResourcePath, String actorUrl, String createdAt, String id, Boolean isLdapMapped, OperationType operationType, Organization organization, String organizationName, String organizationResourcePath, String organizationUrl, Repository repository, String repositoryName, String repositoryResourcePath, String repositoryUrl, Team team, String teamName, String teamResourcePath, String teamUrl, User user, String userLogin, String userResourcePath, String userUrl) {
        this.action = action;
        this.actor = actor;
        this.actorIp = actorIp;
        this.actorLocation = actorLocation;
        this.actorLogin = actorLogin;
        this.actorResourcePath = actorResourcePath;
        this.actorUrl = actorUrl;
        this.createdAt = createdAt;
        this.id = id;
        this.isLdapMapped = isLdapMapped;
        this.operationType = operationType;
        this.organization = organization;
        this.organizationName = organizationName;
        this.organizationResourcePath = organizationResourcePath;
        this.organizationUrl = organizationUrl;
        this.repository = repository;
        this.repositoryName = repositoryName;
        this.repositoryResourcePath = repositoryResourcePath;
        this.repositoryUrl = repositoryUrl;
        this.team = team;
        this.teamName = teamName;
        this.teamResourcePath = teamResourcePath;
        this.teamUrl = teamUrl;
        this.user = user;
        this.userLogin = userLogin;
        this.userResourcePath = userResourcePath;
        this.userUrl = userUrl;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public AuditEntryActor getActor() {
        return actor;
    }
    public void setActor(AuditEntryActor actor) {
        this.actor = actor;
    }

    public String getActorIp() {
        return actorIp;
    }
    public void setActorIp(String actorIp) {
        this.actorIp = actorIp;
    }

    public ActorLocation getActorLocation() {
        return actorLocation;
    }
    public void setActorLocation(ActorLocation actorLocation) {
        this.actorLocation = actorLocation;
    }

    public String getActorLogin() {
        return actorLogin;
    }
    public void setActorLogin(String actorLogin) {
        this.actorLogin = actorLogin;
    }

    public String getActorResourcePath() {
        return actorResourcePath;
    }
    public void setActorResourcePath(String actorResourcePath) {
        this.actorResourcePath = actorResourcePath;
    }

    public String getActorUrl() {
        return actorUrl;
    }
    public void setActorUrl(String actorUrl) {
        this.actorUrl = actorUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsLdapMapped() {
        return isLdapMapped;
    }
    public void setIsLdapMapped(Boolean isLdapMapped) {
        this.isLdapMapped = isLdapMapped;
    }

    public OperationType getOperationType() {
        return operationType;
    }
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationResourcePath() {
        return organizationResourcePath;
    }
    public void setOrganizationResourcePath(String organizationResourcePath) {
        this.organizationResourcePath = organizationResourcePath;
    }

    public String getOrganizationUrl() {
        return organizationUrl;
    }
    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getRepositoryName() {
        return repositoryName;
    }
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getRepositoryResourcePath() {
        return repositoryResourcePath;
    }
    public void setRepositoryResourcePath(String repositoryResourcePath) {
        this.repositoryResourcePath = repositoryResourcePath;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamResourcePath() {
        return teamResourcePath;
    }
    public void setTeamResourcePath(String teamResourcePath) {
        this.teamResourcePath = teamResourcePath;
    }

    public String getTeamUrl() {
        return teamUrl;
    }
    public void setTeamUrl(String teamUrl) {
        this.teamUrl = teamUrl;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String getUserLogin() {
        return userLogin;
    }
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserResourcePath() {
        return userResourcePath;
    }
    public void setUserResourcePath(String userResourcePath) {
        this.userResourcePath = userResourcePath;
    }

    public String getUserUrl() {
        return userUrl;
    }
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

}