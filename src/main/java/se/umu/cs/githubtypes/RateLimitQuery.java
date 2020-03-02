package se.umu.cs.githubtypes;

public interface RateLimitQuery {

    RateLimit rateLimit(Boolean dryRun) throws Exception;

}