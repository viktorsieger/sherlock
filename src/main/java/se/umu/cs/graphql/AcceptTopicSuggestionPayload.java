package se.umu.cs.graphql;

import java.util.*;

public class AcceptTopicSuggestionPayload {

    private String clientMutationId;
    private Topic topic;

    public AcceptTopicSuggestionPayload() {
    }

    public AcceptTopicSuggestionPayload(String clientMutationId, Topic topic) {
        this.clientMutationId = clientMutationId;
        this.topic = topic;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Topic getTopic() {
        return topic;
    }
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}