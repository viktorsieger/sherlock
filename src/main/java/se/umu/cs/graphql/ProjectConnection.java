package se.umu.cs.graphql;

import java.util.*;

public class ProjectConnection {

    private Collection<ProjectEdge> edges;
    private Collection<Project> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public ProjectConnection() {
    }

    public ProjectConnection(Collection<ProjectEdge> edges, Collection<Project> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ProjectEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ProjectEdge> edges) {
        this.edges = edges;
    }

    public Collection<Project> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Project> nodes) {
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