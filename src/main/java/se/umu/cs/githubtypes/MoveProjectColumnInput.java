package se.umu.cs.githubtypes;

public class MoveProjectColumnInput {

    private String afterColumnId;
    private String clientMutationId;
    private String columnId;

    public MoveProjectColumnInput() {
    }

    public MoveProjectColumnInput(String afterColumnId, String clientMutationId, String columnId) {
        this.afterColumnId = afterColumnId;
        this.clientMutationId = clientMutationId;
        this.columnId = columnId;
    }

    public String getAfterColumnId() {
        return afterColumnId;
    }
    public void setAfterColumnId(String afterColumnId) {
        this.afterColumnId = afterColumnId;
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