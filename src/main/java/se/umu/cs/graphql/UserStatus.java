package se.umu.cs.graphql;

import java.util.*;

public class UserStatus implements Node{

    private String createdAt;
    private String emoji;
    private String emojiHTML;
    private String expiresAt;
    private String id;
    private Boolean indicatesLimitedAvailability;
    private String message;
    private Organization organization;
    private String updatedAt;
    private User user;

    public UserStatus() {
    }

    public UserStatus(String createdAt, String emoji, String emojiHTML, String expiresAt, String id, Boolean indicatesLimitedAvailability, String message, Organization organization, String updatedAt, User user) {
        this.createdAt = createdAt;
        this.emoji = emoji;
        this.emojiHTML = emojiHTML;
        this.expiresAt = expiresAt;
        this.id = id;
        this.indicatesLimitedAvailability = indicatesLimitedAvailability;
        this.message = message;
        this.organization = organization;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmoji() {
        return emoji;
    }
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getEmojiHTML() {
        return emojiHTML;
    }
    public void setEmojiHTML(String emojiHTML) {
        this.emojiHTML = emojiHTML;
    }

    public String getExpiresAt() {
        return expiresAt;
    }
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIndicatesLimitedAvailability() {
        return indicatesLimitedAvailability;
    }
    public void setIndicatesLimitedAvailability(Boolean indicatesLimitedAvailability) {
        this.indicatesLimitedAvailability = indicatesLimitedAvailability;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}