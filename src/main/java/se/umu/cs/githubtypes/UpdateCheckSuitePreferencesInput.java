package se.umu.cs.githubtypes;

import java.util.Collection;

public class UpdateCheckSuitePreferencesInput {

    private Collection<CheckSuiteAutoTriggerPreference> autoTriggerPreferences;
    private String clientMutationId;
    private String repositoryId;

    public UpdateCheckSuitePreferencesInput() {
    }

    public UpdateCheckSuitePreferencesInput(Collection<CheckSuiteAutoTriggerPreference> autoTriggerPreferences, String clientMutationId, String repositoryId) {
        this.autoTriggerPreferences = autoTriggerPreferences;
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
    }

    public Collection<CheckSuiteAutoTriggerPreference> getAutoTriggerPreferences() {
        return autoTriggerPreferences;
    }
    public void setAutoTriggerPreferences(Collection<CheckSuiteAutoTriggerPreference> autoTriggerPreferences) {
        this.autoTriggerPreferences = autoTriggerPreferences;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}