package com.eugened.aim.ws.core.service.impl;

import com.eugened.aim.ws.core.bean.Activity;
import com.eugened.aim.ws.core.dao.ActivityDao;
import com.eugened.aim.ws.core.service.TimetableService;

import javax.inject.Inject;
import java.util.List;

public class DefaultTimetableService implements TimetableService {

    @Inject
    private ActivityDao activityDao;

    @Override
    public List<Activity> getActivities() {
        return null;
    }
}
