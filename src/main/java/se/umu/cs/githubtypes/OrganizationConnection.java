package se.umu.cs.githubtypes;

import java.util.Collection;

public class OrganizationConnection {

    private Collection<OrganizationEdge> edges;
    private Collection<Organization> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public OrganizationConnection() {
    }

    public OrganizationConnection(Collection<OrganizationEdge> edges, Collection<Organization> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<OrganizationEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<OrganizationEdge> edges) {
        this.edges = edges;
    }

    public Collection<Organization> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Organization> nodes) {
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