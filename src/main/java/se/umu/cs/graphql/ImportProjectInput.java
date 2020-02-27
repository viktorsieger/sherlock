package se.umu.cs.graphql;

import java.util.*;

public class ImportProjectInput {

    private String body;
    private String clientMutationId;
    private Collection<ProjectColumnImport> columnImports;
    private String name;
    private String ownerName;
    private Boolean Public;

    public ImportProjectInput() {
    }

    public ImportProjectInput(String body, String clientMutationId, Collection<ProjectColumnImport> columnImports, String name, String ownerName, Boolean Public) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.columnImports = columnImports;
        this.name = name;
        this.ownerName = ownerName;
        this.Public = Public;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<ProjectColumnImport> getColumnImports() {
        return columnImports;
    }
    public void setColumnImports(Collection<ProjectColumnImport> columnImports) {
        this.columnImports = columnImports;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Boolean getPublic() {
        return Public;
    }
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

}