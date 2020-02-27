package se.umu.cs.graphql;

import java.util.*;

public class UpdateLabelInput {

    private String clientMutationId;
    private String color;
    private String description;
    private String id;
    private String name;

    public UpdateLabelInput() {
    }

    public UpdateLabelInput(String clientMutationId, String color, String description, String id, String name) {
        this.clientMutationId = clientMutationId;
        this.color = color;
        this.description = description;
        this.id = id;
        this.name = name;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}