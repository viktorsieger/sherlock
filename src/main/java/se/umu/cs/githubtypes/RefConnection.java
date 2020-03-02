package se.umu.cs.githubtypes;

import java.util.Collection;

public class RefConnection {

    private Collection<RefEdge> edges;
    private Collection<Ref> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public RefConnection() {
    }

    public RefConnection(Collection<RefEdge> edges, Collection<Ref> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RefEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RefEdge> edges) {
        this.edges = edges;
    }

    public Collection<Ref> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Ref> nodes) {
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