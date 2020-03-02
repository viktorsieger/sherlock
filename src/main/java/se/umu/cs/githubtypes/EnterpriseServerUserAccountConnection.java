package se.umu.cs.githubtypes;

import java.util.Collection;

public class EnterpriseServerUserAccountConnection {

    private Collection<EnterpriseServerUserAccountEdge> edges;
    private Collection<EnterpriseServerUserAccount> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseServerUserAccountConnection() {
    }

    public EnterpriseServerUserAccountConnection(Collection<EnterpriseServerUserAccountEdge> edges, Collection<EnterpriseServerUserAccount> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseServerUserAccountEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseServerUserAccountEdge> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseServerUserAccount> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseServerUserAccount> nodes) {
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