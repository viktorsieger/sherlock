package se.umu.cs.githubtypes;

public class RegistryPackageMetadatum {

    private String name;
    private Boolean update;
    private String value;

    public RegistryPackageMetadatum() {
    }

    public RegistryPackageMetadatum(String name, Boolean update, String value) {
        this.name = name;
        this.update = update;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUpdate() {
        return update;
    }
    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}