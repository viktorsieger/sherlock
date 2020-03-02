package se.umu.cs.githubtypes;

import java.util.Collection;

public class CommitComment implements Comment, Deletable, Minimizable, Node, Reactable, RepositoryNode, Updatable, UpdatableComment{

    private Actor author;
    private CommentAuthorAssociation authorAssociation;
    private String body;
    private String bodyHTML;
    private String bodyText;
    private Commit commit;
    private String createdAt;
    private Boolean createdViaEmail;
    private Integer databaseId;
    private Actor editor;
    private String id;
    private Boolean includesCreatedEdit;
    private Boolean isMinimized;
    private String lastEditedAt;
    private String minimizedReason;
    private String path;
    private Integer position;
    private String publishedAt;
    private Collection<ReactionGroup> reactionGroups;
    private ReactionConnection reactions;
    private Repository repository;
    private String resourcePath;
    private String updatedAt;
    private String url;
    private UserContentEditConnection userContentEdits;
    private Boolean viewerCanDelete;
    private Boolean viewerCanMinimize;
    private Boolean viewerCanReact;
    private Boolean viewerCanUpdate;
    private Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons;
    private Boolean viewerDidAuthor;

    public CommitComment() {
    }

    public CommitComment(Actor author, CommentAuthorAssociation authorAssociation, String body, String bodyHTML, String bodyText, Commit commit, String createdAt, Boolean createdViaEmail, Integer databaseId, Actor editor, String id, Boolean includesCreatedEdit, Boolean isMinimized, String lastEditedAt, String minimizedReason, String path, Integer position, String publishedAt, Collection<ReactionGroup> reactionGroups, ReactionConnection reactions, Repository repository, String resourcePath, String updatedAt, String url, UserContentEditConnection userContentEdits, Boolean viewerCanDelete, Boolean viewerCanMinimize, Boolean viewerCanReact, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons, Boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.commit = commit;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isMinimized = isMinimized;
        this.lastEditedAt = lastEditedAt;
        this.minimizedReason = minimizedReason;
        this.path = path;
        this.position = position;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanMinimize = viewerCanMinimize;
        this.viewerCanReact = viewerCanReact;
        this.viewerCanUpdate = viewerCanUpdate;
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
        this.viewerDidAuthor = viewerDidAuthor;
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

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
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

    public Boolean getIsMinimized() {
        return isMinimized;
    }
    public void setIsMinimized(Boolean isMinimized) {
        this.isMinimized = isMinimized;
    }

    public String getLastEditedAt() {
        return lastEditedAt;
    }
    public void setLastEditedAt(String lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public String getMinimizedReason() {
        return minimizedReason;
    }
    public void setMinimizedReason(String minimizedReason) {
        this.minimizedReason = minimizedReason;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
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

    public Boolean getViewerCanMinimize() {
        return viewerCanMinimize;
    }
    public void setViewerCanMinimize(Boolean viewerCanMinimize) {
        this.viewerCanMinimize = viewerCanMinimize;
    }

    public Boolean getViewerCanReact() {
        return viewerCanReact;
    }
    public void setViewerCanReact(Boolean viewerCanReact) {
        this.viewerCanReact = viewerCanReact;
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

}