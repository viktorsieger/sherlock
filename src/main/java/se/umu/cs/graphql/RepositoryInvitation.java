package se.umu.cs.graphql;

import java.util.*;

public class RepositoryInvitation implements Node{

    private String id;
    private User invitee;
    private User inviter;
    private RepositoryPermission permission;
    private RepositoryInfo repository;

    public RepositoryInvitation() {
    }

    public RepositoryInvitation(String id, User invitee, User inviter, RepositoryPermission permission, RepositoryInfo repository) {
        this.id = id;
        this.invitee = invitee;
        this.inviter = inviter;
        this.permission = permission;
        this.repository = repository;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public User getInvitee() {
        return invitee;
    }
    public void setInvitee(User invitee) {
        this.invitee = invitee;
    }

    public User getInviter() {
        return inviter;
    }
    public void setInviter(User inviter) {
        this.inviter = inviter;
    }

    public RepositoryPermission getPermission() {
        return permission;
    }
    public void setPermission(RepositoryPermission permission) {
        this.permission = permission;
    }

    public RepositoryInfo getRepository() {
        return repository;
    }
    public void setRepository(RepositoryInfo repository) {
        this.repository = repository;
    }

}