package se.umu.cs.githubtypes;

public class PullRequestReviewThread implements PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private PullRequestReviewCommentConnection comments;
    private DiffSide diffSide;
    private String id;
    private Boolean isResolved;
    private Integer line;
    private Integer originalLine;
    private Integer originalStartLine;
    private PullRequest pullRequest;
    private Repository repository;
    private User resolvedBy;
    private DiffSide startDiffSide;
    private Integer startLine;
    private Boolean viewerCanResolve;
    private Boolean viewerCanUnresolve;

    public PullRequestReviewThread() {
    }

    public PullRequestReviewThread(PullRequestReviewCommentConnection comments, DiffSide diffSide, String id, Boolean isResolved, Integer line, Integer originalLine, Integer originalStartLine, PullRequest pullRequest, Repository repository, User resolvedBy, DiffSide startDiffSide, Integer startLine, Boolean viewerCanResolve, Boolean viewerCanUnresolve) {
        this.comments = comments;
        this.diffSide = diffSide;
        this.id = id;
        this.isResolved = isResolved;
        this.line = line;
        this.originalLine = originalLine;
        this.originalStartLine = originalStartLine;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.resolvedBy = resolvedBy;
        this.startDiffSide = startDiffSide;
        this.startLine = startLine;
        this.viewerCanResolve = viewerCanResolve;
        this.viewerCanUnresolve = viewerCanUnresolve;
    }

    public PullRequestReviewCommentConnection getComments() {
        return comments;
    }
    public void setComments(PullRequestReviewCommentConnection comments) {
        this.comments = comments;
    }

    public DiffSide getDiffSide() {
        return diffSide;
    }
    public void setDiffSide(DiffSide diffSide) {
        this.diffSide = diffSide;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsResolved() {
        return isResolved;
    }
    public void setIsResolved(Boolean isResolved) {
        this.isResolved = isResolved;
    }

    public Integer getLine() {
        return line;
    }
    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getOriginalLine() {
        return originalLine;
    }
    public void setOriginalLine(Integer originalLine) {
        this.originalLine = originalLine;
    }

    public Integer getOriginalStartLine() {
        return originalStartLine;
    }
    public void setOriginalStartLine(Integer originalStartLine) {
        this.originalStartLine = originalStartLine;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public User getResolvedBy() {
        return resolvedBy;
    }
    public void setResolvedBy(User resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public DiffSide getStartDiffSide() {
        return startDiffSide;
    }
    public void setStartDiffSide(DiffSide startDiffSide) {
        this.startDiffSide = startDiffSide;
    }

    public Integer getStartLine() {
        return startLine;
    }
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    public Boolean getViewerCanResolve() {
        return viewerCanResolve;
    }
    public void setViewerCanResolve(Boolean viewerCanResolve) {
        this.viewerCanResolve = viewerCanResolve;
    }

    public Boolean getViewerCanUnresolve() {
        return viewerCanUnresolve;
    }
    public void setViewerCanUnresolve(Boolean viewerCanUnresolve) {
        this.viewerCanUnresolve = viewerCanUnresolve;
    }

}