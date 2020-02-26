package se.umu.cs;

import java.util.Date;
import java.util.List;

public class Repository {

    //private List<Repository> forks;
    private List<Issue> issues;
    private List<Label> labels;
    private List<PullRequest> pullRequests;
    private List<Star> stars;
    //private List<RepositoryVulnerabilityAlert> vulnerabilityAlerts;
    private Date createdAt;
    private boolean hasIssuesEnabled;
    private String id;
    private boolean isArchived;
    private boolean isDisabled;
    private boolean isLocked;
    private boolean isMirror;
    //private boolean isPrivate;
    private boolean isTemplate;
    private License licenseInfo;
    private String name;
    private User owner; // Organizations?
    private Date pushedAt;
    private Date updatedAt;

}
