package se.umu.cs.graphql;

import java.util.*;

public class UserConnection {

    private Collection<UserEdge> edges;
    private Collection<User> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public UserConnection() {
    }

    public UserConnection(Collection<UserEdge> edges, Collection<User> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<UserEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<UserEdge> edges) {
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