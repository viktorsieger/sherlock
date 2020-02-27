package se.umu.cs.graphql;

import java.util.*;

public class MarketplaceListing implements SearchResultItem, Node{

    private App app;
    private String companyUrl;
    private String configurationResourcePath;
    private String configurationUrl;
    private String documentationUrl;
    private String extendedDescription;
    private String extendedDescriptionHTML;
    private String fullDescription;
    private String fullDescriptionHTML;
    private Boolean hasApprovalBeenRequested;
    private Boolean hasPublishedFreeTrialPlans;
    private Boolean hasTermsOfService;
    private String howItWorks;
    private String howItWorksHTML;
    private String id;
    private String installationUrl;
    private Boolean installedForViewer;
    private Boolean isApproved;
    private Boolean isArchived;
    private Boolean isDelisted;
    private Boolean isDraft;
    private Boolean isPaid;
    private Boolean isPublic;
    private Boolean isRejected;
    private Boolean isUnverified;
    private Boolean isUnverifiedPending;
    private Boolean isVerificationPendingFromDraft;
    private Boolean isVerificationPendingFromUnverified;
    private Boolean isVerified;
    private String logoBackgroundColor;
    private String logoUrl;
    private String name;
    private String normalizedShortDescription;
    private String pricingUrl;
    private MarketplaceCategory primaryCategory;
    private String privacyPolicyUrl;
    private String resourcePath;
    private Collection<String> screenshotUrls;
    private MarketplaceCategory secondaryCategory;
    private String shortDescription;
    private String slug;
    private String statusUrl;
    private String supportEmail;
    private String supportUrl;
    private String termsOfServiceUrl;
    private String url;
    private Boolean viewerCanAddPlans;
    private Boolean viewerCanApprove;
    private Boolean viewerCanDelist;
    private Boolean viewerCanEdit;
    private Boolean viewerCanEditCategories;
    private Boolean viewerCanEditPlans;
    private Boolean viewerCanRedraft;
    private Boolean viewerCanReject;
    private Boolean viewerCanRequestApproval;
    private Boolean viewerHasPurchased;
    private Boolean viewerHasPurchasedForAllOrganizations;
    private Boolean viewerIsListingAdmin;

    public MarketplaceListing() {
    }

    public MarketplaceListing(App app, String companyUrl, String configurationResourcePath, String configurationUrl, String documentationUrl, String extendedDescription, String extendedDescriptionHTML, String fullDescription, String fullDescriptionHTML, Boolean hasApprovalBeenRequested, Boolean hasPublishedFreeTrialPlans, Boolean hasTermsOfService, String howItWorks, String howItWorksHTML, String id, String installationUrl, Boolean installedForViewer, Boolean isApproved, Boolean isArchived, Boolean isDelisted, Boolean isDraft, Boolean isPaid, Boolean isPublic, Boolean isRejected, Boolean isUnverified, Boolean isUnverifiedPending, Boolean isVerificationPendingFromDraft, Boolean isVerificationPendingFromUnverified, Boolean isVerified, String logoBackgroundColor, String logoUrl, String name, String normalizedShortDescription, String pricingUrl, MarketplaceCategory primaryCategory, String privacyPolicyUrl, String resourcePath, Collection<String> screenshotUrls, MarketplaceCategory secondaryCategory, String shortDescription, String slug, String statusUrl, String supportEmail, String supportUrl, String termsOfServiceUrl, String url, Boolean viewerCanAddPlans, Boolean viewerCanApprove, Boolean viewerCanDelist, Boolean viewerCanEdit, Boolean viewerCanEditCategories, Boolean viewerCanEditPlans, Boolean viewerCanRedraft, Boolean viewerCanReject, Boolean viewerCanRequestApproval, Boolean viewerHasPurchased, Boolean viewerHasPurchasedForAllOrganizations, Boolean viewerIsListingAdmin) {
        this.app = app;
        this.companyUrl = companyUrl;
        this.configurationResourcePath = configurationResourcePath;
        this.configurationUrl = configurationUrl;
        this.documentationUrl = documentationUrl;
        this.extendedDescription = extendedDescription;
        this.extendedDescriptionHTML = extendedDescriptionHTML;
        this.fullDescription = fullDescription;
        this.fullDescriptionHTML = fullDescriptionHTML;
        this.hasApprovalBeenRequested = hasApprovalBeenRequested;
        this.hasPublishedFreeTrialPlans = hasPublishedFreeTrialPlans;
        this.hasTermsOfService = hasTermsOfService;
        this.howItWorks = howItWorks;
        this.howItWorksHTML = howItWorksHTML;
        this.id = id;
        this.installationUrl = installationUrl;
        this.installedForViewer = installedForViewer;
        this.isApproved = isApproved;
        this.isArchived = isArchived;
        this.isDelisted = isDelisted;
        this.isDraft = isDraft;
        this.isPaid = isPaid;
        this.isPublic = isPublic;
        this.isRejected = isRejected;
        this.isUnverified = isUnverified;
        this.isUnverifiedPending = isUnverifiedPending;
        this.isVerificationPendingFromDraft = isVerificationPendingFromDraft;
        this.isVerificationPendingFromUnverified = isVerificationPendingFromUnverified;
        this.isVerified = isVerified;
        this.logoBackgroundColor = logoBackgroundColor;
        this.logoUrl = logoUrl;
        this.name = name;
        this.normalizedShortDescription = normalizedShortDescription;
        this.pricingUrl = pricingUrl;
        this.primaryCategory = primaryCategory;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.resourcePath = resourcePath;
        this.screenshotUrls = screenshotUrls;
        this.secondaryCategory = secondaryCategory;
        this.shortDescription = shortDescription;
        this.slug = slug;
        this.statusUrl = statusUrl;
        this.supportEmail = supportEmail;
        this.supportUrl = supportUrl;
        this.termsOfServiceUrl = termsOfServiceUrl;
        this.url = url;
        this.viewerCanAddPlans = viewerCanAddPlans;
        this.viewerCanApprove = viewerCanApprove;
        this.viewerCanDelist = viewerCanDelist;
        this.viewerCanEdit = viewerCanEdit;
        this.viewerCanEditCategories = viewerCanEditCategories;
        this.viewerCanEditPlans = viewerCanEditPlans;
        this.viewerCanRedraft = viewerCanRedraft;
        this.viewerCanReject = viewerCanReject;
        this.viewerCanRequestApproval = viewerCanRequestApproval;
        this.viewerHasPurchased = viewerHasPurchased;
        this.viewerHasPurchasedForAllOrganizations = viewerHasPurchasedForAllOrganizations;
        this.viewerIsListingAdmin = viewerIsListingAdmin;
    }

