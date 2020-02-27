package se.umu.cs.graphql;

import java.util.*;

public class RegistryPackageFileConnection {

    private Collection<RegistryPackageFileEdge> edges;
    private Collection<RegistryPackageFile> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public RegistryPackageFileConnection() {
    }

    public RegistryPackageFileConnection(Collection<RegistryPackageFileEdge> edges, Collection<RegistryPackageFile> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RegistryPackageFileEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RegistryPackageFileEdge> edges) {
        this.edges = edges;
    }

    public Collection<RegistryPackageFile> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RegistryPackageFile> nodes) {
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