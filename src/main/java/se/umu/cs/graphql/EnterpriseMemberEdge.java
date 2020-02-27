package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseMemberEdge {

    private String cursor;
    private Boolean isUnlicensed;
    private EnterpriseMember node;

    public EnterpriseMemberEdge() {
    }

    public EnterpriseMemberEdge(String cursor, Boolean isUnlicensed, EnterpriseMember node) {
        this.cursor = cursor;
        this.isUnlicensed = isUnlicensed;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getIsUnlicensed() {
        return isUnlicensed;
    }
    public void setIsUnlicensed(Boolean isUnlicensed) {
        this.isUnlicensed = isUnlicensed;
    }

    public EnterpriseMember getNode() {
        return node;
    }
    public void setNode(EnterpriseMember node) {
        this.node = node;
    }

}