package se.umu.cs.graphql;

import java.util.*;

public class OrgDisableSamlAuditEntry implements OrganizationAuditEntry, AuditEntry, Node, OrganizationAuditEntryData{

    private String action;
    private AuditEntryActor actor;
    private String actorIp;
    private ActorLocation actorLocation;
    private String actorLogin;
    private String actorResourcePath;
    private String actorUrl;
    private String createdAt;
    private String digestMethodUrl;
    private String id;
    private String issuerUrl;
    private OperationType operationType;
    private Organization organization;
    private String organizationName;
    private String organizationResourcePath;
    private String organizationUrl;
    private String signatureMethodUrl;
    private String singleSignOnUrl;
    private User user;
    private String userLogin;
    private String userResourcePath;
    private String userUrl;

    public OrgDisableSamlAuditEntry() {
    }

    public OrgDisableSamlAuditEntry(String action, AuditEntryActor actor, String actorIp, ActorLocation actorLocation, String actorLogin, String actorResourcePath, String actorUrl, String createdAt, String digestMethodUrl, String id, String issuerUrl, OperationType operationType, Organization organization, String organizationName, String organizationResourcePath, String organizationUrl, String signatureMethodUrl, String singleSignOnUrl, User user, String userLogin, String userResourcePath, String userUrl) {
        this.action = action;
        this.actor = actor;
        this.actorIp = actorIp;
        this.actorLocation = actorLocation;
        this.actorLogin = actorLogin;
        this.actorResourcePath = actorResourcePath;
        this.actorUrl = actorUrl;
        this.createdAt = createdAt;
        this.digestMethodUrl = digestMethodUrl;
        this.id = id;
        this.issuerUrl = issuerUrl;
        this.operationType = operationType;
        this.organization = organization;
        this.organizationName = organizationName;
        this.organizationResourcePath = organizationResourcePath;
        this.organizationUrl = organizationUrl;
        this.signatureMethodUrl = signatureMethodUrl;
        this.singleSignOnUrl = singleSignOnUrl;
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

    public String getDigestMethodUrl() {
        return digestMethodUrl;
    }
    public void setDigestMethodUrl(String digestMethodUrl) {
        this.digestMethodUrl = digestMethodUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIssuerUrl() {
        return issuerUrl;
    }
    public void setIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
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

    public String getSignatureMethodUrl() {
        return signatureMethodUrl;
    }
    public void setSignatureMethodUrl(String signatureMethodUrl) {
        this.signatureMethodUrl = signatureMethodUrl;
    }

    public String getSingleSignOnUrl() {
        return singleSignOnUrl;
    }
    public void setSingleSignOnUrl(String singleSignOnUrl) {
        this.singleSignOnUrl = singleSignOnUrl;
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