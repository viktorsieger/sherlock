package se.umu.cs.githubtypes;

import java.util.Collection;

public class CheckSuiteConnection {

    private Collection<CheckSuiteEdge> edges;
    private Collection<CheckSuite> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CheckSuiteConnection() {
    }

    public CheckSuiteConnection(Collection<CheckSuiteEdge> edges, Collection<CheckSuite> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CheckSuiteEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CheckSuiteEdge> edges) {
        this.edges = edges;
    }

    public Collection<CheckSuite> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CheckSuite> nodes) {
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