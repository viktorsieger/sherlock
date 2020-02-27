package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccountEmailConnection {

    private Collection<EnterpriseServerUserAccountEmailEdge> edges;
    private Collection<EnterpriseServerUserAccountEmail> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public EnterpriseServerUserAccountEmailConnection() {
    }

    public EnterpriseServerUserAccountEmailConnection(Collection<EnterpriseServerUserAccountEmailEdge> edges, Collection<EnterpriseServerUserAccountEmail> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<EnterpriseServerUserAccountEmailEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<EnterpriseServerUserAccountEmailEdge> edges) {
        this.edges = edges;
    }

    public Collection<EnterpriseServerUserAccountEmail> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<EnterpriseServerUserAccountEmail> nodes) {
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