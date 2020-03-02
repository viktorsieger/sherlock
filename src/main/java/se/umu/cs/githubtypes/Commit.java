package se.umu.cs.githubtypes;

public class Commit implements Closer, IssueTimelineItem, PullRequestTimelineItem, GitObject, Node, Subscribable, UniformResourceLocatable{

    private String abbreviatedOid;
    private Integer additions;
    private PullRequestConnection associatedPullRequests;
    private GitActor author;
    private Boolean authoredByCommitter;
    private String authoredDate;
    private Blame blame;
    private Integer changedFiles;
    private CheckSuiteConnection checkSuites;
    private CommitCommentConnection comments;
    private String commitResourcePath;
    private String commitUrl;
    private String committedDate;
    private Boolean committedViaWeb;
    private GitActor committer;
    private Integer deletions;
    private DeploymentConnection deployments;
    private CommitHistoryConnection history;
    private String id;
    private String message;
    private String messageBody;
    private String messageBodyHTML;
    private String messageHeadline;
    private String messageHeadlineHTML;
    private String oid;
    private CommitConnection parents;
    private String pushedDate;
    private Repository repository;
    private String resourcePath;
    private GitSignature signature;
    private Status status;
    private String tarballUrl;
    private Tree tree;
    private String treeResourcePath;
    private String treeUrl;
    private String url;
    private Boolean viewerCanSubscribe;
    private SubscriptionState viewerSubscription;
    private String zipballUrl;

    public Commit() {
    }

    public Commit(String abbreviatedOid, Integer additions, PullRequestConnection associatedPullRequests, GitActor author, Boolean authoredByCommitter, String authoredDate, Blame blame, Integer changedFiles, CheckSuiteConnection checkSuites, CommitCommentConnection comments, String commitResourcePath, String commitUrl, String committedDate, Boolean committedViaWeb, GitActor committer, Integer deletions, DeploymentConnection deployments, CommitHistoryConnection history, String id, String message, String messageBody, String messageBodyHTML, String messageHeadline, String messageHeadlineHTML, String oid, CommitConnection parents, String pushedDate, Repository repository, String resourcePath, GitSignature signature, Status status, String tarballUrl, Tree tree, String treeResourcePath, String treeUrl, String url, Boolean viewerCanSubscribe, SubscriptionState viewerSubscription, String zipballUrl) {
        this.abbreviatedOid = abbreviatedOid;
        this.additions = additions;
        this.associatedPullRequests = associatedPullRequests;
        this.author = author;
        this.authoredByCommitter = authoredByCommitter;
        this.authoredDate = authoredDate;
        this.blame = blame;
        this.changedFiles = changedFiles;
        this.checkSuites = checkSuites;
        this.comments = comments;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.committedDate = committedDate;
        this.committedViaWeb = committedViaWeb;
        this.committer = committer;
        this.deletions = deletions;
        this.deployments = deployments;
        this.history = history;
        this.id = id;
        this.message = message;
        this.messageBody = messageBody;
        this.messageBodyHTML = messageBodyHTML;
        this.messageHeadline = messageHeadline;
        this.messageHeadlineHTML = messageHeadlineHTML;
        this.oid = oid;
        this.parents = parents;
        this.pushedDate = pushedDate;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.signature = signature;
        this.status = status;
        this.tarballUrl = tarballUrl;
        this.tree = tree;
        this.treeResourcePath = treeResourcePath;
        this.treeUrl = treeUrl;
        this.url = url;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerSubscription = viewerSubscription;
        this.zipballUrl = zipballUrl;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }
    public void setAbbreviatedOid(String abbreviatedOid) {
        this.abbreviatedOid = abbreviatedOid;
    }

    public Integer getAdditions() {
        return additions;
    }
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public PullRequestConnection getAssociatedPullRequests() {
        return associatedPullRequests;
    }
    public void setAssociatedPullRequests(PullRequestConnection associatedPullRequests) {
        this.associatedPullRequests = associatedPullRequests;
    }

    public GitActor getAuthor() {
        return author;
    }
    public void setAuthor(GitActor author) {
        this.author = author;
    }

