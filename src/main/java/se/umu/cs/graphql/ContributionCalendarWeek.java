package se.umu.cs.graphql;

import java.util.*;

public class ContributionCalendarWeek {

    private Collection<ContributionCalendarDay> contributionDays;
    private String firstDay;

    public ContributionCalendarWeek() {
    }

    public ContributionCalendarWeek(Collection<ContributionCalendarDay> contributionDays, String firstDay) {
        this.contributionDays = contributionDays;
        this.firstDay = firstDay;
    }

    public Collection<ContributionCalendarDay> getContributionDays() {
        return contributionDays;
    }
    public void setContributionDays(Collection<ContributionCalendarDay> contributionDays) {
        this.contributionDays = contributionDays;
    }

    public String getFirstDay() {
        return firstDay;
    }
    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

}