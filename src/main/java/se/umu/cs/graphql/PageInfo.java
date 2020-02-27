package se.umu.cs.graphql;

import java.util.*;

public class PageInfo {

    private String endCursor;
    private Boolean hasNextPage;
    private Boolean hasPreviousPage;
    private String startCursor;

    public PageInfo() {
    }

    public PageInfo(String endCursor, Boolean hasNextPage, Boolean hasPreviousPage, String startCursor) {
        this.endCursor = endCursor;
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.startCursor = startCursor;
    }

    public String getEndCursor() {
        return endCursor;
    }
    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }
    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Boolean getHasPreviousPage() {
        return hasPreviousPage;
    }
    public void setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public String getStartCursor() {
        return startCursor;
    }
    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

}