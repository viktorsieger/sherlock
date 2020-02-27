package se.umu.cs.graphql;

import java.util.*;

public class ExternalIdentityScimAttributes {

    private String username;

    public ExternalIdentityScimAttributes() {
    }

    public ExternalIdentityScimAttributes(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

}