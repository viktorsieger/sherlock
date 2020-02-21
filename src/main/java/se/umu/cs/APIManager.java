package se.umu.cs;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class APIManager {

    private final HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(30))
            .followRedirects(HttpClient.Redirect.NEVER)
            .version(HttpClient.Version.HTTP_2)
            .build();

    public APIManager() throws Exception {
        sendPost();
    }

    private void sendPost() throws Exception {

        String body0 = "{" +
                "\"query\": \"query { viewer { login }}\"" +
                "}";

        String body = "{" +
                "\"query\": \"query { repository(owner:\"octocat\", name:\"Hello-World\") { id }}\"" +
                "}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/graphql"))
                .header("Authorization", "bearer KEYHERE")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }

}
