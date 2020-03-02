package se.umu.cs.githubtypes;

import java.util.Collection;

public class PullRequestTimelineConnection {

    private Collection<PullRequestTimelineItemEdge> edges;
    private Collection<PullRequestTimelineItem> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PullRequestTimelineConnection() {
    }

    public PullRequestTimelineConnection(Collection<PullRequestTimelineItemEdge> edges, Collection<PullRequestTimelineItem> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestTimelineItemEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestTimelineItemEdge> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestTimelineItem> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestTimelineItem> nodes) {
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