package se.umu.cs;

import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class APIManager {

    private static final String queryRepositoryFoundation =
            "query {" +
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
            "            __typename" + // Used to distinguish Users from Organizations
            "            id" +
            "            login" +
            "        }" +
            "        pushedAt" +
            "        updatedAt" +
            "    }" +
            "}";

    private static final String queryRepositoryIssuesMetaData =
            "query {" +
            "    repository(name: \"%s\", owner: \"%s\") {" +
            "        hasIssuesEnabled" +
            "        issues {" +
            "            totalCount" +
            "        }" +
            "    }" +
            "}";

    private static final String queryRepositoryIssues =
            "query {" +
            "    repository(name: \"%s\", owner: \"%s\") {" +
            "        issues(first: %s%s, orderBy: {field: CREATED_AT, direction: ASC}) {" +
            "            edges {" +
            "                cursor" +
            "                node {" +
            "                    closedAt" +
            "                    createdAt" +
            "                    state" +
            "                }" +
            "            }" +
            "        }" +
            "    }" +
            "}";

    private static final String queryRepositoryPullRequestsMetaData =
            "query {" +
            "    repository(name: \"%s\", owner: \"%s\") {" +
            "        pullRequests {" +
            "            totalCount" +
            "        }" +
            "    }" +
            "}";

    private static final String endpointGitHub = "https://api.github.com/graphql";
    public static final int nodeLimitGitHub = 100;
    private String authenticationTokenGitHub = "";

    public APIManager() {

    }

    public String fetchRepositoryFoundation(String repositoryName, String repositoryOwner) throws IOException {
        String finalQuery = String.format(queryRepositoryFoundation, repositoryName, repositoryOwner);
        HttpPost request = createGitHubRequest(finalQuery, authenticationTokenGitHub);
        return send(request);
    }

    public String fetchRepositoryIssuesMetaData(String repositoryName, String repositoryOwner) throws IOException {
        String finalQuery = String.format(queryRepositoryIssuesMetaData, repositoryName, repositoryOwner);
        HttpPost request = createGitHubRequest(finalQuery, authenticationTokenGitHub);
        return send(request);
    }

    public String fetchRepositoryIssuesBatch(String repositoryName, String repositoryOwner, String cursorPrecedingElement) throws IOException {

        String finalQuery;

        if(cursorPrecedingElement == null) {
            finalQuery = String.format(queryRepositoryIssues, repositoryName, repositoryOwner, nodeLimitGitHub, "");
        }
        else {
            String after = ", after: \"".concat(cursorPrecedingElement).concat("\"");
            finalQuery = String.format(queryRepositoryIssues, repositoryName, repositoryOwner, nodeLimitGitHub, after);
        }

        HttpPost request = createGitHubRequest(finalQuery, authenticationTokenGitHub);
        return send(request);
    }

    public String fetchRepositoryPullRequestsMetaData(String repositoryName, String repositoryOwner) throws UnsupportedEncodingException {
        String finalQuery = String.format(queryRepositoryPullRequestsMetaData, repositoryName, repositoryOwner);
        HttpPost request = createGitHubRequest(finalQuery, authenticationTokenGitHub);
        //return send(request);
        return "";
    }

    private String send(HttpUriRequest request) throws IOException {

        String json;

        try(CloseableHttpClient httpClient = HttpClients.createDefault()) {

            try(CloseableHttpResponse response = httpClient.execute(request)) {
                HttpEntity entity = response.getEntity();

                InputStream inputStream = entity.getContent();
                json = convertInputStreamToString(inputStream);

                EntityUtils.consume(entity);
            }
        }

        return json;
    }

    private HttpPost createGitHubRequest(String query, String authenticationToken) throws UnsupportedEncodingException {

        HttpPost request;
        JsonObject jsonObject;
        StringEntity params;

        jsonObject = new JsonObject();
        jsonObject.addProperty("query", query);

        params = new StringEntity(jsonObject.toString());

        request = new HttpPost(endpointGitHub);
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/vnd.github.v4+json");
        request.addHeader("Authorization", "bearer ".concat(authenticationToken));
        request.setEntity(params);

        return request;
    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;

        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }

        return result.toString(StandardCharsets.UTF_8.name());
    }
}
