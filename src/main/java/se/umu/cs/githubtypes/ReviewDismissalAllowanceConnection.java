package se.umu.cs.githubtypes;

import java.util.Collection;

public class ReviewDismissalAllowanceConnection {

    private Collection<ReviewDismissalAllowanceEdge> edges;
    private Collection<ReviewDismissalAllowance> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public ReviewDismissalAllowanceConnection() {
    }

    public ReviewDismissalAllowanceConnection(Collection<ReviewDismissalAllowanceEdge> edges, Collection<ReviewDismissalAllowance> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ReviewDismissalAllowanceEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReviewDismissalAllowanceEdge> edges) {
        this.edges = edges;
    }

    public Collection<ReviewDismissalAllowance> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ReviewDismissalAllowance> nodes) {
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