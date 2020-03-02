package se.umu.cs.githubtypes;

public class DeclineTopicSuggestionInput {

    private String clientMutationId;
    private String name;
    private TopicSuggestionDeclineReason reason;
    private String repositoryId;

    public DeclineTopicSuggestionInput() {
    }

    public DeclineTopicSuggestionInput(String clientMutationId, String name, TopicSuggestionDeclineReason reason, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.reason = reason;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TopicSuggestionDeclineReason getReason() {
        return reason;
    }
    public void setReason(TopicSuggestionDeclineReason reason) {
        this.reason = reason;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}