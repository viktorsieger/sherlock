package se.umu.cs.githubtypes;

import java.util.Collection;

public class EnterpriseAdministratorInvitationConnection {

    private Collection<EnterpriseAdministratorInvitationEdge> edges;
    private Collection<EnterpriseAdministratorInvitation> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseAdministratorInvitationConnection() {
    }

    public EnterpriseAdministratorInvitationConnection(Collection<EnterpriseAdministratorInvitationEdge> edges, Collection<EnterpriseAdministratorInvitation> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseAdministratorInvitationEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseAdministratorInvitationEdge> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseAdministratorInvitation> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseAdministratorInvitation> nodes) {
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