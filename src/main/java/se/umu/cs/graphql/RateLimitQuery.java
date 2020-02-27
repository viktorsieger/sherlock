package se.umu.cs.graphql;

import java.util.*;

public interface RateLimitQuery {

    RateLimit rateLimit(Boolean dryRun) throws Exception;

}