package se.umu.cs.githubtypes;

import java.util.Collection;

public class ReactionConnection {

    private Collection<ReactionEdge> edges;
    private Collection<Reaction> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;
    private Boolean viewerHasReacted;

    public ReactionConnection() {
    }

    public ReactionConnection(Collection<ReactionEdge> edges, Collection<Reaction> nodes, PageInfo pageInfo, Integer totalCount, Boolean viewerHasReacted) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.viewerHasReacted = viewerHasReacted;
    }

    public Collection<ReactionEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReactionEdge> edges) {
        this.edges = edges;
    }

    public Collection<Reaction> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Reaction> nodes) {
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

    public Boolean getViewerHasReacted() {
        return viewerHasReacted;
    }
    public void setViewerHasReacted(Boolean viewerHasReacted) {
        this.viewerHasReacted = viewerHasReacted;
    }

}