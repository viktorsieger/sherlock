package se.umu.cs.graphql;

import java.util.*;

public class FundingLink {

    private FundingPlatform platform;
    private String url;

    public FundingLink() {
    }

    public FundingLink(FundingPlatform platform, String url) {
        this.platform = platform;
        this.url = url;
    }

    public FundingPlatform getPlatform() {
        return platform;
    }
    public void setPlatform(FundingPlatform platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}