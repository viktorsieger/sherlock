package se.umu.cs.githubtypes;

import java.util.Collection;

public class TeamConnection {

    private Collection<TeamEdge> edges;
    private Collection<Team> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public TeamConnection() {
    }

    public TeamConnection(Collection<TeamEdge> edges, Collection<Team> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamEdge> edges) {
        this.edges = edges;
    }

    public Collection<Team> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Team> nodes) {
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