    public App getApp() {
        return app;
    }
    public void setApp(App app) {
        this.app = app;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }
    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getConfigurationResourcePath() {
        return configurationResourcePath;
    }
    public void setConfigurationResourcePath(String configurationResourcePath) {
        this.configurationResourcePath = configurationResourcePath;
    }

    public String getConfigurationUrl() {
        return configurationUrl;
    }
    public void setConfigurationUrl(String configurationUrl) {
        this.configurationUrl = configurationUrl;
    }

    public String getDocumentationUrl() {
        return documentationUrl;
    }
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public String getExtendedDescription() {
        return extendedDescription;
    }
    public void setExtendedDescription(String extendedDescription) {
        this.extendedDescription = extendedDescription;
    }

    public String getExtendedDescriptionHTML() {
        return extendedDescriptionHTML;
    }
    public void setExtendedDescriptionHTML(String extendedDescriptionHTML) {
        this.extendedDescriptionHTML = extendedDescriptionHTML;
    }

    public String getFullDescription() {
        return fullDescription;
    }
    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getFullDescriptionHTML() {
        return fullDescriptionHTML;
    }
    public void setFullDescriptionHTML(String fullDescriptionHTML) {
        this.fullDescriptionHTML = fullDescriptionHTML;
    }

    public Boolean getHasApprovalBeenRequested() {
        return hasApprovalBeenRequested;
    }
    public void setHasApprovalBeenRequested(Boolean hasApprovalBeenRequested) {
        this.hasApprovalBeenRequested = hasApprovalBeenRequested;
    }

    public Boolean getHasPublishedFreeTrialPlans() {
        return hasPublishedFreeTrialPlans;
    }
    public void setHasPublishedFreeTrialPlans(Boolean hasPublishedFreeTrialPlans) {
        this.hasPublishedFreeTrialPlans = hasPublishedFreeTrialPlans;
    }

    public Boolean getHasTermsOfService() {
        return hasTermsOfService;
    }
    public void setHasTermsOfService(Boolean hasTermsOfService) {
        this.hasTermsOfService = hasTermsOfService;
    }

    public String getHowItWorks() {
        return howItWorks;
    }
    public void setHowItWorks(String howItWorks) {
        this.howItWorks = howItWorks;
    }

