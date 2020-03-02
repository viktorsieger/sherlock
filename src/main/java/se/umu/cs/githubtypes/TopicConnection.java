package se.umu.cs.githubtypes;

import java.util.Collection;

public class TopicConnection {

    private Collection<TopicEdge> edges;
    private Collection<Topic> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public TopicConnection() {
    }

    public TopicConnection(Collection<TopicEdge> edges, Collection<Topic> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<TopicEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<TopicEdge> edges) {
        this.edges = edges;
    }

    public Collection<Topic> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Topic> nodes) {
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