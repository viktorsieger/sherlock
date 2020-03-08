package se.umu.cs;

import se.umu.cs.githubtypes.Issue;
import se.umu.cs.githubtypes.IssueEdge;
import se.umu.cs.githubtypes.PullRequest;
import se.umu.cs.githubtypes.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sherlock {

    public static void main(String[] args) throws IOException {

        String[] parts;
        String repositoryOwner;
        String repositoryName;

        checkArguments(args);

        /*
        Options options = new Options();

        Option output = new Option("o","output", true, "");
        output.setRequired(false);
        options.addOption(output);

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if(cmd.hasOption("o")) {
            switch(cmd.getOptionValue("o")) {
                case "license":
                    // Only analyze license
                    break;
                case "all":
                    // Analyze everything
                    break;
                default:
                    // Analyze everything
            }
        }
        else {
            // Analyze everything
        }
        */

        parts = args[0].split("/");
        repositoryOwner = parts[0];
        repositoryName = parts[1];

        //analyzeIssues(repositoryName, repositoryOwner);
        //analyzePullRequests(repositoryName, repositoryOwner);

        /*
        String test = new QueryRepository.Builder("atom", "atom")
                .createdAt(true)
                .databaseId(false)
                .deleteBranchOnMerge(true)
                .build();

        System.out.println(test);
        */

        /*
        QueryRepository queryRepository = new QueryRepository.Builder("atom", "atom")
                .createdAt()
                .databaseId()
                .build();

        String test = queryRepository.getQuery();

        System.out.println(test);
        */

        String test = new QueryIssues.Builder(100, "abc", "def")
                .closedAt()
                .build()
                .getQuery();

        System.out.println(test);

    }

    private static void checkArguments(String[] args) throws IllegalArgumentException {
        if(args.length != 1) {
            throw new IllegalArgumentException();
        }
        else if(!args[0].contains("/")) {
            throw new IllegalArgumentException();
        }
    }

    private static void analyzeIssues(String repositoryName, String repositoryOwner) throws IOException {
        List<Issue> issues = getIssues(repositoryName, repositoryOwner);
    }

    private static List<Issue> getIssues(String repositoryName, String repositoryOwner) throws IOException {

        APIManager apiManager = new APIManager();
        String jsonRepositoryIssuesMetaData = apiManager.fetchRepositoryIssuesMetaData(repositoryName, repositoryOwner);
        Repository issuesMetaData = JsonUtils.parseJsonComprisingRepository(jsonRepositoryIssuesMetaData);
        List<Issue> issues = new ArrayList<>();

        if(issuesMetaData.getHasIssuesEnabled()) {

            String jsonRepositoryIssuesBatch;
            Repository issuesBatch;
            Iterator<IssueEdge> iterator;
            IssueEdge issueEdge;
            int i = 0;
            String cursorPrecedingElement = null;

            // Loop through all issues in repository
            while(i < issuesMetaData.getIssues().getTotalCount()) {

                jsonRepositoryIssuesBatch = apiManager.fetchRepositoryIssuesBatch(repositoryName, repositoryOwner, cursorPrecedingElement);
                issuesBatch = JsonUtils.parseJsonComprisingRepository(jsonRepositoryIssuesBatch);
                iterator = issuesBatch.getIssues().getEdges().iterator();

                // Loop through all issues in batch
                while(iterator.hasNext()) {

                    issueEdge = iterator.next();
                    issues.add(issueEdge.getNode());

                    if(!iterator.hasNext()) {
                        cursorPrecedingElement = issueEdge.getCursor();
                    }
                }

                i += APIManager.nodeLimitGitHub;
            }
        }

        return issues;
    }

    private static void analyzePullRequests(String repositoryName, String repositoryOwner) throws IOException {
        List<PullRequest> pullRequests = getPullRequests(repositoryName, repositoryOwner);
    }

    private static List<PullRequest> getPullRequests(String repositoryName, String repositoryOwner) throws IOException {

        APIManager apiManager = new APIManager();
        String jsonRepositoryPullRequestsMetaData = apiManager.fetchRepositoryPullRequestsMetaData(repositoryName, repositoryOwner);
        Repository pullRequestsMetaData = JsonUtils.parseJsonComprisingRepository(jsonRepositoryPullRequestsMetaData);

        return null;
    }

}

// https://stackoverflow.com/questions/51475415/graphql-java-class-generator
// https://stackoverflow.com/questions/1688099/converting-json-data-to-java-object
// https://github.com/chentsulin/awesome-graphql#lib-java
// https://graphql.org/code/#tools

// https://technology.finra.org/code/serialize-deserialize-interfaces-in-java.html
// https://stackoverflow.com/a/1688182

// https://graphql.github.io/learn/queries/#meta-fields

/*
TODO: Fetch pull requests.
TODO: Retrieve GitHub OAuth token dynamically.
TODO: Implement Stack Overflow's API.
TODO: Error handling.
TODO: Check request limit on APIs.
TODO: Implement builder-pattern for query strings. Add smaller builders for complex JSON objects.
TODO: Add methods for the builder classes that adds curly braces etc.
*/
