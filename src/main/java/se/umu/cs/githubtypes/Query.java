package se.umu.cs.githubtypes;

import java.util.Collection;

public interface Query {

    CodeOfConduct codeOfConduct(String key) throws Exception;

    Collection<CodeOfConduct> codesOfConduct() throws Exception;

    Enterprise enterprise(String invitationToken, String slug) throws Exception;

    EnterpriseAdministratorInvitation enterpriseAdministratorInvitation(String enterpriseSlug, EnterpriseAdministratorRole role, String userLogin) throws Exception;

    EnterpriseAdministratorInvitation enterpriseAdministratorInvitationByToken(String invitationToken) throws Exception;

    License license(String key) throws Exception;

    Collection<License> licenses() throws Exception;

    Collection<MarketplaceCategory> marketplaceCategories(Boolean excludeEmpty, Boolean excludeSubcategories, Collection<String> includeCategories) throws Exception;

    MarketplaceCategory marketplaceCategory(String slug, Boolean useTopicAliases) throws Exception;

    MarketplaceListing marketplaceListing(String slug) throws Exception;

    MarketplaceListingConnection marketplaceListings(String adminId, String after, Boolean allStates, String before, String categorySlug, Integer first, Integer last, String organizationId, Boolean primaryCategoryOnly, Collection<String> slugs, Boolean useTopicAliases, Boolean viewerCanAdmin, Boolean withFreeTrialsOnly) throws Exception;

    GitHubMetadata meta() throws Exception;

    Node node(String id) throws Exception;

    Collection<Node> nodes(Collection<String> ids) throws Exception;

    Organization organization(String login) throws Exception;

    RateLimit rateLimit(Boolean dryRun) throws Exception;

    Query relay() throws Exception;

    Repository repository(String name, String owner) throws Exception;

    RepositoryOwner repositoryOwner(String login) throws Exception;

    UniformResourceLocatable resource(String url) throws Exception;

    SearchResultItemConnection search(String after, String before, Integer first, Integer last, String query, SearchType type) throws Exception;

    SecurityAdvisoryConnection securityAdvisories(String after, String before, Integer first, SecurityAdvisoryIdentifierFilter identifier, Integer last, SecurityAdvisoryOrder orderBy, String publishedSince, String updatedSince) throws Exception;

    SecurityAdvisory securityAdvisory(String ghsaId) throws Exception;

    SecurityVulnerabilityConnection securityVulnerabilities(String after, String before, SecurityAdvisoryEcosystem ecosystem, Integer first, Integer last, SecurityVulnerabilityOrder orderBy, String Package, Collection<SecurityAdvisorySeverity> severities) throws Exception;

    SponsorsListing sponsorsListing(String slug) throws Exception;

    Topic topic(String name) throws Exception;

    User user(String login) throws Exception;

    User viewer() throws Exception;

}