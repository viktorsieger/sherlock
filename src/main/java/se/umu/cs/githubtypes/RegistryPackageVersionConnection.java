package se.umu.cs.githubtypes;

import java.util.Collection;

public class RegistryPackageVersionConnection {

    private Collection<RegistryPackageVersionEdge> edges;
    private Collection<RegistryPackageVersion> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public RegistryPackageVersionConnection() {
    }

    public RegistryPackageVersionConnection(Collection<RegistryPackageVersionEdge> edges, Collection<RegistryPackageVersion> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageVersionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageVersionEdge> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackageVersion> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackageVersion> nodes) {
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