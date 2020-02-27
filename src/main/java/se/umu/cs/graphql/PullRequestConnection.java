package se.umu.cs.graphql;

import java.util.*;

public class PullRequestConnection {

    private Collection<PullRequestEdge> edges;
    private Collection<PullRequest> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PullRequestConnection() {
    }

    public PullRequestConnection(Collection<PullRequestEdge> edges, Collection<PullRequest> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestEdge> edges) {
        this.edges = edges;
    }

    public Collection<PullRequest> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequest> nodes) {
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