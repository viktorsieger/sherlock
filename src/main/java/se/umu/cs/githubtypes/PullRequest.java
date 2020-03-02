package se.umu.cs.githubtypes;

import java.util.Collection;

public class PullRequest implements Closer, IssueOrPullRequest, MilestoneItem, ProjectCardItem, ReferencedSubject, RenamedTitleSubject, SearchResultItem, Assignable, Closable, Comment, Labelable, Lockable, Node, Reactable, RepositoryNode, Subscribable, UniformResourceLocatable, Updatable, UpdatableComment{

    private LockReason activeLockReason;
    private Integer additions;
    private UserConnection assignees;
    private Actor author;
    private CommentAuthorAssociation authorAssociation;
    private Ref baseRef;
    private String baseRefName;
    private String baseRefOid;
    private Repository baseRepository;
    private String body;
    private String bodyHTML;
    private String bodyText;
    private Boolean canBeRebased;
    private Integer changedFiles;
    private String checksResourcePath;
    private String checksUrl;
    private Boolean closed;
    private String closedAt;
    private IssueCommentConnection comments;
    private PullRequestCommitConnection commits;
    private String createdAt;
    private Boolean createdViaEmail;
    private Integer databaseId;
    private Integer deletions;
    private Actor editor;
    private PullRequestChangedFileConnection files;
    private Ref headRef;
    private String headRefName;
    private String headRefOid;
    private Repository headRepository;
    private RepositoryOwner headRepositoryOwner;
    private Hovercard hovercard;
    private String id;
    private Boolean includesCreatedEdit;
    private Boolean isCrossRepository;
    private Boolean isDraft;
    private LabelConnection labels;
    private String lastEditedAt;
    private Boolean locked;
    private Boolean maintainerCanModify;
    private Commit mergeCommit;
    private MergeStateStatus mergeStateStatus;
    private MergeableState mergeable;
    private Boolean merged;
    private String mergedAt;
    private Actor mergedBy;
    private Milestone milestone;
    private Integer number;
    private UserConnection participants;
    private String permalink;
    private Commit potentialMergeCommit;
    private ProjectCardConnection projectCards;
    private String publishedAt;
    private Collection<ReactionGroup> reactionGroups;
    private ReactionConnection reactions;
    private Repository repository;
    private String resourcePath;
    private String revertResourcePath;
    private String revertUrl;
    private ReviewRequestConnection reviewRequests;
    private PullRequestReviewThreadConnection reviewThreads;
    private PullRequestReviewConnection reviews;
    private PullRequestState state;
    private Collection<SuggestedReviewer> suggestedReviewers;
    private PullRequestTimelineConnection timeline;
    private PullRequestTimelineItemsConnection timelineItems;
    private String title;
    private String updatedAt;
    private String url;
    private UserContentEditConnection userContentEdits;
    private Boolean viewerCanApplySuggestion;
    private Boolean viewerCanReact;
    private Boolean viewerCanSubscribe;
    private Boolean viewerCanUpdate;
    private Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons;
    private Boolean viewerDidAuthor;
    private SubscriptionState viewerSubscription;

    public PullRequest() {
    }

