package se.umu.cs.graphql;

import java.util.*;

public class UserContentEdit implements Node{

    private String createdAt;
    private String deletedAt;
    private Actor deletedBy;
    private String diff;
    private String editedAt;
    private Actor editor;
    private String id;
    private String updatedAt;

    public UserContentEdit() {
    }

    public UserContentEdit(String createdAt, String deletedAt, Actor deletedBy, String diff, String editedAt, Actor editor, String id, String updatedAt) {
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.deletedBy = deletedBy;
        this.diff = diff;
        this.editedAt = editedAt;
        this.editor = editor;
        this.id = id;
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }
    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Actor getDeletedBy() {
        return deletedBy;
    }
    public void setDeletedBy(Actor deletedBy) {
        this.deletedBy = deletedBy;
    }

    public String getDiff() {
        return diff;
    }
    public void setDiff(String diff) {
        this.diff = diff;
    }

    public String getEditedAt() {
        return editedAt;
    }
    public void setEditedAt(String editedAt) {
        this.editedAt = editedAt;
    }

    public Actor getEditor() {
        return editor;
    }
    public void setEditor(Actor editor) {
        this.editor = editor;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}