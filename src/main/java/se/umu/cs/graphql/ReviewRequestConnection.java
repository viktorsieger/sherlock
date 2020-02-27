package se.umu.cs.graphql;

import java.util.*;

public class ReviewRequestConnection {

    private Collection<ReviewRequestEdge> edges;
    private Collection<ReviewRequest> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public ReviewRequestConnection() {
    }

    public ReviewRequestConnection(Collection<ReviewRequestEdge> edges, Collection<ReviewRequest> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ReviewRequestEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReviewRequestEdge> edges) {
        this.edges = edges;
    }

    public Collection<ReviewRequest> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ReviewRequest> nodes) {
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