    public PullRequest(LockReason activeLockReason, Integer additions, UserConnection assignees, Actor author, CommentAuthorAssociation authorAssociation, Ref baseRef, String baseRefName, String baseRefOid, Repository baseRepository, String body, String bodyHTML, String bodyText, Boolean canBeRebased, Integer changedFiles, String checksResourcePath, String checksUrl, Boolean closed, String closedAt, IssueCommentConnection comments, PullRequestCommitConnection commits, String createdAt, Boolean createdViaEmail, Integer databaseId, Integer deletions, Actor editor, PullRequestChangedFileConnection files, Ref headRef, String headRefName, String headRefOid, Repository headRepository, RepositoryOwner headRepositoryOwner, Hovercard hovercard, String id, Boolean includesCreatedEdit, Boolean isCrossRepository, Boolean isDraft, LabelConnection labels, String lastEditedAt, Boolean locked, Boolean maintainerCanModify, Commit mergeCommit, MergeStateStatus mergeStateStatus, MergeableState mergeable, Boolean merged, String mergedAt, Actor mergedBy, Milestone milestone, Integer number, UserConnection participants, String permalink, Commit potentialMergeCommit, ProjectCardConnection projectCards, String publishedAt, Collection<ReactionGroup> reactionGroups, ReactionConnection reactions, Repository repository, String resourcePath, String revertResourcePath, String revertUrl, ReviewRequestConnection reviewRequests, PullRequestReviewThreadConnection reviewThreads, PullRequestReviewConnection reviews, PullRequestState state, Collection<SuggestedReviewer> suggestedReviewers, PullRequestTimelineConnection timeline, PullRequestTimelineItemsConnection timelineItems, String title, String updatedAt, String url, UserContentEditConnection userContentEdits, Boolean viewerCanApplySuggestion, Boolean viewerCanReact, Boolean viewerCanSubscribe, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons, Boolean viewerDidAuthor, SubscriptionState viewerSubscription) {
        this.activeLockReason = activeLockReason;
        this.additions = additions;
        this.assignees = assignees;
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.baseRef = baseRef;
        this.baseRefName = baseRefName;
        this.baseRefOid = baseRefOid;
        this.baseRepository = baseRepository;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.canBeRebased = canBeRebased;
        this.changedFiles = changedFiles;
        this.checksResourcePath = checksResourcePath;
        this.checksUrl = checksUrl;
        this.closed = closed;
        this.closedAt = closedAt;
        this.comments = comments;
        this.commits = commits;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.deletions = deletions;
        this.editor = editor;
        this.files = files;
        this.headRef = headRef;
        this.headRefName = headRefName;
        this.headRefOid = headRefOid;
        this.headRepository = headRepository;
        this.headRepositoryOwner = headRepositoryOwner;
        this.hovercard = hovercard;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isCrossRepository = isCrossRepository;
        this.isDraft = isDraft;
        this.labels = labels;
        this.lastEditedAt = lastEditedAt;
        this.locked = locked;
        this.maintainerCanModify = maintainerCanModify;
        this.mergeCommit = mergeCommit;
        this.mergeStateStatus = mergeStateStatus;
        this.mergeable = mergeable;
        this.merged = merged;
        this.mergedAt = mergedAt;
        this.mergedBy = mergedBy;
        this.milestone = milestone;
        this.number = number;
        this.participants = participants;
        this.permalink = permalink;
        this.potentialMergeCommit = potentialMergeCommit;
        this.projectCards = projectCards;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.revertResourcePath = revertResourcePath;
        this.revertUrl = revertUrl;
        this.reviewRequests = reviewRequests;
        this.reviewThreads = reviewThreads;
        this.reviews = reviews;
        this.state = state;
        this.suggestedReviewers = suggestedReviewers;
        this.timeline = timeline;
        this.timelineItems = timelineItems;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
        this.viewerCanApplySuggestion = viewerCanApplySuggestion;
        this.viewerCanReact = viewerCanReact;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerCanUpdate = viewerCanUpdate;
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
        this.viewerDidAuthor = viewerDidAuthor;
        this.viewerSubscription = viewerSubscription;
    }

