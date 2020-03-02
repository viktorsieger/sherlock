package se.umu.cs.githubtypes;

import java.util.Collection;

public class LanguageConnection {

    private Collection<LanguageEdge> edges;
    private Collection<Language> nodes;
    private PageInfo pageInfo;
    private Integer totalCount;
    private Integer totalSize;

    public LanguageConnection() {
    }

    public LanguageConnection(Collection<LanguageEdge> edges, Collection<Language> nodes, PageInfo pageInfo, Integer totalCount, Integer totalSize) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.totalSize = totalSize;
    }

    public Collection<LanguageEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<LanguageEdge> edges) {
        this.edges = edges;
    }

    public Collection<Language> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<Language> nodes) {
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

    public Integer getTotalSize() {
        return totalSize;
    }
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

}