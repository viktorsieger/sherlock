package se.umu.cs.githubtypes;

import java.util.Collection;

public class EnterpriseServerInstallationConnection {

    private Collection<EnterpriseServerInstallationEdge> edges;
    private Collection<EnterpriseServerInstallation> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseServerInstallationConnection() {
    }

    public EnterpriseServerInstallationConnection(Collection<EnterpriseServerInstallationEdge> edges, Collection<EnterpriseServerInstallation> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseServerInstallationEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseServerInstallationEdge> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseServerInstallation> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseServerInstallation> nodes) {
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