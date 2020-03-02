package se.umu.cs.githubtypes;

import java.util.Collection;

public class RepositoryTopicConnection {

    private Collection<RepositoryTopicEdge> edges;
    private Collection<RepositoryTopic> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public RepositoryTopicConnection() {
    }

    public RepositoryTopicConnection(Collection<RepositoryTopicEdge> edges, Collection<RepositoryTopic> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<RepositoryTopicEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<RepositoryTopicEdge> edges) {
        this.edges = edges;
    }

    public Collection<RepositoryTopic> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<RepositoryTopic> nodes) {
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