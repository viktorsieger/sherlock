package se.umu.cs.githubtypes;

import java.util.Collection;

public class RegistryPackageConnection {

    private Collection<RegistryPackageEdge> edges;
    private Collection<RegistryPackage> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public RegistryPackageConnection() {
    }

    public RegistryPackageConnection(Collection<RegistryPackageEdge> edges, Collection<RegistryPackage> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageEdge> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackage> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackage> nodes) {
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