package se.umu.cs.graphql;

import java.util.*;

public class DeploymentStatusConnection {

    private Collection<DeploymentStatusEdge> edges;
    private Collection<DeploymentStatus> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public DeploymentStatusConnection() {
    }

    public DeploymentStatusConnection(Collection<DeploymentStatusEdge> edges, Collection<DeploymentStatus> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DeploymentStatusEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DeploymentStatusEdge> edges) {
        this.edges = edges;
    }

    public Collection<DeploymentStatus> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DeploymentStatus> nodes) {
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