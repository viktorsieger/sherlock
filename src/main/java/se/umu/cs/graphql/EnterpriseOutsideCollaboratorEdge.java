package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseOutsideCollaboratorEdge {

    private String cursor;
    private Boolean isUnlicensed;
    private User node;
    private EnterpriseRepositoryInfoConnection repositories;

    public EnterpriseOutsideCollaboratorEdge() {
    }

    public EnterpriseOutsideCollaboratorEdge(String cursor, Boolean isUnlicensed, User node, EnterpriseRepositoryInfoConnection repositories) {
        this.cursor = cursor;
        this.isUnlicensed = isUnlicensed;
        this.node = node;
        this.repositories = repositories;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getIsUnlicensed() {
        return isUnlicensed;
    }
    public void setIsUnlicensed(Boolean isUnlicensed) {
        this.isUnlicensed = isUnlicensed;
    }

    public User getNode() {
        return node;
    }
    public void setNode(User node) {
        this.node = node;
    }

    public EnterpriseRepositoryInfoConnection getRepositories() {
        return repositories;
    }
    public void setRepositories(EnterpriseRepositoryInfoConnection repositories) {
        this.repositories = repositories;
    }

}