    public LockReason getActiveLockReason() {
        return activeLockReason;
    }
    public void setActiveLockReason(LockReason activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    public Integer getAdditions() {
        return additions;
    }
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public UserConnection getAssignees() {
        return assignees;
    }
    public void setAssignees(UserConnection assignees) {
        this.assignees = assignees;
    }

    public Actor getAuthor() {
        return author;
    }
    public void setAuthor(Actor author) {
        this.author = author;
    }

    public CommentAuthorAssociation getAuthorAssociation() {
        return authorAssociation;
    }
    public void setAuthorAssociation(CommentAuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public Ref getBaseRef() {
        return baseRef;
    }
    public void setBaseRef(Ref baseRef) {
        this.baseRef = baseRef;
    }

    public String getBaseRefName() {
        return baseRefName;
    }
    public void setBaseRefName(String baseRefName) {
        this.baseRefName = baseRefName;
    }

    public String getBaseRefOid() {
        return baseRefOid;
    }
    public void setBaseRefOid(String baseRefOid) {
        this.baseRefOid = baseRefOid;
    }

    public Repository getBaseRepository() {
        return baseRepository;
    }
    public void setBaseRepository(Repository baseRepository) {
        this.baseRepository = baseRepository;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }
    public void setBodyHTML(String bodyHTML) {
        this.bodyHTML = bodyHTML;
    }

    public String getBodyText() {
        return bodyText;
    }
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public Boolean getCanBeRebased() {
        return canBeRebased;
    }
    public void setCanBeRebased(Boolean canBeRebased) {
        this.canBeRebased = canBeRebased;
    }

    public Integer getChangedFiles() {
        return changedFiles;
    }
    public void setChangedFiles(Integer changedFiles) {
        this.changedFiles = changedFiles;
    }

    public String getChecksResourcePath() {
        return checksResourcePath;
    }
    public void setChecksResourcePath(String checksResourcePath) {
        this.checksResourcePath = checksResourcePath;
    }

    public String getChecksUrl() {
        return checksUrl;
    }
    public void setChecksUrl(String checksUrl) {
        this.checksUrl = checksUrl;
    }

    public Boolean getClosed() {
        return closed;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getClosedAt() {
        return closedAt;
    }
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public IssueCommentConnection getComments() {
        return comments;
    }
    public void setComments(IssueCommentConnection comments) {
        this.comments = comments;
    }

    public PullRequestCommitConnection getCommits() {
        return commits;
    }
    public void setCommits(PullRequestCommitConnection commits) {
        this.commits = commits;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getCreatedViaEmail() {
        return createdViaEmail;
    }
    public void setCreatedViaEmail(Boolean createdViaEmail) {
        this.createdViaEmail = createdViaEmail;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getDeletions() {
        return deletions;
    }
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public Actor getEditor() {
        return editor;
    }
    public void setEditor(Actor editor) {
        this.editor = editor;
    }

    public PullRequestChangedFileConnection getFiles() {
        return files;
    }
    public void setFiles(PullRequestChangedFileConnection files) {
        this.files = files;
    }

    public Ref getHeadRef() {
        return headRef;
    }
    public void setHeadRef(Ref headRef) {
        this.headRef = headRef;
    }

    public String getHeadRefName() {
        return headRefName;
    }
    public void setHeadRefName(String headRefName) {
        this.headRefName = headRefName;
    }

    public String getHeadRefOid() {
        return headRefOid;
    }
    public void setHeadRefOid(String headRefOid) {
        this.headRefOid = headRefOid;
    }

    public Repository getHeadRepository() {
        return headRepository;
    }
    public void setHeadRepository(Repository headRepository) {
        this.headRepository = headRepository;
    }

    public RepositoryOwner getHeadRepositoryOwner() {
        return headRepositoryOwner;
    }
    public void setHeadRepositoryOwner(RepositoryOwner headRepositoryOwner) {
        this.headRepositoryOwner = headRepositoryOwner;
    }

    public Hovercard getHovercard() {
        return hovercard;
    }
    public void setHovercard(Hovercard hovercard) {
        this.hovercard = hovercard;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIncludesCreatedEdit() {
        return includesCreatedEdit;
    }
    public void setIncludesCreatedEdit(Boolean includesCreatedEdit) {
        this.includesCreatedEdit = includesCreatedEdit;
    }

    public Boolean getIsCrossRepository() {
        return isCrossRepository;
    }
    public void setIsCrossRepository(Boolean isCrossRepository) {
        this.isCrossRepository = isCrossRepository;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }
    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    public LabelConnection getLabels() {
        return labels;
    }
    public void setLabels(LabelConnection labels) {
        this.labels = labels;
    }

    public String getLastEditedAt() {
        return lastEditedAt;
    }
    public void setLastEditedAt(String lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public Boolean getLocked() {
        return locked;
    }
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }
    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    public Commit getMergeCommit() {
        return mergeCommit;
    }
    public void setMergeCommit(Commit mergeCommit) {
        this.mergeCommit = mergeCommit;
    }

    public MergeStateStatus getMergeStateStatus() {
        return mergeStateStatus;
    }
    public void setMergeStateStatus(MergeStateStatus mergeStateStatus) {
        this.mergeStateStatus = mergeStateStatus;
    }

    public MergeableState getMergeable() {
        return mergeable;
    }
    public void setMergeable(MergeableState mergeable) {
        this.mergeable = mergeable;
    }

    public Boolean getMerged() {
        return merged;
    }
    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public String getMergedAt() {
        return mergedAt;
    }
    public void setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
    }

    public Actor getMergedBy() {
        return mergedBy;
    }
    public void setMergedBy(Actor mergedBy) {
        this.mergedBy = mergedBy;
    }

    public Milestone getMilestone() {
        return milestone;
    }
    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public UserConnection getParticipants() {
        return participants;
    }
    public void setParticipants(UserConnection participants) {
        this.participants = participants;
    }

    public String getPermalink() {
        return permalink;
    }
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Commit getPotentialMergeCommit() {
        return potentialMergeCommit;
    }
    public void setPotentialMergeCommit(Commit potentialMergeCommit) {
        this.potentialMergeCommit = potentialMergeCommit;
    }

    public ProjectCardConnection getProjectCards() {
        return projectCards;
    }
    public void setProjectCards(ProjectCardConnection projectCards) {
        this.projectCards = projectCards;
    }

    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Collection<ReactionGroup> getReactionGroups() {
        return reactionGroups;
    }
    public void setReactionGroups(Collection<ReactionGroup> reactionGroups) {
        this.reactionGroups = reactionGroups;
    }

    public ReactionConnection getReactions() {
        return reactions;
    }
    public void setReactions(ReactionConnection reactions) {
        this.reactions = reactions;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getRevertResourcePath() {
        return revertResourcePath;
    }
    public void setRevertResourcePath(String revertResourcePath) {
        this.revertResourcePath = revertResourcePath;
    }

    public String getRevertUrl() {
        return revertUrl;
    }
    public void setRevertUrl(String revertUrl) {
        this.revertUrl = revertUrl;
    }

    public ReviewRequestConnection getReviewRequests() {
        return reviewRequests;
    }
    public void setReviewRequests(ReviewRequestConnection reviewRequests) {
        this.reviewRequests = reviewRequests;
    }

    public PullRequestReviewThreadConnection getReviewThreads() {
        return reviewThreads;
    }
    public void setReviewThreads(PullRequestReviewThreadConnection reviewThreads) {
        this.reviewThreads = reviewThreads;
    }

    public PullRequestReviewConnection getReviews() {
        return reviews;
    }
    public void setReviews(PullRequestReviewConnection reviews) {
        this.reviews = reviews;
    }

    public PullRequestState getState() {
        return state;
    }
    public void setState(PullRequestState state) {
        this.state = state;
    }

    public Collection<SuggestedReviewer> getSuggestedReviewers() {
        return suggestedReviewers;
    }
    public void setSuggestedReviewers(Collection<SuggestedReviewer> suggestedReviewers) {
        this.suggestedReviewers = suggestedReviewers;
    }

    public PullRequestTimelineConnection getTimeline() {
        return timeline;
    }
    public void setTimeline(PullRequestTimelineConnection timeline) {
        this.timeline = timeline;
    }

    public PullRequestTimelineItemsConnection getTimelineItems() {
        return timelineItems;
    }
    public void setTimelineItems(PullRequestTimelineItemsConnection timelineItems) {
        this.timelineItems = timelineItems;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public UserContentEditConnection getUserContentEdits() {
        return userContentEdits;
    }
    public void setUserContentEdits(UserContentEditConnection userContentEdits) {
        this.userContentEdits = userContentEdits;
    }

    public Boolean getViewerCanApplySuggestion() {
        return viewerCanApplySuggestion;
    }
    public void setViewerCanApplySuggestion(Boolean viewerCanApplySuggestion) {
        this.viewerCanApplySuggestion = viewerCanApplySuggestion;
    }

    public Boolean getViewerCanReact() {
        return viewerCanReact;
    }
    public void setViewerCanReact(Boolean viewerCanReact) {
        this.viewerCanReact = viewerCanReact;
    }

    public Boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }
    public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
        this.viewerCanSubscribe = viewerCanSubscribe;
    }

    public Boolean getViewerCanUpdate() {
        return viewerCanUpdate;
    }
    public void setViewerCanUpdate(Boolean viewerCanUpdate) {
        this.viewerCanUpdate = viewerCanUpdate;
    }

    public Collection<CommentCannotUpdateReason> getViewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons;
    }
    public void setViewerCannotUpdateReasons(Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons) {
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
    }

    public Boolean getViewerDidAuthor() {
        return viewerDidAuthor;
    }
    public void setViewerDidAuthor(Boolean viewerDidAuthor) {
        this.viewerDidAuthor = viewerDidAuthor;
    }

    public SubscriptionState getViewerSubscription() {
        return viewerSubscription;
    }
    public void setViewerSubscription(SubscriptionState viewerSubscription) {
        this.viewerSubscription = viewerSubscription;
    }

}