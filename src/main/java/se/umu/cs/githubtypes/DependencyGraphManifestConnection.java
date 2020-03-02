package se.umu.cs.githubtypes;

import java.util.Collection;

public class DependencyGraphManifestConnection {

    private Collection<DependencyGraphManifestEdge> edges;
    private Collection<DependencyGraphManifest> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public DependencyGraphManifestConnection() {
    }

    public DependencyGraphManifestConnection(Collection<DependencyGraphManifestEdge> edges, Collection<DependencyGraphManifest> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DependencyGraphManifestEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DependencyGraphManifestEdge> edges) {
        this.edges = edges;
    }

    public Collection<DependencyGraphManifest> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DependencyGraphManifest> nodes) {
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