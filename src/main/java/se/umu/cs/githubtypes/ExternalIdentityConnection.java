package se.umu.cs.githubtypes;

import java.util.Collection;

public class ExternalIdentityConnection {

    private Collection<ExternalIdentityEdge> edges;
    private Collection<ExternalIdentity> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public ExternalIdentityConnection() {
    }

    public ExternalIdentityConnection(Collection<ExternalIdentityEdge> edges, Collection<ExternalIdentity> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ExternalIdentityEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ExternalIdentityEdge> edges) {
        this.edges = edges;
    }

    public Collection<ExternalIdentity> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ExternalIdentity> nodes) {
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