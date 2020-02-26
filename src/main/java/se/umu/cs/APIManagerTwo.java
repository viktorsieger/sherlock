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

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class APIManagerTwo {

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
                                                                "        hasIssuesEnabled" +
                                                                "        issues {" +
                                                                "            totalCount" +
                                                                "        }" +
                                                                "    }" +
                                                                "}";

    private static final String endpointGitHub = "https://api.github.com/graphql";
    private String authenticationTokenGitHub = "";

    public APIManagerTwo() {

    }

    public String fetchRepositoryFoundation(String name, String owner) throws IOException {
        HttpPost request = createGitHubRequest(String.format(queryRepositoryFoundation, name, owner), authenticationTokenGitHub);
        return send(request);
    }

    public String fetchRepositoryIssuesMetaData(String name, String owner) throws IOException {
        HttpPost request = createGitHubRequest(String.format(queryRepositoryIssuesMetaData, name, owner), authenticationTokenGitHub);
        return send(request);
    }

    public List<String> fetchRepositoryIssues(String name, String owner, int totalCount) {



        return new ArrayList<String>();
    }

    private String send(HttpUriRequest request) throws IOException {

        String json;

        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                HttpEntity entity = response.getEntity();

                InputStream inputStream = entity.getContent();
                json = convertInputStreamToString(inputStream);

                EntityUtils.consume(entity);
            }
            finally {
                response.close();
            }
        }
        finally {
            httpClient.close();
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
