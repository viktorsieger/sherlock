package se.umu.cs.githubtypes;

import java.util.Collection;

public class OrgRestoreMemberAuditEntry implements OrganizationAuditEntry, AuditEntry, Node, OrganizationAuditEntryData{

    private String action;
    private AuditEntryActor actor;
    private String actorIp;
    private ActorLocation actorLocation;
    private String actorLogin;
    private String actorResourcePath;
    private String actorUrl;
    private String createdAt;
    private String id;
    private OperationType operationType;
    private Organization organization;
    private String organizationName;
    private String organizationResourcePath;
    private String organizationUrl;
    private Integer restoredCustomEmailRoutingsCount;
    private Integer restoredIssueAssignmentsCount;
    private Collection<OrgRestoreMemberAuditEntryMembership> restoredMemberships;
    private Integer restoredMembershipsCount;
    private Integer restoredRepositoriesCount;
    private Integer restoredRepositoryStarsCount;
    private Integer restoredRepositoryWatchesCount;
    private User user;
    private String userLogin;
    private String userResourcePath;
    private String userUrl;

    public OrgRestoreMemberAuditEntry() {
    }

    public OrgRestoreMemberAuditEntry(String action, AuditEntryActor actor, String actorIp, ActorLocation actorLocation, String actorLogin, String actorResourcePath, String actorUrl, String createdAt, String id, OperationType operationType, Organization organization, String organizationName, String organizationResourcePath, String organizationUrl, Integer restoredCustomEmailRoutingsCount, Integer restoredIssueAssignmentsCount, Collection<OrgRestoreMemberAuditEntryMembership> restoredMemberships, Integer restoredMembershipsCount, Integer restoredRepositoriesCount, Integer restoredRepositoryStarsCount, Integer restoredRepositoryWatchesCount, User user, String userLogin, String userResourcePath, String userUrl) {
        this.action = action;
        this.actor = actor;
        this.actorIp = actorIp;
        this.actorLocation = actorLocation;
        this.actorLogin = actorLogin;
        this.actorResourcePath = actorResourcePath;
        this.actorUrl = actorUrl;
        this.createdAt = createdAt;
        this.id = id;
        this.operationType = operationType;
        this.organization = organization;
        this.organizationName = organizationName;
        this.organizationResourcePath = organizationResourcePath;
        this.organizationUrl = organizationUrl;
        this.restoredCustomEmailRoutingsCount = restoredCustomEmailRoutingsCount;
        this.restoredIssueAssignmentsCount = restoredIssueAssignmentsCount;
        this.restoredMemberships = restoredMemberships;
        this.restoredMembershipsCount = restoredMembershipsCount;
        this.restoredRepositoriesCount = restoredRepositoriesCount;
        this.restoredRepositoryStarsCount = restoredRepositoryStarsCount;
        this.restoredRepositoryWatchesCount = restoredRepositoryWatchesCount;
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

    public Integer getRestoredCustomEmailRoutingsCount() {
        return restoredCustomEmailRoutingsCount;
    }
    public void setRestoredCustomEmailRoutingsCount(Integer restoredCustomEmailRoutingsCount) {
        this.restoredCustomEmailRoutingsCount = restoredCustomEmailRoutingsCount;
    }

    public Integer getRestoredIssueAssignmentsCount() {
        return restoredIssueAssignmentsCount;
    }
    public void setRestoredIssueAssignmentsCount(Integer restoredIssueAssignmentsCount) {
        this.restoredIssueAssignmentsCount = restoredIssueAssignmentsCount;
    }

    public Collection<OrgRestoreMemberAuditEntryMembership> getRestoredMemberships() {
        return restoredMemberships;
    }
    public void setRestoredMemberships(Collection<OrgRestoreMemberAuditEntryMembership> restoredMemberships) {
        this.restoredMemberships = restoredMemberships;
    }

    public Integer getRestoredMembershipsCount() {
        return restoredMembershipsCount;
    }
    public void setRestoredMembershipsCount(Integer restoredMembershipsCount) {
        this.restoredMembershipsCount = restoredMembershipsCount;
    }

    public Integer getRestoredRepositoriesCount() {
        return restoredRepositoriesCount;
    }
    public void setRestoredRepositoriesCount(Integer restoredRepositoriesCount) {
        this.restoredRepositoriesCount = restoredRepositoriesCount;
    }

    public Integer getRestoredRepositoryStarsCount() {
        return restoredRepositoryStarsCount;
    }
    public void setRestoredRepositoryStarsCount(Integer restoredRepositoryStarsCount) {
        this.restoredRepositoryStarsCount = restoredRepositoryStarsCount;
    }

    public Integer getRestoredRepositoryWatchesCount() {
        return restoredRepositoryWatchesCount;
    }
    public void setRestoredRepositoryWatchesCount(Integer restoredRepositoryWatchesCount) {
        this.restoredRepositoryWatchesCount = restoredRepositoryWatchesCount;
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