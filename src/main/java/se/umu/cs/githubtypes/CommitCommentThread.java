package se.umu.cs.githubtypes;

public class CommitCommentThread implements PullRequestTimelineItem, Node, RepositoryNode{

    private CommitCommentConnection comments;
    private Commit commit;
    private String id;
    private String path;
    private Integer position;
    private Repository repository;

    public CommitCommentThread() {
    }

    public CommitCommentThread(CommitCommentConnection comments, Commit commit, String id, String path, Integer position, Repository repository) {
        this.comments = comments;
        this.commit = commit;
        this.id = id;
        this.path = path;
        this.position = position;
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

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}