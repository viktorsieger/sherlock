package se.umu.cs.githubtypes;

import java.util.Collection;

public class EnterpriseServerUserAccountsUploadConnection {

    private Collection<EnterpriseServerUserAccountsUploadEdge> edges;
    private Collection<EnterpriseServerUserAccountsUpload> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseServerUserAccountsUploadConnection() {
    }

    public EnterpriseServerUserAccountsUploadConnection(Collection<EnterpriseServerUserAccountsUploadEdge> edges, Collection<EnterpriseServerUserAccountsUpload> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseServerUserAccountsUploadEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseServerUserAccountsUploadEdge> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseServerUserAccountsUpload> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseServerUserAccountsUpload> nodes) {
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