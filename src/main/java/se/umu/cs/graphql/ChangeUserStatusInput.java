package se.umu.cs.graphql;

import java.util.*;

public class ChangeUserStatusInput {

    private String clientMutationId;
    private String emoji;
    private String expiresAt;
    private Boolean limitedAvailability;
    private String message;
    private String organizationId;

    public ChangeUserStatusInput() {
    }

    public ChangeUserStatusInput(String clientMutationId, String emoji, String expiresAt, Boolean limitedAvailability, String message, String organizationId) {
        this.clientMutationId = clientMutationId;
        this.emoji = emoji;
        this.expiresAt = expiresAt;
        this.limitedAvailability = limitedAvailability;
        this.message = message;
        this.organizationId = organizationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getEmoji() {
        return emoji;
    }
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getExpiresAt() {
        return expiresAt;
    }
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Boolean getLimitedAvailability() {
        return limitedAvailability;
    }
    public void setLimitedAvailability(Boolean limitedAvailability) {
        this.limitedAvailability = limitedAvailability;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrganizationId() {
        return organizationId;
    }
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

}