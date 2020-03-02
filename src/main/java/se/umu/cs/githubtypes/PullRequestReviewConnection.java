package se.umu.cs.githubtypes;

import java.util.Collection;

public class PullRequestReviewConnection {

    private Collection<PullRequestReviewEdge> edges;
    private Collection<PullRequestReview> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PullRequestReviewConnection() {
    }

    public PullRequestReviewConnection(Collection<PullRequestReviewEdge> edges, Collection<PullRequestReview> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestReviewEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestReviewEdge> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestReview> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestReview> nodes) {
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