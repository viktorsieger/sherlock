package se.umu.cs.githubtypes;

import java.util.Collection;

public class ContributionCalendar {

    private Collection<String> colors;
    private Boolean isHalloween;
    private Collection<ContributionCalendarMonth> months;
    private Integer totalContributions;
    private Collection<ContributionCalendarWeek> weeks;

    public ContributionCalendar() {
    }

    public ContributionCalendar(Collection<String> colors, Boolean isHalloween, Collection<ContributionCalendarMonth> months, Integer totalContributions, Collection<ContributionCalendarWeek> weeks) {
        this.colors = colors;
        this.isHalloween = isHalloween;
        this.months = months;
        this.totalContributions = totalContributions;
        this.weeks = weeks;
    }

    public Collection<String> getColors() {
        return colors;
    }
    public void setColors(Collection<String> colors) {
        this.colors = colors;
    }

    public Boolean getIsHalloween() {
        return isHalloween;
    }
    public void setIsHalloween(Boolean isHalloween) {
        this.isHalloween = isHalloween;
    }

    public Collection<ContributionCalendarMonth> getMonths() {
        return months;
    }
    public void setMonths(Collection<ContributionCalendarMonth> months) {
        this.months = months;
    }

    public Integer getTotalContributions() {
        return totalContributions;
    }
    public void setTotalContributions(Integer totalContributions) {
        this.totalContributions = totalContributions;
    }

    public Collection<ContributionCalendarWeek> getWeeks() {
        return weeks;
    }
    public void setWeeks(Collection<ContributionCalendarWeek> weeks) {
        this.weeks = weeks;
    }

}