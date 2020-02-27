package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccount implements Node{

    private String createdAt;
    private EnterpriseServerUserAccountEmailConnection emails;
    private EnterpriseServerInstallation enterpriseServerInstallation;
    private String id;
    private Boolean isSiteAdmin;
    private String login;
    private String profileName;
    private String remoteCreatedAt;
    private Integer remoteUserId;
    private String updatedAt;

    public EnterpriseServerUserAccount() {
    }

    public EnterpriseServerUserAccount(String createdAt, EnterpriseServerUserAccountEmailConnection emails, EnterpriseServerInstallation enterpriseServerInstallation, String id, Boolean isSiteAdmin, String login, String profileName, String remoteCreatedAt, Integer remoteUserId, String updatedAt) {
        this.createdAt = createdAt;
        this.emails = emails;
        this.enterpriseServerInstallation = enterpriseServerInstallation;
        this.id = id;
        this.isSiteAdmin = isSiteAdmin;
        this.login = login;
        this.profileName = profileName;
        this.remoteCreatedAt = remoteCreatedAt;
        this.remoteUserId = remoteUserId;
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EnterpriseServerUserAccountEmailConnection getEmails() {
        return emails;
    }
    public void setEmails(EnterpriseServerUserAccountEmailConnection emails) {
        this.emails = emails;
    }

    public EnterpriseServerInstallation getEnterpriseServerInstallation() {
        return enterpriseServerInstallation;
    }
    public void setEnterpriseServerInstallation(EnterpriseServerInstallation enterpriseServerInstallation) {
        this.enterpriseServerInstallation = enterpriseServerInstallation;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsSiteAdmin() {
        return isSiteAdmin;
    }
    public void setIsSiteAdmin(Boolean isSiteAdmin) {
        this.isSiteAdmin = isSiteAdmin;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getProfileName() {
        return profileName;
    }
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getRemoteCreatedAt() {
        return remoteCreatedAt;
    }
    public void setRemoteCreatedAt(String remoteCreatedAt) {
        this.remoteCreatedAt = remoteCreatedAt;
    }

    public Integer getRemoteUserId() {
        return remoteUserId;
    }
    public void setRemoteUserId(Integer remoteUserId) {
        this.remoteUserId = remoteUserId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}