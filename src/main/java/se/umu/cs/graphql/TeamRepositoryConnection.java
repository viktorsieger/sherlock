package se.umu.cs.graphql;

import java.util.*;

public class TeamRepositoryConnection {

    private Collection<TeamRepositoryEdge> edges;
    private Collection<Repository> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public TeamRepositoryConnection() {
    }

    public TeamRepositoryConnection(Collection<TeamRepositoryEdge> edges, Collection<Repository> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamRepositoryEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamRepositoryEdge> edges) {
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

}