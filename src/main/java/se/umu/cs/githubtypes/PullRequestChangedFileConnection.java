package se.umu.cs.githubtypes;

import java.util.Collection;

public class PullRequestChangedFileConnection {

    private Collection<PullRequestChangedFileEdge> edges;
    private Collection<PullRequestChangedFile> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public PullRequestChangedFileConnection() {
    }

    public PullRequestChangedFileConnection(Collection<PullRequestChangedFileEdge> edges, Collection<PullRequestChangedFile> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<PullRequestChangedFileEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<PullRequestChangedFileEdge> edges) {
        this.edges = edges;
    }

    public Collection<PullRequestChangedFile> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<PullRequestChangedFile> nodes) {
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