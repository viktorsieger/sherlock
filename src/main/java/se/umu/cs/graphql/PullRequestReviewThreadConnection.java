package se.umu.cs.graphql;

import java.util.*;

public class PullRequestReviewThreadConnection {

    private Collection<PullRequestReviewThreadEdge> edges;
    private Collection<PullRequestReviewThread> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PullRequestReviewThreadConnection() {
    }

    public PullRequestReviewThreadConnection(Collection<PullRequestReviewThreadEdge> edges, Collection<PullRequestReviewThread> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestReviewThreadEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestReviewThreadEdge> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestReviewThread> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestReviewThread> nodes) {
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