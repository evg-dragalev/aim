package com.eugened.aim.ws.core.bean;

import java.util.List;

public class Timetable {

    private List<Activity> activities;

    private String comment;

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