    public Boolean getAuthoredByCommitter() {
        return authoredByCommitter;
    }
    public void setAuthoredByCommitter(Boolean authoredByCommitter) {
        this.authoredByCommitter = authoredByCommitter;
    }

    public String getAuthoredDate() {
        return authoredDate;
    }
    public void setAuthoredDate(String authoredDate) {
        this.authoredDate = authoredDate;
    }

    public Blame getBlame() {
        return blame;
    }
    public void setBlame(Blame blame) {
        this.blame = blame;
    }

    public Integer getChangedFiles() {
        return changedFiles;
    }
    public void setChangedFiles(Integer changedFiles) {
        this.changedFiles = changedFiles;
    }

    public CheckSuiteConnection getCheckSuites() {
        return checkSuites;
    }
    public void setCheckSuites(CheckSuiteConnection checkSuites) {
        this.checkSuites = checkSuites;
    }

    public CommitCommentConnection getComments() {
        return comments;
    }
    public void setComments(CommitCommentConnection comments) {
        this.comments = comments;
    }

    public String getCommitResourcePath() {
        return commitResourcePath;
    }
    public void setCommitResourcePath(String commitResourcePath) {
        this.commitResourcePath = commitResourcePath;
    }

    public String getCommitUrl() {
        return commitUrl;
    }
    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public String getCommittedDate() {
        return committedDate;
    }
    public void setCommittedDate(String committedDate) {
        this.committedDate = committedDate;
    }

    public Boolean getCommittedViaWeb() {
        return committedViaWeb;
    }
    public void setCommittedViaWeb(Boolean committedViaWeb) {
        this.committedViaWeb = committedViaWeb;
    }

    public GitActor getCommitter() {
        return committer;
    }
    public void setCommitter(GitActor committer) {
        this.committer = committer;
    }

    public Integer getDeletions() {
        return deletions;
    }
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public DeploymentConnection getDeployments() {
        return deployments;
    }
    public void setDeployments(DeploymentConnection deployments) {
        this.deployments = deployments;
    }

    public CommitHistoryConnection getHistory() {
        return history;
    }
    public void setHistory(CommitHistoryConnection history) {
        this.history = history;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageBody() {
        return messageBody;
    }
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageBodyHTML() {
        return messageBodyHTML;
    }
    public void setMessageBodyHTML(String messageBodyHTML) {
        this.messageBodyHTML = messageBodyHTML;
    }

    public String getMessageHeadline() {
        return messageHeadline;
    }
    public void setMessageHeadline(String messageHeadline) {
        this.messageHeadline = messageHeadline;
    }

    public String getMessageHeadlineHTML() {
        return messageHeadlineHTML;
    }
    public void setMessageHeadlineHTML(String messageHeadlineHTML) {
        this.messageHeadlineHTML = messageHeadlineHTML;
    }

    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public CommitConnection getParents() {
        return parents;
    }
    public void setParents(CommitConnection parents) {
        this.parents = parents;
    }

    public String getPushedDate() {
        return pushedDate;
    }
    public void setPushedDate(String pushedDate) {
        this.pushedDate = pushedDate;
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

    public GitSignature getSignature() {
        return signature;
    }
    public void setSignature(GitSignature signature) {
        this.signature = signature;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTarballUrl() {
        return tarballUrl;
    }
    public void setTarballUrl(String tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    public Tree getTree() {
        return tree;
    }
    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public String getTreeResourcePath() {
        return treeResourcePath;
    }
    public void setTreeResourcePath(String treeResourcePath) {
        this.treeResourcePath = treeResourcePath;
    }

    public String getTreeUrl() {
        return treeUrl;
    }
    public void setTreeUrl(String treeUrl) {
        this.treeUrl = treeUrl;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }
    public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
        this.viewerCanSubscribe = viewerCanSubscribe;
    }

    public SubscriptionState getViewerSubscription() {
        return viewerSubscription;
    }
    public void setViewerSubscription(SubscriptionState viewerSubscription) {
        this.viewerSubscription = viewerSubscription;
    }

    public String getZipballUrl() {
        return zipballUrl;
    }
    public void setZipballUrl(String zipballUrl) {
        this.zipballUrl = zipballUrl;
    }

}