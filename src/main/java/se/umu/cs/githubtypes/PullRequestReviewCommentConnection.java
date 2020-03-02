package se.umu.cs.githubtypes;

import java.util.Collection;

public class PullRequestReviewCommentConnection {

    private Collection<PullRequestReviewCommentEdge> edges;
    private Collection<PullRequestReviewComment> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PullRequestReviewCommentConnection() {
    }

    public PullRequestReviewCommentConnection(Collection<PullRequestReviewCommentEdge> edges, Collection<PullRequestReviewComment> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestReviewCommentEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestReviewCommentEdge> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestReviewComment> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestReviewComment> nodes) {
        this.nodes = nodes;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}