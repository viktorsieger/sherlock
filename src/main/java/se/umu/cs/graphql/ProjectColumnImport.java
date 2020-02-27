package se.umu.cs.graphql;

import java.util.*;

public class ProjectColumnImport {

    private String columnName;
    private Collection<ProjectCardImport> issues;
    private Integer position;

    public ProjectColumnImport() {
    }

    public ProjectColumnImport(String columnName, Collection<ProjectCardImport> issues, Integer position) {
        this.columnName = columnName;
        this.issues = issues;
        this.position = position;
    }

    public String getColumnName() {
        return columnName;
    }
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Collection<ProjectCardImport> getIssues() {
        return issues;
    }
    public void setIssues(Collection<ProjectCardImport> issues) {
        this.issues = issues;
    }

    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }

}