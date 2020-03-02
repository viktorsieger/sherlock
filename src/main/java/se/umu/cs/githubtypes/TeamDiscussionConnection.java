package se.umu.cs.githubtypes;

import java.util.Collection;

public class TeamDiscussionConnection {

    private Collection<TeamDiscussionEdge> edges;
    private Collection<TeamDiscussion> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public TeamDiscussionConnection() {
    }

    public TeamDiscussionConnection(Collection<TeamDiscussionEdge> edges, Collection<TeamDiscussion> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TeamDiscussionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TeamDiscussionEdge> edges) {
        this.edges = edges;
    }

    public Collection<TeamDiscussion> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<TeamDiscussion> nodes) {
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