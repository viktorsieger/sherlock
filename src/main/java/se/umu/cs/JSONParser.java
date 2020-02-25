package se.umu.cs;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONParser {

    public static void parser(Repository repository, String jsonRepositoryFoundation, String jsonRepositoryIssues) {

    }

    public static int parserIssuesTotalCount(String json) {
        JsonObject data = JsonParser.parseString(json).getAsJsonObject().getAsJsonObject("data");
        JsonObject repository = data.getAsJsonObject("repository");
        JsonObject issues = repository.getAsJsonObject("issues");
        int totalCount = issues.get("totalCount").getAsInt();

        return totalCount;
    }

    public static boolean parserIssuesHasIssuesEnabled(String json) {
        JsonObject data = JsonParser.parseString(json).getAsJsonObject().getAsJsonObject("data");
        JsonObject repository = data.getAsJsonObject("repository");
        boolean hasIssuesEnabled = repository.get("hasIssuesEnabled").getAsBoolean();

        return hasIssuesEnabled;
    }

    // Custom Gson deserializer
}
