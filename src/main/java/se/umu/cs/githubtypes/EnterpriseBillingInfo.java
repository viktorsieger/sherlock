package se.umu.cs.githubtypes;

public class EnterpriseBillingInfo {

    private Integer allLicensableUsersCount;
    private Integer assetPacks;
    private Integer availableSeats;
    private Float bandwidthQuota;
    private Float bandwidthUsage;
    private Integer bandwidthUsagePercentage;
    private Integer seats;
    private Float storageQuota;
    private Float storageUsage;
    private Integer storageUsagePercentage;
    private Integer totalAvailableLicenses;
    private Integer totalLicenses;

    public EnterpriseBillingInfo() {
    }

    public EnterpriseBillingInfo(Integer allLicensableUsersCount, Integer assetPacks, Integer availableSeats, Float bandwidthQuota, Float bandwidthUsage, Integer bandwidthUsagePercentage, Integer seats, Float storageQuota, Float storageUsage, Integer storageUsagePercentage, Integer totalAvailableLicenses, Integer totalLicenses) {
        this.allLicensableUsersCount = allLicensableUsersCount;
        this.assetPacks = assetPacks;
        this.availableSeats = availableSeats;
        this.bandwidthQuota = bandwidthQuota;
        this.bandwidthUsage = bandwidthUsage;
        this.bandwidthUsagePercentage = bandwidthUsagePercentage;
        this.seats = seats;
        this.storageQuota = storageQuota;
        this.storageUsage = storageUsage;
        this.storageUsagePercentage = storageUsagePercentage;
        this.totalAvailableLicenses = totalAvailableLicenses;
        this.totalLicenses = totalLicenses;
    }

    public Integer getAllLicensableUsersCount() {
        return allLicensableUsersCount;
    }
    public void setAllLicensableUsersCount(Integer allLicensableUsersCount) {
        this.allLicensableUsersCount = allLicensableUsersCount;
    }

    public Integer getAssetPacks() {
        return assetPacks;
    }
    public void setAssetPacks(Integer assetPacks) {
        this.assetPacks = assetPacks;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Float getBandwidthQuota() {
        return bandwidthQuota;
    }
    public void setBandwidthQuota(Float bandwidthQuota) {
        this.bandwidthQuota = bandwidthQuota;
    }

    public Float getBandwidthUsage() {
        return bandwidthUsage;
    }
    public void setBandwidthUsage(Float bandwidthUsage) {
        this.bandwidthUsage = bandwidthUsage;
    }

    public Integer getBandwidthUsagePercentage() {
        return bandwidthUsagePercentage;
    }
    public void setBandwidthUsagePercentage(Integer bandwidthUsagePercentage) {
        this.bandwidthUsagePercentage = bandwidthUsagePercentage;
    }

    public Integer getSeats() {
        return seats;
    }
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Float getStorageQuota() {
        return storageQuota;
    }
    public void setStorageQuota(Float storageQuota) {
        this.storageQuota = storageQuota;
    }

    public Float getStorageUsage() {
        return storageUsage;
    }
    public void setStorageUsage(Float storageUsage) {
        this.storageUsage = storageUsage;
    }

    public Integer getStorageUsagePercentage() {
        return storageUsagePercentage;
    }
    public void setStorageUsagePercentage(Integer storageUsagePercentage) {
        this.storageUsagePercentage = storageUsagePercentage;
    }

    public Integer getTotalAvailableLicenses() {
        return totalAvailableLicenses;
    }
    public void setTotalAvailableLicenses(Integer totalAvailableLicenses) {
        this.totalAvailableLicenses = totalAvailableLicenses;
    }

    public Integer getTotalLicenses() {
        return totalLicenses;
    }
    public void setTotalLicenses(Integer totalLicenses) {
        this.totalLicenses = totalLicenses;
    }

}