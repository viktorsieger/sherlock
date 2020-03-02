package se.umu.cs.githubtypes;

import java.util.Collection;

public class Issue implements IssueOrPullRequest, MilestoneItem, ProjectCardItem, ReferencedSubject, RenamedTitleSubject, SearchResultItem, Assignable, Closable, Comment, Labelable, Lockable, Node, Reactable, RepositoryNode, Subscribable, UniformResourceLocatable, Updatable, UpdatableComment{

    private LockReason activeLockReason;
    private UserConnection assignees;
    private Actor author;
    private CommentAuthorAssociation authorAssociation;
    private String body;
    private String bodyHTML;
    private String bodyText;
    private Boolean closed;
    private String closedAt;
    private IssueCommentConnection comments;
    private String createdAt;
    private Boolean createdViaEmail;
    private Integer databaseId;
    private Actor editor;
    private Hovercard hovercard;
    private String id;
    private Boolean includesCreatedEdit;
    private LabelConnection labels;
    private String lastEditedAt;
    private Boolean locked;
    private Milestone milestone;
    private Integer number;
    private UserConnection participants;
    private ProjectCardConnection projectCards;
    private String publishedAt;
    private Collection<ReactionGroup> reactionGroups;
    private ReactionConnection reactions;
    private Repository repository;
    private String resourcePath;
    private IssueState state;
    private IssueTimelineConnection timeline;
    private IssueTimelineItemsConnection timelineItems;
    private String title;
    private String updatedAt;
    private String url;
    private UserContentEditConnection userContentEdits;
    private Boolean viewerCanReact;
    private Boolean viewerCanSubscribe;
    private Boolean viewerCanUpdate;
    private Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons;
    private Boolean viewerDidAuthor;
    private SubscriptionState viewerSubscription;

    public Issue() {
    }

    public Issue(LockReason activeLockReason, UserConnection assignees, Actor author, CommentAuthorAssociation authorAssociation, String body, String bodyHTML, String bodyText, Boolean closed, String closedAt, IssueCommentConnection comments, String createdAt, Boolean createdViaEmail, Integer databaseId, Actor editor, Hovercard hovercard, String id, Boolean includesCreatedEdit, LabelConnection labels, String lastEditedAt, Boolean locked, Milestone milestone, Integer number, UserConnection participants, ProjectCardConnection projectCards, String publishedAt, Collection<ReactionGroup> reactionGroups, ReactionConnection reactions, Repository repository, String resourcePath, IssueState state, IssueTimelineConnection timeline, IssueTimelineItemsConnection timelineItems, String title, String updatedAt, String url, UserContentEditConnection userContentEdits, Boolean viewerCanReact, Boolean viewerCanSubscribe, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons, Boolean viewerDidAuthor, SubscriptionState viewerSubscription) {
        this.activeLockReason = activeLockReason;
        this.assignees = assignees;
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.closed = closed;
        this.closedAt = closedAt;
        this.comments = comments;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.hovercard = hovercard;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.labels = labels;
        this.lastEditedAt = lastEditedAt;
        this.locked = locked;
        this.milestone = milestone;
        this.number = number;
        this.participants = participants;
        this.projectCards = projectCards;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.timeline = timeline;
        this.timelineItems = timelineItems;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
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

    public Actor getEditor() {
        return editor;
    }
    public void setEditor(Actor editor) {
        this.editor = editor;
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

    public IssueState getState() {
        return state;
    }
    public void setState(IssueState state) {
        this.state = state;
    }

    public IssueTimelineConnection getTimeline() {
        return timeline;
    }
    public void setTimeline(IssueTimelineConnection timeline) {
        this.timeline = timeline;
    }

    public IssueTimelineItemsConnection getTimelineItems() {
        return timelineItems;
    }
    public void setTimelineItems(IssueTimelineItemsConnection timelineItems) {
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