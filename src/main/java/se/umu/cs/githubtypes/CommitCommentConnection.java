package se.umu.cs.githubtypes;

import java.util.Collection;

public class CommitCommentConnection {

    private Collection<CommitCommentEdge> edges;
    private Collection<CommitComment> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CommitCommentConnection() {
    }

    public CommitCommentConnection(Collection<CommitCommentEdge> edges, Collection<CommitComment> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CommitCommentEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CommitCommentEdge> edges) {
        this.edges = edges;
    }

    public Collection<CommitComment> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CommitComment> nodes) {
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