    public String getHowItWorksHTML() {
        return howItWorksHTML;
    }
    public void setHowItWorksHTML(String howItWorksHTML) {
        this.howItWorksHTML = howItWorksHTML;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getInstallationUrl() {
        return installationUrl;
    }
    public void setInstallationUrl(String installationUrl) {
        this.installationUrl = installationUrl;
    }

    public Boolean getInstalledForViewer() {
        return installedForViewer;
    }
    public void setInstalledForViewer(Boolean installedForViewer) {
        this.installedForViewer = installedForViewer;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }
    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public Boolean getIsDelisted() {
        return isDelisted;
    }
    public void setIsDelisted(Boolean isDelisted) {
        this.isDelisted = isDelisted;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }
    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getIsRejected() {
        return isRejected;
    }
    public void setIsRejected(Boolean isRejected) {
        this.isRejected = isRejected;
    }

    public Boolean getIsUnverified() {
        return isUnverified;
    }
    public void setIsUnverified(Boolean isUnverified) {
        this.isUnverified = isUnverified;
    }

    public Boolean getIsUnverifiedPending() {
        return isUnverifiedPending;
    }
    public void setIsUnverifiedPending(Boolean isUnverifiedPending) {
        this.isUnverifiedPending = isUnverifiedPending;
    }

    public Boolean getIsVerificationPendingFromDraft() {
        return isVerificationPendingFromDraft;
    }
    public void setIsVerificationPendingFromDraft(Boolean isVerificationPendingFromDraft) {
        this.isVerificationPendingFromDraft = isVerificationPendingFromDraft;
    }

    public Boolean getIsVerificationPendingFromUnverified() {
        return isVerificationPendingFromUnverified;
    }
    public void setIsVerificationPendingFromUnverified(Boolean isVerificationPendingFromUnverified) {
        this.isVerificationPendingFromUnverified = isVerificationPendingFromUnverified;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getLogoBackgroundColor() {
        return logoBackgroundColor;
    }
    public void setLogoBackgroundColor(String logoBackgroundColor) {
        this.logoBackgroundColor = logoBackgroundColor;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNormalizedShortDescription() {
        return normalizedShortDescription;
    }
    public void setNormalizedShortDescription(String normalizedShortDescription) {
        this.normalizedShortDescription = normalizedShortDescription;
    }

    public String getPricingUrl() {
        return pricingUrl;
    }
    public void setPricingUrl(String pricingUrl) {
        this.pricingUrl = pricingUrl;
    }

    public MarketplaceCategory getPrimaryCategory() {
        return primaryCategory;
    }
    public void setPrimaryCategory(MarketplaceCategory primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }
    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public Collection<String> getScreenshotUrls() {
        return screenshotUrls;
    }
    public void setScreenshotUrls(Collection<String> screenshotUrls) {
        this.screenshotUrls = screenshotUrls;
    }

    public MarketplaceCategory getSecondaryCategory() {
        return secondaryCategory;
    }
    public void setSecondaryCategory(MarketplaceCategory secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatusUrl() {
        return statusUrl;
    }
    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
    }

    public String getSupportEmail() {
        return supportEmail;
    }
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public String getSupportUrl() {
        return supportUrl;
    }
    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }
    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getViewerCanAddPlans() {
        return viewerCanAddPlans;
    }
    public void setViewerCanAddPlans(Boolean viewerCanAddPlans) {
        this.viewerCanAddPlans = viewerCanAddPlans;
    }

    public Boolean getViewerCanApprove() {
        return viewerCanApprove;
    }
    public void setViewerCanApprove(Boolean viewerCanApprove) {
        this.viewerCanApprove = viewerCanApprove;
    }

    public Boolean getViewerCanDelist() {
        return viewerCanDelist;
    }
    public void setViewerCanDelist(Boolean viewerCanDelist) {
        this.viewerCanDelist = viewerCanDelist;
    }

    public Boolean getViewerCanEdit() {
        return viewerCanEdit;
    }
    public void setViewerCanEdit(Boolean viewerCanEdit) {
        this.viewerCanEdit = viewerCanEdit;
    }

    public Boolean getViewerCanEditCategories() {
        return viewerCanEditCategories;
    }
    public void setViewerCanEditCategories(Boolean viewerCanEditCategories) {
        this.viewerCanEditCategories = viewerCanEditCategories;
    }

    public Boolean getViewerCanEditPlans() {
        return viewerCanEditPlans;
    }
    public void setViewerCanEditPlans(Boolean viewerCanEditPlans) {
        this.viewerCanEditPlans = viewerCanEditPlans;
    }

    public Boolean getViewerCanRedraft() {
        return viewerCanRedraft;
    }
    public void setViewerCanRedraft(Boolean viewerCanRedraft) {
        this.viewerCanRedraft = viewerCanRedraft;
    }

    public Boolean getViewerCanReject() {
        return viewerCanReject;
    }
    public void setViewerCanReject(Boolean viewerCanReject) {
        this.viewerCanReject = viewerCanReject;
    }

    public Boolean getViewerCanRequestApproval() {
        return viewerCanRequestApproval;
    }
    public void setViewerCanRequestApproval(Boolean viewerCanRequestApproval) {
        this.viewerCanRequestApproval = viewerCanRequestApproval;
    }

    public Boolean getViewerHasPurchased() {
        return viewerHasPurchased;
    }
    public void setViewerHasPurchased(Boolean viewerHasPurchased) {
        this.viewerHasPurchased = viewerHasPurchased;
    }

    public Boolean getViewerHasPurchasedForAllOrganizations() {
        return viewerHasPurchasedForAllOrganizations;
    }
    public void setViewerHasPurchasedForAllOrganizations(Boolean viewerHasPurchasedForAllOrganizations) {
        this.viewerHasPurchasedForAllOrganizations = viewerHasPurchasedForAllOrganizations;
    }

    public Boolean getViewerIsListingAdmin() {
        return viewerIsListingAdmin;
    }
    public void setViewerIsListingAdmin(Boolean viewerIsListingAdmin) {
        this.viewerIsListingAdmin = viewerIsListingAdmin;
    }

}