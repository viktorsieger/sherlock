package se.umu.cs.githubtypes;

public class OrgRestoreMemberMembershipOrganizationAuditEntryData implements OrgRestoreMemberAuditEntryMembership, OrganizationAuditEntryData{

    private Organization organization;
    private String organizationName;
    private String organizationResourcePath;
    private String organizationUrl;

    public OrgRestoreMemberMembershipOrganizationAuditEntryData() {
    }

    public OrgRestoreMemberMembershipOrganizationAuditEntryData(Organization organization, String organizationName, String organizationResourcePath, String organizationUrl) {
        this.organization = organization;
        this.organizationName = organizationName;
        this.organizationResourcePath = organizationResourcePath;
        this.organizationUrl = organizationUrl;
    }

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationResourcePath() {
        return organizationResourcePath;
    }
    public void setOrganizationResourcePath(String organizationResourcePath) {
        this.organizationResourcePath = organizationResourcePath;
    }

    public String getOrganizationUrl() {
        return organizationUrl;
    }
    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

}