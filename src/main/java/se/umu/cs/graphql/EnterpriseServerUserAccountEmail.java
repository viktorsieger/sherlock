package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccountEmail implements Node{

    private String createdAt;
    private String email;
    private String id;
    private Boolean isPrimary;
    private String updatedAt;
    private EnterpriseServerUserAccount userAccount;

    public EnterpriseServerUserAccountEmail() {
    }

    public EnterpriseServerUserAccountEmail(String createdAt, String email, String id, Boolean isPrimary, String updatedAt, EnterpriseServerUserAccount userAccount) {
        this.createdAt = createdAt;
        this.email = email;
        this.id = id;
        this.isPrimary = isPrimary;
        this.updatedAt = updatedAt;
        this.userAccount = userAccount;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    public Boolean getIsPrimary() {
        return isPrimary;
    }
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EnterpriseServerUserAccount getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(EnterpriseServerUserAccount userAccount) {
        this.userAccount = userAccount;
    }

}