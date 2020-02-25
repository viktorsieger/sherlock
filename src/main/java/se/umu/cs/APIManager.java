package se.umu.cs;

import com.google.gson.JsonObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.InputStream;
import java.util.Scanner;

public class APIManager {

    private static final String gitHubAPIEndpoint = "https://api.github.com/graphql";
    private static final String queryRepositoryFoundation = "query {" +
                                                            "    repository(name: \"%s\", owner: \"%s\") {" +
                                                            "        createdAt" +
                                                            "        hasIssuesEnabled" +
                                                            "        id" +
                                                            "        isArchived" +
                                                            "        isDisabled" +
                                                            "        isLocked" +
                                                            "        isMirror" +
                                                            "        isTemplate" +
                                                            "        licenseInfo {" +
                                                            "            body" +
                                                            "            name" +
                                                            "            pseudoLicense" +
                                                            "        }" +
                                                            "        name" +
                                                            "        owner {" +
                                                            "            ... on User {" +
                                                            "                id" +
                                                            "                login" +
                                                            "            }" +
                                                            "        }" +
                                                            "        pushedAt" +
                                                            "        updatedAt" +
                                                            "    }" +
                                                            "}";

    private static final String queryRepositoryIssuesMetaData = "query {" +
                                                                "    repository(name: \"%s\", owner: \"%s\") {" +
                                                                "        issues {" +
                                                                "            totalCount" +
                                                                "        }" +
                                                                "        hasIssuesEnabled" +
                                                                "    }" +
                                                                "}";

    private static final String queryRepositoryIssues = "query {" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "" +
                                                        "}";


    private String gitHubOAuthToken = "";

    private CloseableHttpClient httpClient;

    public APIManager() {
        httpClient = HttpClients.createDefault();
    }

    public Repository fetchRepository(String name, String owner) throws Exception {

        Repository repository;
        String jsonRepositoryFoundation;
        String jsonRepositoryIssues;

        // Fetches foundation of repository
        jsonRepositoryFoundation = fetchRepositoryFoundation(name, owner);

        System.out.println(jsonRepositoryFoundation);

        // Fetches issues of repository
        jsonRepositoryIssues = fetchRepositoryIssues(name, owner);

        // Fetches labels of repository

        // Parse JSON-strings to Repository object

        return new Repository();
    }

    private String fetchRepositoryFoundation(String name, String owner) throws Exception {

        CloseableHttpResponse response;
        HttpPost request;
        String jsonRepositoryFoundation;

        request = prepareGitHubRequest(gitHubOAuthToken, String.format(queryRepositoryFoundation, name, owner));
        response = sendPost(request);
        jsonRepositoryFoundation = inputStreamToString(response.getEntity().getContent());
        response.close();

        return jsonRepositoryFoundation;
    }

    private String fetchRepositoryIssues(String name, String owner) throws Exception {

        CloseableHttpResponse response;
        HttpPost requestIssuesMetaData;
        String jsonRepositoryIssues;
        int totalCount;
        boolean hasIssuesEnabled;

        requestIssuesMetaData = prepareGitHubRequest(gitHubOAuthToken, String.format(queryRepositoryIssuesMetaData, name, owner));
        response = sendPost(requestIssuesMetaData);
        jsonRepositoryIssues = inputStreamToString(response.getEntity().getContent());
        response.close();

        hasIssuesEnabled = JSONParser.parserIssuesHasIssuesEnabled(jsonRepositoryIssues);

        if(hasIssuesEnabled) {
            totalCount = JSONParser.parserIssuesTotalCount(jsonRepositoryIssues);

            int i = 0;

            while(i < totalCount) {



                i += 100;
            }
        }

        return "";
    }

    private HttpPost prepareGitHubRequest(String gitHubOAuthToken, String query) throws Exception {

        HttpPost request;
        JsonObject jsonObject;
        StringEntity params;

        jsonObject = new JsonObject();
        jsonObject.addProperty("query", query);

        params = new StringEntity(jsonObject.toString());

        request = new HttpPost(gitHubAPIEndpoint);
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/vnd.github.v4+json");
        request.addHeader("Authorization", "bearer ".concat(gitHubOAuthToken));
        request.setEntity(params);

        return request;
    }

    private CloseableHttpResponse sendPost(HttpPost request) throws Exception {
        return httpClient.execute(request);
    }

    private String inputStreamToString(InputStream inputStream) {

        Scanner scanner;

        scanner = new Scanner(inputStream).useDelimiter("\\A");

        return scanner.hasNext() ? scanner.next() : "";
    }

    private String getGitHubAPIKey() {
        return "";
    }

}
