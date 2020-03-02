package se.umu.cs.githubtypes;

import java.util.Collection;

public class SavedReplyConnection {

    private Collection<SavedReplyEdge> edges;
    private Collection<SavedReply> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public SavedReplyConnection() {
    }

    public SavedReplyConnection(Collection<SavedReplyEdge> edges, Collection<SavedReply> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<SavedReplyEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SavedReplyEdge> edges) {
        this.edges = edges;
    }

    public Collection<SavedReply> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SavedReply> nodes) {
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