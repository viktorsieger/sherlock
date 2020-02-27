package se.umu.cs.graphql;

import java.util.*;

public class LabelConnection {

    private Collection<LabelEdge> edges;
    private Collection<Label> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public LabelConnection() {
    }

    public LabelConnection(Collection<LabelEdge> edges, Collection<Label> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<LabelEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<LabelEdge> edges) {
        this.edges = edges;
    }

    public Collection<Label> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Label> nodes) {
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