package se.umu.cs.githubtypes;

import java.util.Collection;

public class ReleaseConnection {

    private Collection<ReleaseEdge> edges;
    private Collection<Release> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public ReleaseConnection() {
    }

    public ReleaseConnection(Collection<ReleaseEdge> edges, Collection<Release> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ReleaseEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReleaseEdge> edges) {
        this.edges = edges;
    }

    public Collection<Release> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Release> nodes) {
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