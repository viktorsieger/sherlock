package se.umu.cs.githubtypes;

public class SecurityAdvisoryPackageVersion {

    private String identifier;

    public SecurityAdvisoryPackageVersion() {
    }

    public SecurityAdvisoryPackageVersion(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}