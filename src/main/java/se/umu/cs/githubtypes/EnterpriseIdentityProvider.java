package se.umu.cs.githubtypes;

import java.util.Collection;

public class EnterpriseIdentityProvider implements Node{

    private SamlDigestAlgorithm digestMethod;
    private Enterprise enterprise;
    private ExternalIdentityConnection externalIdentities;
    private String id;
    private String idpCertificate;
    private String issuer;
    private Collection<String> recoveryCodes;
    private SamlSignatureAlgorithm signatureMethod;
    private String ssoUrl;

    public EnterpriseIdentityProvider() {
    }

    public EnterpriseIdentityProvider(SamlDigestAlgorithm digestMethod, Enterprise enterprise, ExternalIdentityConnection externalIdentities, String id, String idpCertificate, String issuer, Collection<String> recoveryCodes, SamlSignatureAlgorithm signatureMethod, String ssoUrl) {
        this.digestMethod = digestMethod;
        this.enterprise = enterprise;
        this.externalIdentities = externalIdentities;
        this.id = id;
        this.idpCertificate = idpCertificate;
        this.issuer = issuer;
        this.recoveryCodes = recoveryCodes;
        this.signatureMethod = signatureMethod;
        this.ssoUrl = ssoUrl;
    }

    public SamlDigestAlgorithm getDigestMethod() {
        return digestMethod;
    }
    public void setDigestMethod(SamlDigestAlgorithm digestMethod) {
        this.digestMethod = digestMethod;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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

    public Collection<String> getRecoveryCodes() {
        return recoveryCodes;
    }
    public void setRecoveryCodes(Collection<String> recoveryCodes) {
        this.recoveryCodes = recoveryCodes;
    }

    public SamlSignatureAlgorithm getSignatureMethod() {
        return signatureMethod;
    }
    public void setSignatureMethod(SamlSignatureAlgorithm signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public String getSsoUrl() {
        return ssoUrl;
    }
    public void setSsoUrl(String ssoUrl) {
        this.ssoUrl = ssoUrl;
    }

}