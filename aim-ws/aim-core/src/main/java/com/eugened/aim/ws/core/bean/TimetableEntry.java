package com.eugened.aim.ws.core.bean;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static java.time.temporal.ChronoField.HOUR_OF_DAY;
import static java.time.temporal.ChronoField.MINUTE_OF_HOUR;

public class TimetableEntry {

    private DayOfWeek day;

    private byte hours;

    private byte minutes;

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public byte getHours() {
        return hours;
    }

    public void setHours(byte hours) {
        HOUR_OF_DAY.checkValidValue(hours);
        this.hours = hours;
    }

    public byte getMinutes() {
        return minutes;
    }

    public void setMinutes(byte minutes) {
        MINUTE_OF_HOUR.checkValidValue(minutes);
        this.minutes = minutes;
    }
}
