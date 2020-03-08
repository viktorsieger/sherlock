package se.umu.cs;

public class Query {

    private final String query;

    public static class Builder {

        private QueryBuilder queryBuilder;
        private String query;

        public Builder() {
            queryBuilder = QueryBuilder.getInstance("query");
        }

        public Builder repository(String repositorySelectionSet) {
            queryBuilder.appendBuiltSelectionSet(repositorySelectionSet);
            return this;
        }

        public Query build() {
            queryBuilder.appendClosingBraces();
            query = queryBuilder.toString();
            return new Query(this);
        }
    }

    private Query(Builder builder) {
        this.query = builder.query;
    }

    String getQuery() {
        return query;
    }
}
