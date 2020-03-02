package se.umu.cs.githubtypes;

import java.util.Collection;

public class SearchResultItemConnection {

    private Integer codeCount;
    private Collection<SearchResultItemEdge> edges;
    private Integer issueCount;
    private Collection<SearchResultItem> nodes;
    private PageInfo pageInfo;
    private Integer repositoryCount;
    private Integer userCount;
    private Integer wikiCount;

    public SearchResultItemConnection() {
    }

    public SearchResultItemConnection(Integer codeCount, Collection<SearchResultItemEdge> edges, Integer issueCount, Collection<SearchResultItem> nodes, PageInfo pageInfo, Integer repositoryCount, Integer userCount, Integer wikiCount) {
        this.codeCount = codeCount;
        this.edges = edges;
        this.issueCount = issueCount;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.repositoryCount = repositoryCount;
        this.userCount = userCount;
        this.wikiCount = wikiCount;
    }

    public Integer getCodeCount() {
        return codeCount;
    }
    public void setCodeCount(Integer codeCount) {
        this.codeCount = codeCount;
    }

    public Collection<SearchResultItemEdge> getEdges() {
        return edges;
    }
    public void setEdges(Collection<SearchResultItemEdge> edges) {
        this.edges = edges;
    }

    public Integer getIssueCount() {
        return issueCount;
    }
    public void setIssueCount(Integer issueCount) {
        this.issueCount = issueCount;
    }

    public Collection<SearchResultItem> getNodes() {
        return nodes;
    }
    public void setNodes(Collection<SearchResultItem> nodes) {
        this.nodes = nodes;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Integer getRepositoryCount() {
        return repositoryCount;
    }
    public void setRepositoryCount(Integer repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    public Integer getUserCount() {
        return userCount;
    }
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getWikiCount() {
        return wikiCount;
    }
    public void setWikiCount(Integer wikiCount) {
        this.wikiCount = wikiCount;
    }

}