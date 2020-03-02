package se.umu.cs.githubtypes;

import java.util.Collection;

public class UserContentEditConnection {

    private Collection<UserContentEditEdge> edges;
    private Collection<UserContentEdit> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public UserContentEditConnection() {
    }

    public UserContentEditConnection(Collection<UserContentEditEdge> edges, Collection<UserContentEdit> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<UserContentEditEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<UserContentEditEdge> edges) {
        this.edges = edges;
    }

    public Collection<UserContentEdit> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<UserContentEdit> nodes) {
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