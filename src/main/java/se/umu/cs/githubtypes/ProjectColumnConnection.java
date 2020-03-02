package se.umu.cs.githubtypes;

import java.util.Collection;

public class ProjectColumnConnection {

    private Collection<ProjectColumnEdge> edges;
    private Collection<ProjectColumn> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public ProjectColumnConnection() {
    }

    public ProjectColumnConnection(Collection<ProjectColumnEdge> edges, Collection<ProjectColumn> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ProjectColumnEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ProjectColumnEdge> edges) {
        this.edges = edges;
    }

    public Collection<ProjectColumn> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ProjectColumn> nodes) {
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