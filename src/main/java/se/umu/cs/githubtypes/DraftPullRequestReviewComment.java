package se.umu.cs.githubtypes;

public class DraftPullRequestReviewComment {

    private String body;
    private String path;
    private Integer position;

    public DraftPullRequestReviewComment() {
    }

    public DraftPullRequestReviewComment(String body, String path, Integer position) {
        this.body = body;
        this.path = path;
        this.position = position;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
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

}