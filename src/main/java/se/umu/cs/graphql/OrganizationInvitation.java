package se.umu.cs.graphql;

import java.util.*;

public class OrganizationInvitation implements Node{

    private String createdAt;
    private String email;
    private String id;
    private OrganizationInvitationType invitationType;
    private User invitee;
    private User inviter;
    private Organization organization;
    private OrganizationInvitationRole role;

    public OrganizationInvitation() {
    }

    public OrganizationInvitation(String createdAt, String email, String id, OrganizationInvitationType invitationType, User invitee, User inviter, Organization organization, OrganizationInvitationRole role) {
        this.createdAt = createdAt;
        this.email = email;
        this.id = id;
        this.invitationType = invitationType;
        this.invitee = invitee;
        this.inviter = inviter;
        this.organization = organization;
        this.role = role;
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

    public OrganizationInvitationType getInvitationType() {
        return invitationType;
    }
    public void setInvitationType(OrganizationInvitationType invitationType) {
        this.invitationType = invitationType;
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

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public OrganizationInvitationRole getRole() {
        return role;
    }
    public void setRole(OrganizationInvitationRole role) {
        this.role = role;
    }

}