package se.umu.cs;

public class QueryRepository {

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
}
