package se.umu.cs.graphql;

import java.util.*;

public class TeamDiscussionCommentConnection {

    private Collection<TeamDiscussionCommentEdge> edges;
    private Collection<TeamDiscussionComment> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public TeamDiscussionCommentConnection() {
    }

    public TeamDiscussionCommentConnection(Collection<TeamDiscussionCommentEdge> edges, Collection<TeamDiscussionComment> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamDiscussionCommentEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamDiscussionCommentEdge> edges) {
        this.edges = edges;
    }

    public Collection<TeamDiscussionComment> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<TeamDiscussionComment> nodes) {
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