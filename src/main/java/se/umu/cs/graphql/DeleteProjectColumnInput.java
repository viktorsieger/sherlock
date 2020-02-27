package se.umu.cs.graphql;

import java.util.*;

public class DeleteProjectColumnInput {

    private String clientMutationId;
    private String columnId;

    public DeleteProjectColumnInput() {
    }

    public DeleteProjectColumnInput(String clientMutationId, String columnId) {
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getColumnId() {
        return columnId;
    }
    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

}