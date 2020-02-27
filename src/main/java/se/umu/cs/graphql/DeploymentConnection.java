package se.umu.cs.graphql;

import java.util.*;

public class DeploymentConnection {

    private Collection<DeploymentEdge> edges;
    private Collection<Deployment> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public DeploymentConnection() {
    }

    public DeploymentConnection(Collection<DeploymentEdge> edges, Collection<Deployment> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DeploymentEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DeploymentEdge> edges) {
        this.edges = edges;
    }

    public Collection<Deployment> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Deployment> nodes) {
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