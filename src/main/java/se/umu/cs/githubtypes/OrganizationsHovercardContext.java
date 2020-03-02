package se.umu.cs.githubtypes;

public class OrganizationsHovercardContext implements HovercardContext{

    private String message;
    private String octicon;
    private OrganizationConnection relevantOrganizations;
    private Integer totalOrganizationCount;

    public OrganizationsHovercardContext() {
    }

    public OrganizationsHovercardContext(String message, String octicon, OrganizationConnection relevantOrganizations, Integer totalOrganizationCount) {
        this.message = message;
        this.octicon = octicon;
        this.relevantOrganizations = relevantOrganizations;
        this.totalOrganizationCount = totalOrganizationCount;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOcticon() {
        return octicon;
    }
    public void setOcticon(String octicon) {
        this.octicon = octicon;
    }

    public OrganizationConnection getRelevantOrganizations() {
        return relevantOrganizations;
    }
    public void setRelevantOrganizations(OrganizationConnection relevantOrganizations) {
        this.relevantOrganizations = relevantOrganizations;
    }

    public Integer getTotalOrganizationCount() {
        return totalOrganizationCount;
    }
    public void setTotalOrganizationCount(Integer totalOrganizationCount) {
        this.totalOrganizationCount = totalOrganizationCount;
    }

}