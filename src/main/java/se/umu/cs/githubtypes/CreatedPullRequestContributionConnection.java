package se.umu.cs.githubtypes;

import java.util.Collection;

public class CreatedPullRequestContributionConnection {

    private Collection<CreatedPullRequestContributionEdge> edges;
    private Collection<CreatedPullRequestContribution> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CreatedPullRequestContributionConnection() {
    }

    public CreatedPullRequestContributionConnection(Collection<CreatedPullRequestContributionEdge> edges, Collection<CreatedPullRequestContribution> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedPullRequestContributionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedPullRequestContributionEdge> edges) {
        this.edges = edges;
    }

    public Collection<CreatedPullRequestContribution> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedPullRequestContribution> nodes) {
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