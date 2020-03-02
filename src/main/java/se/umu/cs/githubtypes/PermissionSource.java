package se.umu.cs.githubtypes;

public class PermissionSource {

    private Organization organization;
    private DefaultRepositoryPermissionField permission;
    private PermissionGranter source;

    public PermissionSource() {
    }

    public PermissionSource(Organization organization, DefaultRepositoryPermissionField permission, PermissionGranter source) {
        this.organization = organization;
        this.permission = permission;
        this.source = source;
    }

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public DefaultRepositoryPermissionField getPermission() {
        return permission;
    }
    public void setPermission(DefaultRepositoryPermissionField permission) {
        this.permission = permission;
    }

    public PermissionGranter getSource() {
        return source;
    }
    public void setSource(PermissionGranter source) {
        this.source = source;
    }

}