package se.umu.cs.graphql;

import java.util.*;

public class OrganizationInvitationConnection {

    private Collection<OrganizationInvitationEdge> edges;
    private Collection<OrganizationInvitation> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public OrganizationInvitationConnection() {
    }

    public OrganizationInvitationConnection(Collection<OrganizationInvitationEdge> edges, Collection<OrganizationInvitation> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<OrganizationInvitationEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<OrganizationInvitationEdge> edges) {
        this.edges = edges;
    }

    public Collection<OrganizationInvitation> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<OrganizationInvitation> nodes) {
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