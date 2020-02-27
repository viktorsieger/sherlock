package se.umu.cs;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import se.umu.cs.graphql.Repository;

public class JSONParser {

    public static void parser(Repository repository, String json) {

        Repository repo;
        Gson gson = new Gson();

        JsonObject data = JsonParser.parseString(json).getAsJsonObject().getAsJsonObject("data");
        JsonObject repositoryObject = data.getAsJsonObject("repository");

        System.out.println(repositoryObject.toString());

        repo = gson.fromJson(repositoryObject.toString(), Repository.class);

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
