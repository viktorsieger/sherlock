package se.umu.cs.githubtypes;

import java.util.Collection;

public class IssueTimelineItemsConnection {

    private Collection<IssueTimelineItemsEdge> edges;
    private Integer filteredCount;
    private Collection<IssueTimelineItems> nodes;
    private Integer pageCount;
    private PageInfo pageInfo;
    private Integer totalCount;
    private String updatedAt;

    public IssueTimelineItemsConnection() {
    }

    public IssueTimelineItemsConnection(Collection<IssueTimelineItemsEdge> edges, Integer filteredCount, Collection<IssueTimelineItems> nodes, Integer pageCount, PageInfo pageInfo, Integer totalCount, String updatedAt) {
        this.edges = edges;
        this.filteredCount = filteredCount;
        this.nodes = nodes;
        this.pageCount = pageCount;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.updatedAt = updatedAt;
    }

    public Collection<IssueTimelineItemsEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<IssueTimelineItemsEdge> edges) {
        this.edges = edges;
    }

    public Integer getFilteredCount() {
        return filteredCount;
    }
    public void setFilteredCount(Integer filteredCount) {
        this.filteredCount = filteredCount;
    }

    public Collection<IssueTimelineItems> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<IssueTimelineItems> nodes) {
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