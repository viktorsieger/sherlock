package se.umu.cs.githubtypes;

import java.util.Collection;

public class PullRequestCommitConnection {

    private Collection<PullRequestCommitEdge> edges;
    private Collection<PullRequestCommit> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PullRequestCommitConnection() {
    }

    public PullRequestCommitConnection(Collection<PullRequestCommitEdge> edges, Collection<PullRequestCommit> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestCommitEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestCommitEdge> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestCommit> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestCommit> nodes) {
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