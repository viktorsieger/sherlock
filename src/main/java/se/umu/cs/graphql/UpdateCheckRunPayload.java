package se.umu.cs.graphql;

import java.util.*;

public class UpdateCheckRunPayload {

    private CheckRun checkRun;
    private String clientMutationId;

    public UpdateCheckRunPayload() {
    }

    public UpdateCheckRunPayload(CheckRun checkRun, String clientMutationId) {
        this.checkRun = checkRun;
        this.clientMutationId = clientMutationId;
    }

    public CheckRun getCheckRun() {
        return checkRun;
    }
    public void setCheckRun(CheckRun checkRun) {
        this.checkRun = checkRun;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}