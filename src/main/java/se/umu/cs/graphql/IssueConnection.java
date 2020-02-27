package se.umu.cs.graphql;

import java.util.*;

public class IssueConnection {

    private Collection<IssueEdge> edges;
    private Collection<Issue> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public IssueConnection() {
    }

    public IssueConnection(Collection<IssueEdge> edges, Collection<Issue> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<IssueEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<IssueEdge> edges) {
        this.edges = edges;
    }

    public Collection<Issue> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Issue> nodes) {
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