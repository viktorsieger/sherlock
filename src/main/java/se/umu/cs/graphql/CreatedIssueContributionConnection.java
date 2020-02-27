package se.umu.cs.graphql;

import java.util.*;

public class CreatedIssueContributionConnection {

    private Collection<CreatedIssueContributionEdge> edges;
    private Collection<CreatedIssueContribution> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CreatedIssueContributionConnection() {
    }

    public CreatedIssueContributionConnection(Collection<CreatedIssueContributionEdge> edges, Collection<CreatedIssueContribution> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CreatedIssueContributionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CreatedIssueContributionEdge> edges) {
        this.edges = edges;
    }

    public Collection<CreatedIssueContribution> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CreatedIssueContribution> nodes) {
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