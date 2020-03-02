package se.umu.cs.githubtypes;

public class RegistryPackageVersion implements Node{

    private Boolean deleted;
    private RegistryPackageDependencyConnection dependencies;
    private RegistryPackageFile fileByName;
    private RegistryPackageFileConnection files;
    private String id;
    private String installationCommand;
    private String manifest;
    private String platform;
    private Boolean preRelease;
    private String readme;
    private String readmeHtml;
    private RegistryPackage registryPackage;
    private Release release;
    private String sha256;
    private Integer size;
    private RegistryPackageVersionStatistics statistics;
    private String summary;
    private String updatedAt;
    private String version;
    private Boolean viewerCanEdit;

    public RegistryPackageVersion() {
    }

    public RegistryPackageVersion(Boolean deleted, RegistryPackageDependencyConnection dependencies, RegistryPackageFile fileByName, RegistryPackageFileConnection files, String id, String installationCommand, String manifest, String platform, Boolean preRelease, String readme, String readmeHtml, RegistryPackage registryPackage, Release release, String sha256, Integer size, RegistryPackageVersionStatistics statistics, String summary, String updatedAt, String version, Boolean viewerCanEdit) {
        this.deleted = deleted;
        this.dependencies = dependencies;
        this.fileByName = fileByName;
        this.files = files;
        this.id = id;
        this.installationCommand = installationCommand;
        this.manifest = manifest;
        this.platform = platform;
        this.preRelease = preRelease;
        this.readme = readme;
        this.readmeHtml = readmeHtml;
        this.registryPackage = registryPackage;
        this.release = release;
        this.sha256 = sha256;
        this.size = size;
        this.statistics = statistics;
        this.summary = summary;
        this.updatedAt = updatedAt;
        this.version = version;
        this.viewerCanEdit = viewerCanEdit;
    }

    public Boolean getDeleted() {
        return deleted;
    }
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public RegistryPackageDependencyConnection getDependencies() {
        return dependencies;
    }
    public void setDependencies(RegistryPackageDependencyConnection dependencies) {
        this.dependencies = dependencies;
    }

    public RegistryPackageFile getFileByName() {
        return fileByName;
    }
    public void setFileByName(RegistryPackageFile fileByName) {
        this.fileByName = fileByName;
    }

    public RegistryPackageFileConnection getFiles() {
        return files;
    }
    public void setFiles(RegistryPackageFileConnection files) {
        this.files = files;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getInstallationCommand() {
        return installationCommand;
    }
    public void setInstallationCommand(String installationCommand) {
        this.installationCommand = installationCommand;
    }

    public String getManifest() {
        return manifest;
    }
    public void setManifest(String manifest) {
        this.manifest = manifest;
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

    public String getReadmeHtml() {
        return readmeHtml;
    }
    public void setReadmeHtml(String readmeHtml) {
        this.readmeHtml = readmeHtml;
    }

    public RegistryPackage getRegistryPackage() {
        return registryPackage;
    }
    public void setRegistryPackage(RegistryPackage registryPackage) {
        this.registryPackage = registryPackage;
    }

    public Release getRelease() {
        return release;
    }
    public void setRelease(Release release) {
        this.release = release;
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

    public RegistryPackageVersionStatistics getStatistics() {
        return statistics;
    }
    public void setStatistics(RegistryPackageVersionStatistics statistics) {
        this.statistics = statistics;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getViewerCanEdit() {
        return viewerCanEdit;
    }
    public void setViewerCanEdit(Boolean viewerCanEdit) {
        this.viewerCanEdit = viewerCanEdit;
    }

}