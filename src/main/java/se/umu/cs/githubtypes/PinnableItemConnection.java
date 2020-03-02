package se.umu.cs.githubtypes;

import java.util.Collection;

public class PinnableItemConnection {

    private Collection<PinnableItemEdge> edges;
    private Collection<PinnableItem> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PinnableItemConnection() {
    }

    public PinnableItemConnection(Collection<PinnableItemEdge> edges, Collection<PinnableItem> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PinnableItemEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PinnableItemEdge> edges) {
        this.edges = edges;
    }

    public Collection<PinnableItem> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PinnableItem> nodes) {
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