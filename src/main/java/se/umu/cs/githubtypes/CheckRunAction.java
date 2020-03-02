package se.umu.cs.githubtypes;

public class CheckRunAction {

    private String description;
    private String identifier;
    private String label;

    public CheckRunAction() {
    }

    public CheckRunAction(String description, String identifier, String label) {
        this.description = description;
        this.identifier = identifier;
        this.label = label;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

}