package se.umu.cs;

import java.util.HashMap;

public class QueryRepository {

    private final String queryRepository;

    public static class Builder {

        private QueryBuilder queryBuilder;
        private String queryRepository;

        public Builder(HashMap<String, String> arguments) {
            queryBuilder = QueryBuilder.getInstance("repository", arguments);
        }

        public Builder createAt() {
            queryBuilder.appendField("createdAt");
            return this;
        }

        public Builder hasIssuesEnabled() {
            queryBuilder.appendField("hasIssuesEnabled");
            return this;
        }

        public Builder id() {
            queryBuilder.appendField("id");
            return this;
        }

        public Builder isArchived() {
            queryBuilder.appendField("isArchived");
            return this;
        }

        public Builder isDisabled() {
            queryBuilder.appendField("isDisabled");
            return this;
        }

        public Builder isLocked() {
            queryBuilder.appendField("isLocked");
            return this;
        }

        public Builder isMirror() {
            queryBuilder.appendField("isMirror");
            return this;
        }

        public Builder isTemplate() {
            queryBuilder.appendField("isTemplate");
            return this;
        }

        public Builder issues(String issuesSelectionSet) {
            queryBuilder.appendBuiltSelectionSet(issuesSelectionSet);
            return this;
        }

        public Builder licenseInfo(String licenseSelectionSet) {
            queryBuilder.appendBuiltSelectionSet(licenseSelectionSet);
            return this;
        }

        public Builder pushedAt() {
            queryBuilder.appendField("pushedAt");
            return this;
        }

        public Builder updatedAt() {
            queryBuilder.appendField("updatedAt");
            return this;
        }

        public QueryRepository build() {
            queryBuilder.appendClosingBraces();
            queryRepository = queryBuilder.toString();
            return new QueryRepository(this);
        }
    }

    private QueryRepository(Builder builder) {
        this.queryRepository = builder.queryRepository;
    }

    String getQueryRepository() {
        return queryRepository;
    }
}

/*
private final String query;

public static class Builder {

    // Required parameters
    private final String name;
    private final String owner;

    // Optional parameters
    private boolean createdAt = false;
    private boolean databaseId = false;
    private boolean deleteBranchOnMerge = false;

    private String query;

    public Builder(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public Builder createdAt() {
        createdAt = true;
        return this;
    }

    public Builder databaseId() {
        databaseId = true;
        return this;
    }

    public Builder deleteBranchOnMerge() {
        deleteBranchOnMerge = true;
        return this;
    }

    public QueryRepository build() {
        addOptionalParameters();
        return new QueryRepository(this);
    }

    private void addOptionalParameters() {

        StringBuilder stringBuilder = new StringBuilder("query { repository(name: \"");

        stringBuilder.append(name).append("\", owner: \"").append(owner).append("\") { ");

        if(createdAt) {
            stringBuilder.append("createdAt ");
        }

        if(databaseId) {
            stringBuilder.append("databaseId ");
        }

        if(deleteBranchOnMerge) {
            stringBuilder.append("deleteBranchOnMerge ");
        }

        stringBuilder.append("} }");

        query = stringBuilder.toString();
    }
}

private QueryRepository(Builder builder) {
    this.query = builder.query;
}

String getQuery() {
    return query;
}
*/
