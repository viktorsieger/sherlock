package se.umu.cs.graphql;

import java.util.*;

public class AddPullRequestReviewThreadInput {

    private String body;
    private String clientMutationId;
    private Integer line;
    private String path;
    private String pullRequestReviewId;
    private DiffSide side;
    private Integer startLine;
    private DiffSide startSide;

    public AddPullRequestReviewThreadInput() {
    }

    public AddPullRequestReviewThreadInput(String body, String clientMutationId, Integer line, String path, String pullRequestReviewId, DiffSide side, Integer startLine, DiffSide startSide) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.line = line;
        this.path = path;
        this.pullRequestReviewId = pullRequestReviewId;
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

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
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

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }
    public void setPullRequestReviewId(String pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
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