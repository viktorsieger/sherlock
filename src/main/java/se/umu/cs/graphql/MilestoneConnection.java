package se.umu.cs.graphql;

import java.util.*;

public class MilestoneConnection {

    private Collection<MilestoneEdge> edges;
    private Collection<Milestone> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public MilestoneConnection() {
    }

    public MilestoneConnection(Collection<MilestoneEdge> edges, Collection<Milestone> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<MilestoneEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<MilestoneEdge> edges) {
        this.edges = edges;
    }

    public Collection<Milestone> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Milestone> nodes) {
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