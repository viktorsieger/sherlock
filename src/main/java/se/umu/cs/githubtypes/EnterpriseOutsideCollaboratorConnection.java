package se.umu.cs.githubtypes;

import java.util.Collection;

public class EnterpriseOutsideCollaboratorConnection {

    private Collection<EnterpriseOutsideCollaboratorEdge> edges;
    private Collection<User> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseOutsideCollaboratorConnection() {
    }

    public EnterpriseOutsideCollaboratorConnection(Collection<EnterpriseOutsideCollaboratorEdge> edges, Collection<User> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseOutsideCollaboratorEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseOutsideCollaboratorEdge> edges) {
        this.edges = edges;
    }

    public Collection<User> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<User> nodes) {
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