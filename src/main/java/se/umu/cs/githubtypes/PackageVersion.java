package se.umu.cs.githubtypes;

public class PackageVersion implements Node{

    private PackageFileConnection files;
    private String id;
    private Package Package;
    private String platform;
    private Boolean preRelease;
    private String readme;
    private Release release;
    private PackageVersionStatistics statistics;
    private String summary;
    private String version;

    public PackageVersion() {
    }

    public PackageVersion(PackageFileConnection files, String id, Package Package, String platform, Boolean preRelease, String readme, Release release, PackageVersionStatistics statistics, String summary, String version) {
        this.files = files;
        this.id = id;
        this.Package = Package;
        this.platform = platform;
        this.preRelease = preRelease;
        this.readme = readme;
        this.release = release;
        this.statistics = statistics;
        this.summary = summary;
        this.version = version;
    }

    public PackageFileConnection getFiles() {
        return files;
    }
    public void setFiles(PackageFileConnection files) {
        this.files = files;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Package getPackage() {
        return Package;
    }
    public void setPackage(Package Package) {
        this.Package = Package;
    }

    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Boolean getPreRelease() {
        return preRelease;
    }
    public void setPreRelease(Boolean preRelease) {
        this.preRelease = preRelease;
    }

    public String getReadme() {
        return readme;
    }
    public void setReadme(String readme) {
        this.readme = readme;
    }

    public Release getRelease() {
        return release;
    }
    public void setRelease(Release release) {
        this.release = release;
    }

    public PackageVersionStatistics getStatistics() {
        return statistics;
    }
    public void setStatistics(PackageVersionStatistics statistics) {
        this.statistics = statistics;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

}