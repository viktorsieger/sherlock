package se.umu.cs.githubtypes;

public class PullRequestCommitCommentThread implements PullRequestTimelineItems, Node, RepositoryNode{

    private CommitCommentConnection comments;
    private Commit commit;
    private String id;
    private String path;
    private Integer position;
    private PullRequest pullRequest;
    private Repository repository;

    public PullRequestCommitCommentThread() {
    }

    public PullRequestCommitCommentThread(CommitCommentConnection comments, Commit commit, String id, String path, Integer position, PullRequest pullRequest, Repository repository) {
        this.comments = comments;
        this.commit = commit;
        this.id = id;
        this.path = path;
        this.position = position;
        this.pullRequest = pullRequest;
        this.repository = repository;
    }

    public CommitCommentConnection getComments() {
        return comments;
    }
    public void setComments(CommitCommentConnection comments) {
        this.comments = comments;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

}