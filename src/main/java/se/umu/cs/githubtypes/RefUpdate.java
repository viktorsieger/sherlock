package se.umu.cs.githubtypes;

public class RefUpdate {

    private String afterOid;
    private String beforeOid;
    private Boolean force;
    private String name;

    public RefUpdate() {
    }

    public RefUpdate(String afterOid, String beforeOid, Boolean force, String name) {
        this.afterOid = afterOid;
        this.beforeOid = beforeOid;
        this.force = force;
        this.name = name;
    }

    public String getAfterOid() {
        return afterOid;
    }
    public void setAfterOid(String afterOid) {
        this.afterOid = afterOid;
    }

    public String getBeforeOid() {
        return beforeOid;
    }
    public void setBeforeOid(String beforeOid) {
        this.beforeOid = beforeOid;
    }

    public Boolean getForce() {
        return force;
    }
    public void setForce(Boolean force) {
        this.force = force;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}