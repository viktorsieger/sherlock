package se.umu.cs.githubtypes;

import java.util.Collection;

public class CheckAnnotationConnection {

    private Collection<CheckAnnotationEdge> edges;
    private Collection<CheckAnnotation> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CheckAnnotationConnection() {
    }

    public CheckAnnotationConnection(Collection<CheckAnnotationEdge> edges, Collection<CheckAnnotation> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CheckAnnotationEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CheckAnnotationEdge> edges) {
        this.edges = edges;
    }

    public Collection<CheckAnnotation> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CheckAnnotation> nodes) {
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