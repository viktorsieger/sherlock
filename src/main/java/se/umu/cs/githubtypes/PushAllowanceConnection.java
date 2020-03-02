package se.umu.cs.githubtypes;

import java.util.Collection;

public class PushAllowanceConnection {

    private Collection<PushAllowanceEdge> edges;
    private Collection<PushAllowance> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PushAllowanceConnection() {
    }

    public PushAllowanceConnection(Collection<PushAllowanceEdge> edges, Collection<PushAllowance> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PushAllowanceEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PushAllowanceEdge> edges) {
        this.edges = edges;
    }

    public Collection<PushAllowance> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PushAllowance> nodes) {
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