package se.umu.cs.githubtypes;

import java.util.Collection;

public class RegistryPackageDependencyConnection {

    private Collection<RegistryPackageDependencyEdge> edges;
    private Collection<RegistryPackageDependency> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public RegistryPackageDependencyConnection() {
    }

    public RegistryPackageDependencyConnection(Collection<RegistryPackageDependencyEdge> edges, Collection<RegistryPackageDependency> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageDependencyEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageDependencyEdge> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackageDependency> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackageDependency> nodes) {
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