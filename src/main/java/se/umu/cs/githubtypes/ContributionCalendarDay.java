package se.umu.cs.githubtypes;

public class ContributionCalendarDay {

    private String color;
    private Integer contributionCount;
    private String date;
    private Integer weekday;

    public ContributionCalendarDay() {
    }

    public ContributionCalendarDay(String color, Integer contributionCount, String date, Integer weekday) {
        this.color = color;
        this.contributionCount = contributionCount;
        this.date = date;
        this.weekday = weekday;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Integer getContributionCount() {
        return contributionCount;
    }
    public void setContributionCount(Integer contributionCount) {
        this.contributionCount = contributionCount;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public Integer getWeekday() {
        return weekday;
    }
    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

}