package se.umu.cs.graphql;

import java.util.*;

public class ExternalIdentity implements Node{

    private String guid;
    private String id;
    private OrganizationInvitation organizationInvitation;
    private ExternalIdentitySamlAttributes samlIdentity;
    private ExternalIdentityScimAttributes scimIdentity;
    private User user;

    public ExternalIdentity() {
    }

    public ExternalIdentity(String guid, String id, OrganizationInvitation organizationInvitation, ExternalIdentitySamlAttributes samlIdentity, ExternalIdentityScimAttributes scimIdentity, User user) {
        this.guid = guid;
        this.id = id;
        this.organizationInvitation = organizationInvitation;
        this.samlIdentity = samlIdentity;
        this.scimIdentity = scimIdentity;
        this.user = user;
    }

    public String getGuid() {
        return guid;
    }
    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public OrganizationInvitation getOrganizationInvitation() {
        return organizationInvitation;
    }
    public void setOrganizationInvitation(OrganizationInvitation organizationInvitation) {
        this.organizationInvitation = organizationInvitation;
    }

    public ExternalIdentitySamlAttributes getSamlIdentity() {
        return samlIdentity;
    }
    public void setSamlIdentity(ExternalIdentitySamlAttributes samlIdentity) {
        this.samlIdentity = samlIdentity;
    }

    public ExternalIdentityScimAttributes getScimIdentity() {
        return scimIdentity;
    }
    public void setScimIdentity(ExternalIdentityScimAttributes scimIdentity) {
        this.scimIdentity = scimIdentity;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}