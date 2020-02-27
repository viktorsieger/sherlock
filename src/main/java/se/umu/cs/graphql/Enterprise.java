package se.umu.cs.graphql;

import java.util.*;

public class Enterprise implements Node{

    private String avatarUrl;
    private EnterpriseBillingInfo billingInfo;
    private String createdAt;
    private Integer databaseId;
    private String description;
    private String descriptionHTML;
    private String id;
    private String location;
    private EnterpriseMemberConnection members;
    private String name;
    private OrganizationConnection organizations;
    private EnterpriseOwnerInfo ownerInfo;
    private String resourcePath;
    private String url;
    private EnterpriseUserAccountConnection userAccounts;
    private Boolean viewerIsAdmin;
    private String websiteUrl;

    public Enterprise() {
    }

    public Enterprise(String avatarUrl, EnterpriseBillingInfo billingInfo, String createdAt, Integer databaseId, String description, String descriptionHTML, String id, String location, EnterpriseMemberConnection members, String name, OrganizationConnection organizations, EnterpriseOwnerInfo ownerInfo, String resourcePath, String url, EnterpriseUserAccountConnection userAccounts, Boolean viewerIsAdmin, String websiteUrl) {
        this.avatarUrl = avatarUrl;
        this.billingInfo = billingInfo;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.id = id;
        this.location = location;
        this.members = members;
        this.name = name;
        this.organizations = organizations;
        this.ownerInfo = ownerInfo;
        this.resourcePath = resourcePath;
        this.url = url;
        this.userAccounts = userAccounts;
        this.viewerIsAdmin = viewerIsAdmin;
        this.websiteUrl = websiteUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public EnterpriseBillingInfo getBillingInfo() {
        return billingInfo;
    }
    public void setBillingInfo(EnterpriseBillingInfo billingInfo) {
        this.billingInfo = billingInfo;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public EnterpriseMemberConnection getMembers() {
        return members;
    }
    public void setMembers(EnterpriseMemberConnection members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public OrganizationConnection getOrganizations() {
        return organizations;
    }
    public void setOrganizations(OrganizationConnection organizations) {
        this.organizations = organizations;
    }

    public EnterpriseOwnerInfo getOwnerInfo() {
        return ownerInfo;
    }
    public void setOwnerInfo(EnterpriseOwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public EnterpriseUserAccountConnection getUserAccounts() {
        return userAccounts;
    }
    public void setUserAccounts(EnterpriseUserAccountConnection userAccounts) {
        this.userAccounts = userAccounts;
    }

    public Boolean getViewerIsAdmin() {
        return viewerIsAdmin;
    }
    public void setViewerIsAdmin(Boolean viewerIsAdmin) {
        this.viewerIsAdmin = viewerIsAdmin;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

}