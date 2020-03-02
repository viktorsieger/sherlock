package se.umu.cs.githubtypes;

import java.util.Collection;

public class PackageVersionConnection {

    private Collection<PackageVersionEdge> edges;
    private Collection<PackageVersion> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PackageVersionConnection() {
    }

    public PackageVersionConnection(Collection<PackageVersionEdge> edges, Collection<PackageVersion> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PackageVersionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PackageVersionEdge> edges) {
        this.edges = edges;
    }

    public Collection<PackageVersion> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PackageVersion> nodes) {
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