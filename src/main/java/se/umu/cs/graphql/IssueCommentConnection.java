package se.umu.cs.graphql;

import java.util.*;

public class IssueCommentConnection {

    private Collection<IssueCommentEdge> edges;
    private Collection<IssueComment> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public IssueCommentConnection() {
    }

    public IssueCommentConnection(Collection<IssueCommentEdge> edges, Collection<IssueComment> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<IssueCommentEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<IssueCommentEdge> edges) {
        this.edges = edges;
    }

    public Collection<IssueComment> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<IssueComment> nodes) {
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