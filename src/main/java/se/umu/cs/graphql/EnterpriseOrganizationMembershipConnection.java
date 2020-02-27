package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseOrganizationMembershipConnection {

    private Collection<EnterpriseOrganizationMembershipEdge> edges;
    private Collection<Organization> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseOrganizationMembershipConnection() {
    }

    public EnterpriseOrganizationMembershipConnection(Collection<EnterpriseOrganizationMembershipEdge> edges, Collection<Organization> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseOrganizationMembershipEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseOrganizationMembershipEdge> edges) {
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