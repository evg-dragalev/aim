package com.eugened.aim.ws.core.dao.impl;

import com.eugened.aim.ws.core.bean.Activity;
import com.eugened.aim.ws.core.bean.Timetable;
import com.eugened.aim.ws.core.dao.TimetableDao;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

public class DummyTimetableDao implements TimetableDao {

    @Inject
    private DummyActivityDao activityDao;

    private List<Timetable> timetables = Arrays.asList(
            createTimetable("TImetable example", activityDao.getAll())
    );

    @Override
    public Timetable getById(long Id) {
        return null;
    }

    private Timetable createTimetable(String comment, List<Activity> activities){
        Timetable timetable = new Timetable();
        timetable.setComment(comment);
        timetable.setActivities(activities);
        return timetable;
    }
}
