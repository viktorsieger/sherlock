package se.umu.cs.graphql;

import java.util.*;

public class ReleaseAssetConnection {

    private Collection<ReleaseAssetEdge> edges;
    private Collection<ReleaseAsset> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;

    public ReleaseAssetConnection() {
    }

    public ReleaseAssetConnection(Collection<ReleaseAssetEdge> edges, Collection<ReleaseAsset> nodes, PageInfo pageInfo, Integer totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public Collection<ReleaseAssetEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<ReleaseAssetEdge> edges) {
        this.edges = edges;
    }

    public Collection<ReleaseAsset> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<ReleaseAsset> nodes) {
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