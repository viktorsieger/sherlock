package se.umu.cs.graphql;

import java.util.*;

public class EnterprisePendingMemberInvitationConnection {

    private Collection<EnterprisePendingMemberInvitationEdge> edges;
    private Collection<OrganizationInvitation> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;
    private Integer totalUniqueUserCount;

    public EnterprisePendingMemberInvitationConnection() {
    }

    public EnterprisePendingMemberInvitationConnection(Collection<EnterprisePendingMemberInvitationEdge> edges, Collection<OrganizationInvitation> nodes, PageInfo pageInfo, Integer totalCount, Integer totalUniqueUserCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.totalUniqueUserCount = totalUniqueUserCount;
    }

    public Collection<EnterprisePendingMemberInvitationEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterprisePendingMemberInvitationEdge> edges) {
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

    public Integer getTotalUniqueUserCount() {
        return totalUniqueUserCount;
    }
    public void setTotalUniqueUserCount(Integer totalUniqueUserCount) {
        this.totalUniqueUserCount = totalUniqueUserCount;
    }

}