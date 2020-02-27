package se.umu.cs.graphql;

import java.util.*;

public class ContributionCalendarMonth {

    private String firstDay;
    private String name;
    private Integer totalWeeks;
    private Integer year;

    public ContributionCalendarMonth() {
    }

    public ContributionCalendarMonth(String firstDay, String name, Integer totalWeeks, Integer year) {
        this.firstDay = firstDay;
        this.name = name;
        this.totalWeeks = totalWeeks;
        this.year = year;
    }

    public String getFirstDay() {
        return firstDay;
    }
    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalWeeks() {
        return totalWeeks;
    }
    public void setTotalWeeks(Integer totalWeeks) {
        this.totalWeeks = totalWeeks;
    }

    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

}