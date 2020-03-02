package se.umu.cs.githubtypes;

import java.util.Collection;

public class CreatedPullRequestReviewContributionConnection {

    private Collection<CreatedPullRequestReviewContributionEdge> edges;
    private Collection<CreatedPullRequestReviewContribution> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CreatedPullRequestReviewContributionConnection() {
    }

    public CreatedPullRequestReviewContributionConnection(Collection<CreatedPullRequestReviewContributionEdge> edges, Collection<CreatedPullRequestReviewContribution> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedPullRequestReviewContributionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedPullRequestReviewContributionEdge> edges) {
        this.edges = edges;
    }

    public Collection<CreatedPullRequestReviewContribution> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedPullRequestReviewContribution> nodes) {
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