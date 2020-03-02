package se.umu.cs.githubtypes;

public class DraftPullRequestReviewThread {

    private String body;
    private Integer line;
    private String path;
    private DiffSide side;
    private Integer startLine;
    private DiffSide startSide;

    public DraftPullRequestReviewThread() {
    }

    public DraftPullRequestReviewThread(String body, Integer line, String path, DiffSide side, Integer startLine, DiffSide startSide) {
        this.body = body;
        this.line = line;
        this.path = path;
        this.side = side;
        this.startLine = startLine;
        this.startSide = startSide;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public Integer getLine() {
        return line;
    }
    public void setLine(Integer line) {
        this.line = line;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public DiffSide getSide() {
        return side;
    }
    public void setSide(DiffSide side) {
        this.side = side;
    }

    public Integer getStartLine() {
        return startLine;
    }
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    public DiffSide getStartSide() {
        return startSide;
    }
    public void setStartSide(DiffSide startSide) {
        this.startSide = startSide;
    }

}