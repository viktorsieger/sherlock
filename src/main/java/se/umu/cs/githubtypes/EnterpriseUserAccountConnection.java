package se.umu.cs.githubtypes;

import java.util.Collection;

public class EnterpriseUserAccountConnection {

    private Collection<EnterpriseUserAccountEdge> edges;
    private Collection<EnterpriseUserAccount> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseUserAccountConnection() {
    }

    public EnterpriseUserAccountConnection(Collection<EnterpriseUserAccountEdge> edges, Collection<EnterpriseUserAccount> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseUserAccountEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseUserAccountEdge> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseUserAccount> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseUserAccount> nodes) {
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