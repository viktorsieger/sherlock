package se.umu.cs.githubtypes;

import java.util.Collection;

public class GitHubMetadata {

    private String gitHubServicesSha;
    private Collection<String> gitIpAddresses;
    private Collection<String> hookIpAddresses;
    private Collection<String> importerIpAddresses;
    private Boolean isPasswordAuthenticationVerifiable;
    private Collection<String> pagesIpAddresses;

    public GitHubMetadata() {
    }

    public GitHubMetadata(String gitHubServicesSha, Collection<String> gitIpAddresses, Collection<String> hookIpAddresses, Collection<String> importerIpAddresses, Boolean isPasswordAuthenticationVerifiable, Collection<String> pagesIpAddresses) {
        this.gitHubServicesSha = gitHubServicesSha;
        this.gitIpAddresses = gitIpAddresses;
        this.hookIpAddresses = hookIpAddresses;
        this.importerIpAddresses = importerIpAddresses;
        this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable;
        this.pagesIpAddresses = pagesIpAddresses;
    }

    public String getGitHubServicesSha() {
        return gitHubServicesSha;
    }
    public void setGitHubServicesSha(String gitHubServicesSha) {
        this.gitHubServicesSha = gitHubServicesSha;
    }

    public Collection<String> getGitIpAddresses() {
        return gitIpAddresses;
    }
    public void setGitIpAddresses(Collection<String> gitIpAddresses) {
        this.gitIpAddresses = gitIpAddresses;
    }

    public Collection<String> getHookIpAddresses() {
        return hookIpAddresses;
    }
    public void setHookIpAddresses(Collection<String> hookIpAddresses) {
        this.hookIpAddresses = hookIpAddresses;
    }

    public Collection<String> getImporterIpAddresses() {
        return importerIpAddresses;
    }
    public void setImporterIpAddresses(Collection<String> importerIpAddresses) {
        this.importerIpAddresses = importerIpAddresses;
    }

    public Boolean getIsPasswordAuthenticationVerifiable() {
        return isPasswordAuthenticationVerifiable;
    }
    public void setIsPasswordAuthenticationVerifiable(Boolean isPasswordAuthenticationVerifiable) {
        this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable;
    }

    public Collection<String> getPagesIpAddresses() {
        return pagesIpAddresses;
    }
    public void setPagesIpAddresses(Collection<String> pagesIpAddresses) {
        this.pagesIpAddresses = pagesIpAddresses;
    }

}