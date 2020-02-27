package se.umu.cs.graphql;

import java.util.*;

public interface RepositoryInfo {

    String getCreatedAt();

    String getDescription();

    String getDescriptionHTML();

    Integer getForkCount();

    Boolean getHasIssuesEnabled();

    Boolean getHasProjectsEnabled();

    Boolean getHasWikiEnabled();

    String getHomepageUrl();

    Boolean getIsArchived();

    Boolean getIsFork();

    Boolean getIsLocked();

    Boolean getIsMirror();

    Boolean getIsPrivate();

    Boolean getIsTemplate();

    License getLicenseInfo();

    RepositoryLockReason getLockReason();

    String getMirrorUrl();

    String getName();

    String getNameWithOwner();

    String getOpenGraphImageUrl();

    RepositoryOwner getOwner();

    String getPushedAt();

    String getResourcePath();

    String getShortDescriptionHTML();

    String getUpdatedAt();

    String getUrl();

    Boolean getUsesCustomOpenGraphImage();

}