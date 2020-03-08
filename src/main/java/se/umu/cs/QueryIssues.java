package se.umu.cs;

import java.util.HashMap;

public class QueryIssues {

    private final String query;

    public static class Builder {

        // Required parameters
        private final int first;
        private final String after;
        private final String orderBy;

        // Optional parameters
        private boolean closedAt = false;
        private boolean createdAt = false;
        private boolean state = false;

        private String query;

        public Builder(int first, String after, String orderBy) {
            this.first = first;
            this.after = after;
            this.orderBy = orderBy;
        }

        public Builder closedAt() {
            closedAt = true;
            return this;
        }

        public QueryIssues build() {

            QueryStringBuilder queryStringBuilder = QueryStringBuilder.getInstance();

            HashMap<String, String> arguments = new HashMap<>();
            arguments.put("keyA", "valueA");
            arguments.put("keyB", "valueB");
            arguments.put("keyC", "\"valueC\"");

            queryStringBuilder.appendArguments(arguments);

            /*
            queryStringBuilder.append("issues")
                    .appendParenthesisLeft()
                    .appendKeyValuePair("key1", "value1")
                    .appendArgumentsSeparator()
                    .appendKeyValuePair("key2", "\"value2\"")
                    .appendArgumentsSeparator()
                    .appendKeyValuePair("key3", "value3")
                    .appendParenthesisRight()
                    .appendSpaceAndBraceLeft();
            */

            query = queryStringBuilder.toString();

            return new QueryIssues(this);
        }

        private void addOptionalParameters() {

        }
    }

    private QueryIssues(Builder builder) {
        this.query = builder.query;
    }

    String getQuery() {
        return query;
    }
}
