package se.umu.cs.graphql;

import java.util.*;

public interface RepositoryAuditEntryData {

    Repository getRepository();

    String getRepositoryName();

    String getRepositoryResourcePath();

    String getRepositoryUrl();

}