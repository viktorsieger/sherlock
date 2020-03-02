package se.umu.cs.githubtypes;

import java.util.Collection;

public class DeployKeyConnection {

    private Collection<DeployKeyEdge> edges;
    private Collection<DeployKey> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public DeployKeyConnection() {
    }

    public DeployKeyConnection(Collection<DeployKeyEdge> edges, Collection<DeployKey> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<DeployKeyEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<DeployKeyEdge> edges) {
        this.edges = edges;
    }

    public Collection<DeployKey> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<DeployKey> nodes) {
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