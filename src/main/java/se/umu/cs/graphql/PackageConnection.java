package se.umu.cs.graphql;

import java.util.*;

public class PackageConnection {

    private Collection<PackageEdge> edges;
    private Collection<Package> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PackageConnection() {
    }

    public PackageConnection(Collection<PackageEdge> edges, Collection<Package> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PackageEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PackageEdge> edges) {
        this.edges = edges;
    }

    public Collection<Package> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Package> nodes) {
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