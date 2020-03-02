package se.umu.cs.githubtypes;

import java.util.Collection;

public class PublicKeyConnection {

    private Collection<PublicKeyEdge> edges;
    private Collection<PublicKey> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PublicKeyConnection() {
    }

    public PublicKeyConnection(Collection<PublicKeyEdge> edges, Collection<PublicKey> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PublicKeyEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PublicKeyEdge> edges) {
        this.edges = edges;
    }

    public Collection<PublicKey> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PublicKey> nodes) {
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