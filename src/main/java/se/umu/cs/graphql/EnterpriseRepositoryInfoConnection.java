package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseRepositoryInfoConnection {

    private Collection<EnterpriseRepositoryInfoEdge> edges;
    private Collection<EnterpriseRepositoryInfo> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseRepositoryInfoConnection() {
    }

    public EnterpriseRepositoryInfoConnection(Collection<EnterpriseRepositoryInfoEdge> edges, Collection<EnterpriseRepositoryInfo> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseRepositoryInfoEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseRepositoryInfoEdge> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseRepositoryInfo> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseRepositoryInfo> nodes) {
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