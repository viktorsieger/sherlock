package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerInstallation implements Node{

    private String createdAt;
    private String customerName;
    private String hostName;
    private String id;
    private Boolean isConnected;
    private String updatedAt;
    private EnterpriseServerUserAccountConnection userAccounts;
    private EnterpriseServerUserAccountsUploadConnection userAccountsUploads;

    public EnterpriseServerInstallation() {
    }

    public EnterpriseServerInstallation(String createdAt, String customerName, String hostName, String id, Boolean isConnected, String updatedAt, EnterpriseServerUserAccountConnection userAccounts, EnterpriseServerUserAccountsUploadConnection userAccountsUploads) {
        this.createdAt = createdAt;
        this.customerName = customerName;
        this.hostName = hostName;
        this.id = id;
        this.isConnected = isConnected;
        this.updatedAt = updatedAt;
        this.userAccounts = userAccounts;
        this.userAccountsUploads = userAccountsUploads;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getHostName() {
        return hostName;
    }
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsConnected() {
        return isConnected;
    }
    public void setIsConnected(Boolean isConnected) {
        this.isConnected = isConnected;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EnterpriseServerUserAccountConnection getUserAccounts() {
        return userAccounts;
    }
    public void setUserAccounts(EnterpriseServerUserAccountConnection userAccounts) {
        this.userAccounts = userAccounts;
    }

    public EnterpriseServerUserAccountsUploadConnection getUserAccountsUploads() {
        return userAccountsUploads;
    }
    public void setUserAccountsUploads(EnterpriseServerUserAccountsUploadConnection userAccountsUploads) {
        this.userAccountsUploads = userAccountsUploads;
    }

}