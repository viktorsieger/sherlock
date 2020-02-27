package se.umu.cs.graphql;

import java.util.*;

public class GitActor {

    private String avatarUrl;
    private String date;
    private String email;
    private String name;
    private User user;

    public GitActor() {
    }

    public GitActor(String avatarUrl, String date, String email, String name, User user) {
        this.avatarUrl = avatarUrl;
        this.date = date;
        this.email = email;
        this.name = name;
        this.user = user;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}