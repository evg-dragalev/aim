package com.eugened.aim.webservice.core.dao.impl.dummy;

import com.eugened.aim.webservice.core.bean.Activity;
import com.eugened.aim.webservice.core.bean.Timetable;
import com.eugened.aim.webservice.core.dao.ActivityDao;
import com.eugened.aim.webservice.core.dao.TimetableDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RequestScoped
public class DummyTimetableDao implements TimetableDao {

    @Inject
    private ActivityDao activityDao;

    private List<Timetable> timetables = Arrays.asList(
            createTimetable("TImetable example", activityDao.getAll())
    );

    @Override
    public Timetable getById(long Id) {
        return null;
    }

    private Timetable createTimetable(String comment, Set<Activity> activities){
        Timetable timetable = new Timetable();
        timetable.setDescription(comment);
        timetable.setActivities(activities);
        return timetable;
    }
}
