package se.umu.cs.githubtypes;

import java.util.Collection;

public class PackageFileConnection {

    private Collection<PackageFileEdge> edges;
    private Collection<PackageFile> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PackageFileConnection() {
    }

    public PackageFileConnection(Collection<PackageFileEdge> edges, Collection<PackageFile> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PackageFileEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PackageFileEdge> edges) {
        this.edges = edges;
    }

    public Collection<PackageFile> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PackageFile> nodes) {
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