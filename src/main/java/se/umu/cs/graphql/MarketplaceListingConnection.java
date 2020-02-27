package se.umu.cs.graphql;

import java.util.*;

public class MarketplaceListingConnection {

    private Collection<MarketplaceListingEdge> edges;
    private Collection<MarketplaceListing> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public MarketplaceListingConnection() {
    }

    public MarketplaceListingConnection(Collection<MarketplaceListingEdge> edges, Collection<MarketplaceListing> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<MarketplaceListingEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<MarketplaceListingEdge> edges) {
        this.edges = edges;
    }

    public Collection<MarketplaceListing> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<MarketplaceListing> nodes) {
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