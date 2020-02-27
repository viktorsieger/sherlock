package se.umu.cs.graphql;

import java.util.*;

public class BranchProtectionRuleConflictConnection {

    private Collection<BranchProtectionRuleConflictEdge> edges;
    private Collection<BranchProtectionRuleConflict> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public BranchProtectionRuleConflictConnection() {
    }

    public BranchProtectionRuleConflictConnection(Collection<BranchProtectionRuleConflictEdge> edges, Collection<BranchProtectionRuleConflict> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<BranchProtectionRuleConflictEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<BranchProtectionRuleConflictEdge> edges) {
        this.edges = edges;
    }

    public Collection<BranchProtectionRuleConflict> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<BranchProtectionRuleConflict> nodes) {
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