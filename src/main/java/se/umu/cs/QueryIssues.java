package se.umu.cs;

import java.util.HashMap;

public class QueryIssues {

    private final String queryIssues;

    public static class Builder {

        private QueryBuilder queryBuilder;
        private String queryIssues;

        public Builder(HashMap<String, String> arguments) {
            queryBuilder = QueryBuilder.getInstance("issues", arguments)
                    .appendSelectionSet("edges")
                    .appendField("cursor")
                    .appendSelectionSet("node");
        }

        public Builder bodyText() {
            queryBuilder.appendField("bodyText");
            return this;
        }

        public Builder closedAt() {
            queryBuilder.appendField("closedAt");
            return this;
        }

        public Builder createdAt() {
            queryBuilder.appendField("createdAt");
            return this;
        }

        public Builder id() {
            queryBuilder.appendField("id");
            return this;
        }

        public Builder state() {
            queryBuilder.appendField("state");
            return this;
        }

        public Builder title() {
            queryBuilder.appendField("title");
            return this;
        }

        public Builder updatedAt() {
            queryBuilder.appendField("updatedAt");
            return this;
        }

        public QueryIssues build() {
            queryBuilder.appendClosingBraces();
            queryIssues = queryBuilder.toString();
            return new QueryIssues(this);
        }
    }

    public static class BuilderMetaData {

        private QueryBuilder queryBuilder;
        private String queryIssuesMetaData;

        public BuilderMetaData() {
            queryBuilder = QueryBuilder.getInstance("issues");
        }

        public BuilderMetaData totalCount() {
            queryBuilder.appendField("totalCount");
            return this;
        }

        public QueryIssues build() {
            queryBuilder.appendClosingBraces();
            queryIssuesMetaData = queryBuilder.toString();
            return new QueryIssues(this);
        }
    }

    private QueryIssues(Builder builder) {
        this.queryIssues = builder.queryIssues;
    }

    private QueryIssues(BuilderMetaData builderMetaData) {
        this.queryIssues = builderMetaData.queryIssuesMetaData;
    }

    String getQueryIssues() {
        return queryIssues;
    }
}
