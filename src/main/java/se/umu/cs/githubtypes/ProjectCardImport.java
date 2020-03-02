package se.umu.cs.githubtypes;

public class ProjectCardImport {

    private Integer number;
    private String repository;

    public ProjectCardImport() {
    }

    public ProjectCardImport(Integer number, String repository) {
        this.number = number;
        this.repository = repository;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRepository() {
        return repository;
    }
    public void setRepository(String repository) {
        this.repository = repository;
    }

}