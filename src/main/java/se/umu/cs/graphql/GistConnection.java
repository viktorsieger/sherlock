package se.umu.cs.graphql;

import java.util.*;

public class GistConnection {

    private Collection<GistEdge> edges;
    private Collection<Gist> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public GistConnection() {
    }

    public GistConnection(Collection<GistEdge> edges, Collection<Gist> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<GistEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<GistEdge> edges) {
        this.edges = edges;
    }

    public Collection<Gist> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Gist> nodes) {
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