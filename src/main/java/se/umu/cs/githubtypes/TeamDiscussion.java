package se.umu.cs.githubtypes;

import java.util.Collection;

public class TeamDiscussion implements Comment, Deletable, Node, Reactable, Subscribable, UniformResourceLocatable, Updatable, UpdatableComment{

    private Actor author;
    private CommentAuthorAssociation authorAssociation;
    private String body;
    private String bodyHTML;
    private String bodyText;
    private String bodyVersion;
    private TeamDiscussionCommentConnection comments;
    private String commentsResourcePath;
    private String commentsUrl;
    private String createdAt;
    private Boolean createdViaEmail;
    private Integer databaseId;
    private Actor editor;
    private String id;
    private Boolean includesCreatedEdit;
    private Boolean isPinned;
    private Boolean isPrivate;
    private String lastEditedAt;
    private Integer number;
    private String publishedAt;
    private Collection<ReactionGroup> reactionGroups;
    private ReactionConnection reactions;
    private String resourcePath;
    private Team team;
    private String title;
    private String updatedAt;
    private String url;
    private UserContentEditConnection userContentEdits;
    private Boolean viewerCanDelete;
    private Boolean viewerCanPin;
    private Boolean viewerCanReact;
    private Boolean viewerCanSubscribe;
    private Boolean viewerCanUpdate;
    private Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons;
    private Boolean viewerDidAuthor;
    private SubscriptionState viewerSubscription;

    public TeamDiscussion() {
    }

    public TeamDiscussion(Actor author, CommentAuthorAssociation authorAssociation, String body, String bodyHTML, String bodyText, String bodyVersion, TeamDiscussionCommentConnection comments, String commentsResourcePath, String commentsUrl, String createdAt, Boolean createdViaEmail, Integer databaseId, Actor editor, String id, Boolean includesCreatedEdit, Boolean isPinned, Boolean isPrivate, String lastEditedAt, Integer number, String publishedAt, Collection<ReactionGroup> reactionGroups, ReactionConnection reactions, String resourcePath, Team team, String title, String updatedAt, String url, UserContentEditConnection userContentEdits, Boolean viewerCanDelete, Boolean viewerCanPin, Boolean viewerCanReact, Boolean viewerCanSubscribe, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons, Boolean viewerDidAuthor, SubscriptionState viewerSubscription) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.bodyVersion = bodyVersion;
        this.comments = comments;
        this.commentsResourcePath = commentsResourcePath;
        this.commentsUrl = commentsUrl;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isPinned = isPinned;
        this.isPrivate = isPrivate;
        this.lastEditedAt = lastEditedAt;
        this.number = number;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.resourcePath = resourcePath;
        this.team = team;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanPin = viewerCanPin;
        this.viewerCanReact = viewerCanReact;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerCanUpdate = viewerCanUpdate;
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
        this.viewerDidAuthor = viewerDidAuthor;
        this.viewerSubscription = viewerSubscription;
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

    public String getBodyVersion() {
        return bodyVersion;
    }
    public void setBodyVersion(String bodyVersion) {
        this.bodyVersion = bodyVersion;
    }

    public TeamDiscussionCommentConnection getComments() {
        return comments;
    }
    public void setComments(TeamDiscussionCommentConnection comments) {
        this.comments = comments;
    }

    public String getCommentsResourcePath() {
        return commentsResourcePath;
    }
    public void setCommentsResourcePath(String commentsResourcePath) {
        this.commentsResourcePath = commentsResourcePath;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
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

    public Boolean getIsPinned() {
        return isPinned;
    }
    public void setIsPinned(Boolean isPinned) {
        this.isPinned = isPinned;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getLastEditedAt() {
        return lastEditedAt;
    }
    public void setLastEditedAt(String lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
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

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
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

    public Boolean getViewerCanDelete() {
        return viewerCanDelete;
    }
    public void setViewerCanDelete(Boolean viewerCanDelete) {
        this.viewerCanDelete = viewerCanDelete;
    }

    public Boolean getViewerCanPin() {
        return viewerCanPin;
    }
    public void setViewerCanPin(Boolean viewerCanPin) {
        this.viewerCanPin = viewerCanPin;
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