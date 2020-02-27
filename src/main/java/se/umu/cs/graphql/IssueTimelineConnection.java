package se.umu.cs.graphql;

import java.util.*;

public class IssueTimelineConnection {

    private Collection<IssueTimelineItemEdge> edges;
    private Collection<IssueTimelineItem> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public IssueTimelineConnection() {
    }

    public IssueTimelineConnection(Collection<IssueTimelineItemEdge> edges, Collection<IssueTimelineItem> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<IssueTimelineItemEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<IssueTimelineItemEdge> edges) {
        this.edges = edges;
    }

    public Collection<IssueTimelineItem> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<IssueTimelineItem> nodes) {
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