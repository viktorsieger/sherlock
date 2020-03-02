package se.umu.cs.githubtypes;

public class RateLimit {

    private Integer cost;
    private Integer limit;
    private Integer nodeCount;
    private Integer remaining;
    private String resetAt;

    public RateLimit() {
    }

    public RateLimit(Integer cost, Integer limit, Integer nodeCount, Integer remaining, String resetAt) {
        this.cost = cost;
        this.limit = limit;
        this.nodeCount = nodeCount;
        this.remaining = remaining;
        this.resetAt = resetAt;
    }

    public Integer getCost() {
        return cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }
    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public Integer getRemaining() {
        return remaining;
    }
    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public String getResetAt() {
        return resetAt;
    }
    public void setResetAt(String resetAt) {
        this.resetAt = resetAt;
    }

}