package se.umu.cs.graphql;

import java.util.*;

public class SponsorsTierConnection {

    private Collection<SponsorsTierEdge> edges;
    private Collection<SponsorsTier> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public SponsorsTierConnection() {
    }

    public SponsorsTierConnection(Collection<SponsorsTierEdge> edges, Collection<SponsorsTier> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<SponsorsTierEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SponsorsTierEdge> edges) {
        this.edges = edges;
    }

    public Collection<SponsorsTier> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SponsorsTier> nodes) {
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