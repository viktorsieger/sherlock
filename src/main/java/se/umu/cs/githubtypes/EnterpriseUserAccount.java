package se.umu.cs.githubtypes;

public class EnterpriseUserAccount implements EnterpriseMember, Actor, Node{

    private String avatarUrl;
    private String createdAt;
    private Enterprise enterprise;
    private String id;
    private String login;
    private String name;
    private EnterpriseOrganizationMembershipConnection organizations;
    private String resourcePath;
    private String updatedAt;
    private String url;
    private User user;

    public EnterpriseUserAccount() {
    }

    public EnterpriseUserAccount(String avatarUrl, String createdAt, Enterprise enterprise, String id, String login, String name, EnterpriseOrganizationMembershipConnection organizations, String resourcePath, String updatedAt, String url, User user) {
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.enterprise = enterprise;
        this.id = id;
        this.login = login;
        this.name = name;
        this.organizations = organizations;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
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

    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseOrganizationMembershipConnection getOrganizations() {
        return organizations;
    }
    public void setOrganizations(EnterpriseOrganizationMembershipConnection organizations) {
        this.organizations = organizations;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
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

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}