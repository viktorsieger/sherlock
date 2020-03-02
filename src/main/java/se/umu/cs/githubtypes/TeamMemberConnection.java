package se.umu.cs.githubtypes;

import java.util.Collection;

public class TeamMemberConnection {

    private Collection<TeamMemberEdge> edges;
    private Collection<User> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public TeamMemberConnection() {
    }

    public TeamMemberConnection(Collection<TeamMemberEdge> edges, Collection<User> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamMemberEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamMemberEdge> edges) {
        this.edges = edges;
    }

    public Collection<User> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<User> nodes) {
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