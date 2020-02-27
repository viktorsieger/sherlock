package se.umu.cs.graphql;

import java.util.*;

public class TeamMemberEdge {

    private String cursor;
    private String memberAccessResourcePath;
    private String memberAccessUrl;
    private User node;
    private TeamMemberRole role;

    public TeamMemberEdge() {
    }

    public TeamMemberEdge(String cursor, String memberAccessResourcePath, String memberAccessUrl, User node, TeamMemberRole role) {
        this.cursor = cursor;
        this.memberAccessResourcePath = memberAccessResourcePath;
        this.memberAccessUrl = memberAccessUrl;
        this.node = node;
        this.role = role;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public String getMemberAccessResourcePath() {
        return memberAccessResourcePath;
    }
    public void setMemberAccessResourcePath(String memberAccessResourcePath) {
        this.memberAccessResourcePath = memberAccessResourcePath;
    }

    public String getMemberAccessUrl() {
        return memberAccessUrl;
    }
    public void setMemberAccessUrl(String memberAccessUrl) {
        this.memberAccessUrl = memberAccessUrl;
    }

    public User getNode() {
        return node;
    }
    public void setNode(User node) {
        this.node = node;
    }

    public TeamMemberRole getRole() {
        return role;
    }
    public void setRole(TeamMemberRole role) {
        this.role = role;
    }

}