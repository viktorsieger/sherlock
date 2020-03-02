package se.umu.cs.githubtypes;

public class SecurityAdvisoryPackage {

    private SecurityAdvisoryEcosystem ecosystem;
    private String name;

    public SecurityAdvisoryPackage() {
    }

    public SecurityAdvisoryPackage(SecurityAdvisoryEcosystem ecosystem, String name) {
        this.ecosystem = ecosystem;
        this.name = name;
    }

    public SecurityAdvisoryEcosystem getEcosystem() {
        return ecosystem;
    }
    public void setEcosystem(SecurityAdvisoryEcosystem ecosystem) {
        this.ecosystem = ecosystem;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}