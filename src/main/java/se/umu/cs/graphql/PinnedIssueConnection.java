package se.umu.cs.graphql;

import java.util.*;

public class PinnedIssueConnection {

    private Collection<PinnedIssueEdge> edges;
    private Collection<PinnedIssue> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PinnedIssueConnection() {
    }

    public PinnedIssueConnection(Collection<PinnedIssueEdge> edges, Collection<PinnedIssue> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PinnedIssueEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PinnedIssueEdge> edges) {
        this.edges = edges;
    }

    public Collection<PinnedIssue> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PinnedIssue> nodes) {
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