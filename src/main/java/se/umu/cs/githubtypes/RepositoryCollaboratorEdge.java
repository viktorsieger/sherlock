package se.umu.cs.githubtypes;

import java.util.Collection;

public class RepositoryCollaboratorEdge {

    private String cursor;
    private User node;
    private RepositoryPermission permission;
    private Collection<PermissionSource> permissionSources;

    public RepositoryCollaboratorEdge() {
    }

    public RepositoryCollaboratorEdge(String cursor, User node, RepositoryPermission permission, Collection<PermissionSource> permissionSources) {
        this.cursor = cursor;
        this.node = node;
        this.permission = permission;
        this.permissionSources = permissionSources;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public User getNode() {
        return node;
    }
    public void setNode(User node) {
        this.node = node;
    }

    public RepositoryPermission getPermission() {
        return permission;
    }
    public void setPermission(RepositoryPermission permission) {
        this.permission = permission;
    }

    public Collection<PermissionSource> getPermissionSources() {
        return permissionSources;
    }
    public void setPermissionSources(Collection<PermissionSource> permissionSources) {
        this.permissionSources = permissionSources;
    }

}