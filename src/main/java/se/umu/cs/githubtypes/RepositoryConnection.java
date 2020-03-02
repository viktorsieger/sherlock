package se.umu.cs.githubtypes;

import java.util.Collection;

public class RepositoryConnection {

    private Collection<RepositoryEdge> edges;
    private Collection<Repository> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;
    private Integer totalDiskUsage;

    public RepositoryConnection() {
    }

    public RepositoryConnection(Collection<RepositoryEdge> edges, Collection<Repository> nodes, PageInfo pageInfo, Integer totalCount, Integer totalDiskUsage) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.totalDiskUsage = totalDiskUsage;
    }

    public Collection<RepositoryEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RepositoryEdge> edges) {
        this.edges = edges;
    }

    public Collection<Repository> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Repository> nodes) {
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

    public Integer getTotalDiskUsage() {
        return totalDiskUsage;
    }
    public void setTotalDiskUsage(Integer totalDiskUsage) {
        this.totalDiskUsage = totalDiskUsage;
    }

}