package se.umu.cs.graphql;

import java.util.*;

public class SponsorshipConnection {

    private Collection<SponsorshipEdge> edges;
    private Collection<Sponsorship> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public SponsorshipConnection() {
    }

    public SponsorshipConnection(Collection<SponsorshipEdge> edges, Collection<Sponsorship> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<SponsorshipEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SponsorshipEdge> edges) {
        this.edges = edges;
    }

    public Collection<Sponsorship> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Sponsorship> nodes) {
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