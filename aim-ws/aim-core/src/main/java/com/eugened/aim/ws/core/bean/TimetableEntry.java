package com.eugened.aim.ws.core.bean;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class TimetableEntry {

    private DayOfWeek day;

    private LocalTime time;

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
