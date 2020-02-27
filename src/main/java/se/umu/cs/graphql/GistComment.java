package se.umu.cs.graphql;

import java.util.*;

public class GistComment implements Comment, Deletable, Minimizable, Node, Updatable, UpdatableComment{

    private Actor author;
    private CommentAuthorAssociation authorAssociation;
    private String body;
    private String bodyHTML;
    private String bodyText;
    private String createdAt;
    private Boolean createdViaEmail;
    private Integer databaseId;
    private Actor editor;
    private Gist gist;
    private String id;
    private Boolean includesCreatedEdit;
    private Boolean isMinimized;
    private String lastEditedAt;
    private String minimizedReason;
    private String publishedAt;
    private String updatedAt;
    private UserContentEditConnection userContentEdits;
    private Boolean viewerCanDelete;
    private Boolean viewerCanMinimize;
    private Boolean viewerCanUpdate;
    private Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons;
    private Boolean viewerDidAuthor;

    public GistComment() {
    }

    public GistComment(Actor author, CommentAuthorAssociation authorAssociation, String body, String bodyHTML, String bodyText, String createdAt, Boolean createdViaEmail, Integer databaseId, Actor editor, Gist gist, String id, Boolean includesCreatedEdit, Boolean isMinimized, String lastEditedAt, String minimizedReason, String publishedAt, String updatedAt, UserContentEditConnection userContentEdits, Boolean viewerCanDelete, Boolean viewerCanMinimize, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons, Boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.gist = gist;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isMinimized = isMinimized;
        this.lastEditedAt = lastEditedAt;
        this.minimizedReason = minimizedReason;
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.userContentEdits = userContentEdits;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanMinimize = viewerCanMinimize;
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

    public Gist getGist() {
        return gist;
    }
    public void setGist(Gist gist) {
        this.gist = gist;
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

    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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