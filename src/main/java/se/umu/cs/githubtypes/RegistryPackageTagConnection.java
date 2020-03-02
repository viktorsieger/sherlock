package se.umu.cs.githubtypes;

import java.util.Collection;

public class RegistryPackageTagConnection {

    private Collection<RegistryPackageTagEdge> edges;
    private Collection<RegistryPackageTag> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public RegistryPackageTagConnection() {
    }

    public RegistryPackageTagConnection(Collection<RegistryPackageTagEdge> edges, Collection<RegistryPackageTag> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageTagEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageTagEdge> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackageTag> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackageTag> nodes) {
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