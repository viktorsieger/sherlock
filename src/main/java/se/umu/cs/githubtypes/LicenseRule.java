package se.umu.cs.githubtypes;

public class LicenseRule {

    private String description;
    private String key;
    private String label;

    public LicenseRule() {
    }

    public LicenseRule(String description, String key, String label) {
        this.description = description;
        this.key = key;
        this.label = label;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

}