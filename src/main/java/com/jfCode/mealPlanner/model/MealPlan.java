package com.jfCode.mealPlanner.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MealPlan implements Serializable
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( nullable = false, updatable = false )
    private long id;
    private String calendarWeek;
    private String calendarWeekDate;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String sunday;
    private String extra1;
    private String extra2;
    private String mealPlanCode;

    public MealPlan() {}

    public MealPlan(String calendarWeek, String calendarWeekDate, String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday, String extra1, String extra2, String mealPlanCode) {
        this.calendarWeek = calendarWeek;
        this.calendarWeekDate = calendarWeekDate;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.mealPlanCode = mealPlanCode;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalendarWeek() {
        return calendarWeek;
    }

    public void setCalendarWeek(String calendarWeek) {
        this.calendarWeek = calendarWeek;
    }

    public String getCalendarWeekDate() {
        return calendarWeekDate;
    }

    public void setCalendarWeekDate(String calendarWeekDate) {
        this.calendarWeekDate = calendarWeekDate;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2;
    }

    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    @Override
    public String toString() {
        return "MealPlan{" +
                "id=" + id +
                ", week='" + calendarWeek + '\'' +
                ", date='" + calendarWeekDate + '\'' +
                ", monday='" + monday + '\'' +
                ", tuesday='" + tuesday + '\'' +
                ", wednesday='" + wednesday + '\'' +
                ", thursday='" + thursday + '\'' +
                ", friday='" + friday + '\'' +
                ", saturday='" + saturday + '\'' +
                ", sunday='" + sunday + '\'' +
                ", extra1='" + extra1 + '\'' +
                ", extra2='" + extra2 + '\'' +
                '}';
    }

}
