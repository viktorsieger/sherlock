package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccountsUpload implements Node{

    private String createdAt;
    private Enterprise enterprise;
    private EnterpriseServerInstallation enterpriseServerInstallation;
    private String id;
    private String name;
    private EnterpriseServerUserAccountsUploadSyncState syncState;
    private String updatedAt;

    public EnterpriseServerUserAccountsUpload() {
    }

    public EnterpriseServerUserAccountsUpload(String createdAt, Enterprise enterprise, EnterpriseServerInstallation enterpriseServerInstallation, String id, String name, EnterpriseServerUserAccountsUploadSyncState syncState, String updatedAt) {
        this.createdAt = createdAt;
        this.enterprise = enterprise;
        this.enterpriseServerInstallation = enterpriseServerInstallation;
        this.id = id;
        this.name = name;
        this.syncState = syncState;
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseServerUserAccountsUploadSyncState getSyncState() {
        return syncState;
    }
    public void setSyncState(EnterpriseServerUserAccountsUploadSyncState syncState) {
        this.syncState = syncState;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}