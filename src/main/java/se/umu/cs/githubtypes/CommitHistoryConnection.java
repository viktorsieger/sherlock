package se.umu.cs.githubtypes;

import java.util.Collection;

public class CommitHistoryConnection {

    private Collection<CommitEdge> edges;
    private Collection<Commit> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CommitHistoryConnection() {
    }

    public CommitHistoryConnection(Collection<CommitEdge> edges, Collection<Commit> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CommitEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CommitEdge> edges) {
        this.edges = edges;
    }

    public Collection<Commit> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Commit> nodes) {
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