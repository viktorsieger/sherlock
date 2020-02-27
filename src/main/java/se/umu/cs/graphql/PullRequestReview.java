package se.umu.cs.graphql;

import java.util.*;

public class PullRequestReview implements PullRequestTimelineItem, PullRequestTimelineItems, Comment, Deletable, Node, Reactable, RepositoryNode, Updatable, UpdatableComment{

    private Actor author;
    private CommentAuthorAssociation authorAssociation;
    private String body;
    private String bodyHTML;
    private String bodyText;
    private PullRequestReviewCommentConnection comments;
    private Commit commit;
    private String createdAt;
    private Boolean createdViaEmail;
    private Integer databaseId;
    private Actor editor;
    private String id;
    private Boolean includesCreatedEdit;
    private String lastEditedAt;
    private TeamConnection onBehalfOf;
    private String publishedAt;
    private PullRequest pullRequest;
    private Collection<ReactionGroup> reactionGroups;
    private ReactionConnection reactions;
    private Repository repository;
    private String resourcePath;
    private PullRequestReviewState state;
    private String submittedAt;
    private String updatedAt;
    private String url;
    private UserContentEditConnection userContentEdits;
    private Boolean viewerCanDelete;
    private Boolean viewerCanReact;
    private Boolean viewerCanUpdate;
    private Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons;
    private Boolean viewerDidAuthor;

    public PullRequestReview() {
    }

    public PullRequestReview(Actor author, CommentAuthorAssociation authorAssociation, String body, String bodyHTML, String bodyText, PullRequestReviewCommentConnection comments, Commit commit, String createdAt, Boolean createdViaEmail, Integer databaseId, Actor editor, String id, Boolean includesCreatedEdit, String lastEditedAt, TeamConnection onBehalfOf, String publishedAt, PullRequest pullRequest, Collection<ReactionGroup> reactionGroups, ReactionConnection reactions, Repository repository, String resourcePath, PullRequestReviewState state, String submittedAt, String updatedAt, String url, UserContentEditConnection userContentEdits, Boolean viewerCanDelete, Boolean viewerCanReact, Boolean viewerCanUpdate, Collection<CommentCannotUpdateReason> viewerCannotUpdateReasons, Boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.comments = comments;
        this.commit = commit;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.lastEditedAt = lastEditedAt;
        this.onBehalfOf = onBehalfOf;
        this.publishedAt = publishedAt;
        this.pullRequest = pullRequest;
        this.reactionGroups = reactionGroups;
        this.reactions = reactions;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.submittedAt = submittedAt;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userContentEdits = userContentEdits;
        this.viewerCanDelete = viewerCanDelete;
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

    public PullRequestReviewCommentConnection getComments() {
        return comments;
    }
    public void setComments(PullRequestReviewCommentConnection comments) {
        this.comments = comments;
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

    public String getLastEditedAt() {
        return lastEditedAt;
    }
    public void setLastEditedAt(String lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public TeamConnection getOnBehalfOf() {
        return onBehalfOf;
    }
    public void setOnBehalfOf(TeamConnection onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }

    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
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

    public PullRequestReviewState getState() {
        return state;
    }
    public void setState(PullRequestReviewState state) {
        this.state = state;
    }

    public String getSubmittedAt() {
        return submittedAt;
    }
    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
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