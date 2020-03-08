package se.umu.cs;

public class QueryLicense {

    private final String queryLicense;

    public static class Builder {

        private QueryBuilder queryBuilder;
        private String queryLicense;

        public Builder() {
            queryBuilder = QueryBuilder.getInstance("licenseInfo");
        }

        public Builder body() {
            queryBuilder.appendField("body");
            return this;
        }

        public Builder description() {
            queryBuilder.appendField("description");
            return this;
        }

        public Builder key() {
            queryBuilder.appendField("key");
            return this;
        }

        public Builder name() {
            queryBuilder.appendField("name");
            return this;
        }

        public Builder nickname() {
            queryBuilder.appendField("nickname");
            return this;
        }

        public Builder pseudoLicense() {
            queryBuilder.appendField("pseudoLicense");
            return this;
        }

        public Builder spdxId() {
            queryBuilder.appendField("spdxId");
            return this;
        }

        public Builder url() {
            queryBuilder.appendField("url");
            return this;
        }

        public QueryLicense build() {
            queryBuilder.appendClosingBraces();
            queryLicense = queryBuilder.toString();
            return new QueryLicense(this);
        }
    }

    private QueryLicense(Builder builder) {
        this.queryLicense = builder.queryLicense;
    }

    String getQueryLicense() {
        return queryLicense;
    }
}
