package se.umu.cs.githubtypes;

public interface RepositoryAuditEntryData {

    Repository getRepository();

    String getRepositoryName();

    String getRepositoryResourcePath();

    String getRepositoryUrl();

}