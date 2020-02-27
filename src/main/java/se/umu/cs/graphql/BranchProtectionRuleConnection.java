package se.umu.cs.graphql;

import java.util.*;

public class BranchProtectionRuleConnection {

    private Collection<BranchProtectionRuleEdge> edges;
    private Collection<BranchProtectionRule> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public BranchProtectionRuleConnection() {
    }

    public BranchProtectionRuleConnection(Collection<BranchProtectionRuleEdge> edges, Collection<BranchProtectionRule> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<BranchProtectionRuleEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<BranchProtectionRuleEdge> edges) {
        this.edges = edges;
    }

    public Collection<BranchProtectionRule> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<BranchProtectionRule> nodes) {
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