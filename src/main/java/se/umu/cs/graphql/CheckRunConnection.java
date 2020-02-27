package se.umu.cs.graphql;

import java.util.*;

public class CheckRunConnection {

    private Collection<CheckRunEdge> edges;
    private Collection<CheckRun> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public CheckRunConnection() {
    }

    public CheckRunConnection(Collection<CheckRunEdge> edges, Collection<CheckRun> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<CheckRunEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<CheckRunEdge> edges) {
        this.edges = edges;
    }

    public Collection<CheckRun> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<CheckRun> nodes) {
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