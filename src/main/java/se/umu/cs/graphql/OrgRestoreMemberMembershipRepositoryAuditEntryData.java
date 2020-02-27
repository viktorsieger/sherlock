package se.umu.cs.graphql;

import java.util.*;

public class OrgRestoreMemberMembershipRepositoryAuditEntryData implements OrgRestoreMemberAuditEntryMembership, RepositoryAuditEntryData{

    private Repository repository;
    private String repositoryName;
    private String repositoryResourcePath;
    private String repositoryUrl;

    public OrgRestoreMemberMembershipRepositoryAuditEntryData() {
    }

    public OrgRestoreMemberMembershipRepositoryAuditEntryData(Repository repository, String repositoryName, String repositoryResourcePath, String repositoryUrl) {
        this.repository = repository;
        this.repositoryName = repositoryName;
        this.repositoryResourcePath = repositoryResourcePath;
        this.repositoryUrl = repositoryUrl;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getRepositoryName() {
        return repositoryName;
    }
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getRepositoryResourcePath() {
        return repositoryResourcePath;
    }
    public void setRepositoryResourcePath(String repositoryResourcePath) {
        this.repositoryResourcePath = repositoryResourcePath;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

}