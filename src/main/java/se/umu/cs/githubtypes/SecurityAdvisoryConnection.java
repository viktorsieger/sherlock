package se.umu.cs.githubtypes;

import java.util.Collection;

public class SecurityAdvisoryConnection {

    private Collection<SecurityAdvisoryEdge> edges;
    private Collection<SecurityAdvisory> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public SecurityAdvisoryConnection() {
    }

    public SecurityAdvisoryConnection(Collection<SecurityAdvisoryEdge> edges, Collection<SecurityAdvisory> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<SecurityAdvisoryEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SecurityAdvisoryEdge> edges) {
        this.edges = edges;
    }

    public Collection<SecurityAdvisory> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SecurityAdvisory> nodes) {
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