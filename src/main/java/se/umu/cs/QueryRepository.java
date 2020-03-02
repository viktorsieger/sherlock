package se.umu.cs;

public class QueryRepository {

    public static class Builder {

        // Required parameters
        private final String name;
        private final String owner;

        // Optional parameters
        private boolean createdAt = false;
        private boolean databaseId = false;
        private boolean deleteBranchOnMerge = false;

        public Builder(String name, String owner) {
            this.name = name;
            this.owner = owner;
        }

        public Builder createdAt(boolean isAdded) {
            createdAt = isAdded;
            return this;
        }

        public Builder databaseId(boolean isAdded) {
            databaseId = isAdded;
            return this;
        }

        public Builder deleteBranchOnMerge(boolean isAdded) {
            deleteBranchOnMerge = isAdded;
            return this;
        }

        public String build() {

            boolean isLeafAdded = false;

            StringBuilder stringBuilder = new StringBuilder("query { repository(name: \"");

            stringBuilder.append(name).append("\", owner: \"").append(owner).append("\") { ");

            if(createdAt) {
                stringBuilder.append("createdAt ");
                isLeafAdded = true;
            }

            if(databaseId) {
                stringBuilder.append("databaseId ");
                isLeafAdded = true;
            }

            if(deleteBranchOnMerge) {
                stringBuilder.append("deleteBranchOnMerge ");
                isLeafAdded = true;
            }

            // Add 'id' if no other leaf is added to query
            if(!isLeafAdded) {
                stringBuilder.append("id ");
            }

            stringBuilder.append("} }");

            return stringBuilder.toString();
        }
    }
}
