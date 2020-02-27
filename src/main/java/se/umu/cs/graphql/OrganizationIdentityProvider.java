package se.umu.cs.graphql;

import java.util.*;

public class OrganizationIdentityProvider implements Node{

    private String digestMethod;
    private ExternalIdentityConnection externalIdentities;
    private String id;
    private String idpCertificate;
    private String issuer;
    private Organization organization;
    private String signatureMethod;
    private String ssoUrl;

    public OrganizationIdentityProvider() {
    }

    public OrganizationIdentityProvider(String digestMethod, ExternalIdentityConnection externalIdentities, String id, String idpCertificate, String issuer, Organization organization, String signatureMethod, String ssoUrl) {
        this.digestMethod = digestMethod;
        this.externalIdentities = externalIdentities;
        this.id = id;
        this.idpCertificate = idpCertificate;
        this.issuer = issuer;
        this.organization = organization;
        this.signatureMethod = signatureMethod;
        this.ssoUrl = ssoUrl;
    }

    public String getDigestMethod() {
        return digestMethod;
    }
    public void setDigestMethod(String digestMethod) {
        this.digestMethod = digestMethod;
    }

    public ExternalIdentityConnection getExternalIdentities() {
        return externalIdentities;
    }
    public void setExternalIdentities(ExternalIdentityConnection externalIdentities) {
        this.externalIdentities = externalIdentities;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIdpCertificate() {
        return idpCertificate;
    }
    public void setIdpCertificate(String idpCertificate) {
        this.idpCertificate = idpCertificate;
    }

    public String getIssuer() {
        return issuer;
    }
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getSignatureMethod() {
        return signatureMethod;
    }
    public void setSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public String getSsoUrl() {
        return ssoUrl;
    }
    public void setSsoUrl(String ssoUrl) {
        this.ssoUrl = ssoUrl;
    }

}