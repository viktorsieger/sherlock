package se.umu.cs.graphql;

import java.util.*;

public class ProjectCardConnection {

    private Collection<ProjectCardEdge> edges;
    private Collection<ProjectCard> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public ProjectCardConnection() {
    }

    public ProjectCardConnection(Collection<ProjectCardEdge> edges, Collection<ProjectCard> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ProjectCardEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ProjectCardEdge> edges) {
        this.edges = edges;
    }

    public Collection<ProjectCard> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ProjectCard> nodes) {
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