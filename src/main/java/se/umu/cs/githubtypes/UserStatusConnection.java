package se.umu.cs.githubtypes;

import java.util.Collection;

public class UserStatusConnection {

    private Collection<UserStatusEdge> edges;
    private Collection<UserStatus> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public UserStatusConnection() {
    }

    public UserStatusConnection(Collection<UserStatusEdge> edges, Collection<UserStatus> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<UserStatusEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<UserStatusEdge> edges) {
        this.edges = edges;
    }

    public Collection<UserStatus> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<UserStatus> nodes) {
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