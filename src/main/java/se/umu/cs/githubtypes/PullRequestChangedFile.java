package se.umu.cs.githubtypes;

public class PullRequestChangedFile {

    private Integer additions;
    private Integer deletions;
    private String path;

    public PullRequestChangedFile() {
    }

    public PullRequestChangedFile(Integer additions, Integer deletions, String path) {
        this.additions = additions;
        this.deletions = deletions;
        this.path = path;
    }

    public Integer getAdditions() {
        return additions;
    }
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public Integer getDeletions() {
        return deletions;
    }
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

}