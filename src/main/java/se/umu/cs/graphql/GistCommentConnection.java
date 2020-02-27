package se.umu.cs.graphql;

import java.util.*;

public class GistCommentConnection {

    private Collection<GistCommentEdge> edges;
    private Collection<GistComment> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public GistCommentConnection() {
    }

    public GistCommentConnection(Collection<GistCommentEdge> edges, Collection<GistComment> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<GistCommentEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<GistCommentEdge> edges) {
        this.edges = edges;
    }

    public Collection<GistComment> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<GistComment> nodes) {
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