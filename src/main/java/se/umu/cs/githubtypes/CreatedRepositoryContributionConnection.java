package se.umu.cs.githubtypes;

import java.util.Collection;

public class CreatedRepositoryContributionConnection {

    private Collection<CreatedRepositoryContributionEdge> edges;
    private Collection<CreatedRepositoryContribution> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CreatedRepositoryContributionConnection() {
    }

    public CreatedRepositoryContributionConnection(Collection<CreatedRepositoryContributionEdge> edges, Collection<CreatedRepositoryContribution> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedRepositoryContributionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedRepositoryContributionEdge> edges) {
        this.edges = edges;
    }

    public Collection<CreatedRepositoryContribution> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedRepositoryContribution> nodes) {
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