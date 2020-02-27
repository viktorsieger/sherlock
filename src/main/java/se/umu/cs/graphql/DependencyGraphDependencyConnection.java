package se.umu.cs.graphql;

import java.util.*;

public class DependencyGraphDependencyConnection {

    private Collection<DependencyGraphDependencyEdge> edges;
    private Collection<DependencyGraphDependency> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public DependencyGraphDependencyConnection() {
    }

    public DependencyGraphDependencyConnection(Collection<DependencyGraphDependencyEdge> edges, Collection<DependencyGraphDependency> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DependencyGraphDependencyEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DependencyGraphDependencyEdge> edges) {
        this.edges = edges;
    }

    public Collection<DependencyGraphDependency> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DependencyGraphDependency> nodes) {
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