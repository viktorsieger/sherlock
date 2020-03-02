package se.umu.cs.githubtypes;

import java.util.Collection;

public class SecurityAdvisory implements Node{

    private Integer databaseId;
    private String description;
    private String ghsaId;
    private String id;
    private Collection<SecurityAdvisoryIdentifier> identifiers;
    private String origin;
    private String publishedAt;
    private Collection<SecurityAdvisoryReference> references;
    private SecurityAdvisorySeverity severity;
    private String summary;
    private String updatedAt;
    private SecurityVulnerabilityConnection vulnerabilities;
    private String withdrawnAt;

    public SecurityAdvisory() {
    }

    public SecurityAdvisory(Integer databaseId, String description, String ghsaId, String id, Collection<SecurityAdvisoryIdentifier> identifiers, String origin, String publishedAt, Collection<SecurityAdvisoryReference> references, SecurityAdvisorySeverity severity, String summary, String updatedAt, SecurityVulnerabilityConnection vulnerabilities, String withdrawnAt) {
        this.databaseId = databaseId;
        this.description = description;
        this.ghsaId = ghsaId;
        this.id = id;
        this.identifiers = identifiers;
        this.origin = origin;
        this.publishedAt = publishedAt;
        this.references = references;
        this.severity = severity;
        this.summary = summary;
        this.updatedAt = updatedAt;
        this.vulnerabilities = vulnerabilities;
        this.withdrawnAt = withdrawnAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getGhsaId() {
        return ghsaId;
    }
    public void setGhsaId(String ghsaId) {
        this.ghsaId = ghsaId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Collection<SecurityAdvisoryIdentifier> getIdentifiers() {
        return identifiers;
    }
    public void setIdentifiers(Collection<SecurityAdvisoryIdentifier> identifiers) {
        this.identifiers = identifiers;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Collection<SecurityAdvisoryReference> getReferences() {
        return references;
    }
    public void setReferences(Collection<SecurityAdvisoryReference> references) {
        this.references = references;
    }

    public SecurityAdvisorySeverity getSeverity() {
        return severity;
    }
    public void setSeverity(SecurityAdvisorySeverity severity) {
        this.severity = severity;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SecurityVulnerabilityConnection getVulnerabilities() {
        return vulnerabilities;
    }
    public void setVulnerabilities(SecurityVulnerabilityConnection vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public String getWithdrawnAt() {
        return withdrawnAt;
    }
    public void setWithdrawnAt(String withdrawnAt) {
        this.withdrawnAt = withdrawnAt;
    }

}