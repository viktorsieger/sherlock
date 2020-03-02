package se.umu.cs.githubtypes;

import java.util.Collection;

public class CreatedCommitContributionConnection {

    private Collection<CreatedCommitContributionEdge> edges;
    private Collection<CreatedCommitContribution> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CreatedCommitContributionConnection() {
    }

    public CreatedCommitContributionConnection(Collection<CreatedCommitContributionEdge> edges, Collection<CreatedCommitContribution> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedCommitContributionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedCommitContributionEdge> edges) {
        this.edges = edges;
    }

    public Collection<CreatedCommitContribution> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedCommitContribution> nodes) {
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