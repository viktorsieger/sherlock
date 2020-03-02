package se.umu.cs.githubtypes;

import java.util.Collection;

public class EnterpriseMemberConnection {

    private Collection<EnterpriseMemberEdge> edges;
    private Collection<EnterpriseMember> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseMemberConnection() {
    }

    public EnterpriseMemberConnection(Collection<EnterpriseMemberEdge> edges, Collection<EnterpriseMember> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseMemberEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseMemberEdge> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseMember> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseMember> nodes) {
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