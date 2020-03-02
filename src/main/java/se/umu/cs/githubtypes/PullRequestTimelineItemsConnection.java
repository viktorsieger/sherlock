package se.umu.cs.githubtypes;

import java.util.Collection;

public class PullRequestTimelineItemsConnection {

    private Collection<PullRequestTimelineItemsEdge> edges;
    private Integer filteredCount;
    private Collection<PullRequestTimelineItems> nodes;
    private Integer pageCount;
    private PageInfo pageInfo;
    private Integer totalCount;
    private String updatedAt;

    public PullRequestTimelineItemsConnection() {
    }

    public PullRequestTimelineItemsConnection(Collection<PullRequestTimelineItemsEdge> edges, Integer filteredCount, Collection<PullRequestTimelineItems> nodes, Integer pageCount, PageInfo pageInfo, Integer totalCount, String updatedAt) {
        this.edges = edges;
        this.filteredCount = filteredCount;
        this.nodes = nodes;
        this.pageCount = pageCount;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.updatedAt = updatedAt;
    }

    public Collection<PullRequestTimelineItemsEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestTimelineItemsEdge> edges) {
        this.edges = edges;
    }

    public Integer getFilteredCount() {
        return filteredCount;
    }
    public void setFilteredCount(Integer filteredCount) {
        this.filteredCount = filteredCount;
    }

    public Collection<PullRequestTimelineItems> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestTimelineItems> nodes) {
        this.nodes = nodes;
    }

    public Integer getPageCount() {
        return pageCount;
    }
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
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

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}