package se.umu.cs.githubtypes;

public class PackageFile implements Node{

    private String id;
    private String md5;
    private String name;
    private PackageVersion packageVersion;
    private String sha1;
    private String sha256;
    private Integer size;
    private String updatedAt;
    private String url;

    public PackageFile() {
    }

    public PackageFile(String id, String md5, String name, PackageVersion packageVersion, String sha1, String sha256, Integer size, String updatedAt, String url) {
        this.id = id;
        this.md5 = md5;
        this.name = name;
        this.packageVersion = packageVersion;
        this.sha1 = sha1;
        this.sha256 = sha256;
        this.size = size;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMd5() {
        return md5;
    }
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PackageVersion getPackageVersion() {
        return packageVersion;
    }
    public void setPackageVersion(PackageVersion packageVersion) {
        this.packageVersion = packageVersion;
    }

    public String getSha1() {
        return sha1;
    }
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getSha256() {
        return sha256;
    }
    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}