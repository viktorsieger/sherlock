package se.umu.cs.graphql;

import java.util.*;

public class DeletePackageVersionInput {

    private String clientMutationId;
    private String packageVersionId;

    public DeletePackageVersionInput() {
    }

    public DeletePackageVersionInput(String clientMutationId, String packageVersionId) {
        this.clientMutationId = clientMutationId;
        this.packageVersionId = packageVersionId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getPackageVersionId() {
        return packageVersionId;
    }
    public void setPackageVersionId(String packageVersionId) {
        this.packageVersionId = packageVersionId;
    }

}