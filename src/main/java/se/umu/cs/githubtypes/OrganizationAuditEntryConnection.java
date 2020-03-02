package se.umu.cs.githubtypes;

import java.util.Collection;

public class OrganizationAuditEntryConnection {

    private Collection<OrganizationAuditEntryEdge> edges;
    private Collection<OrganizationAuditEntry> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public OrganizationAuditEntryConnection() {
    }

    public OrganizationAuditEntryConnection(Collection<OrganizationAuditEntryEdge> edges, Collection<OrganizationAuditEntry> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<OrganizationAuditEntryEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<OrganizationAuditEntryEdge> edges) {
        this.edges = edges;
    }

    public Collection<OrganizationAuditEntry> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<OrganizationAuditEntry> nodes) {
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