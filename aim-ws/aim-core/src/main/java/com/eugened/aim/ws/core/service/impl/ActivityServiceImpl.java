package com.eugened.aim.ws.core.service.impl;

import com.eugened.aim.ws.core.bean.Activity;
import com.eugened.aim.ws.core.dao.ActivityDao;
import com.eugened.aim.ws.core.service.ActivityService;

import javax.inject.Inject;
import java.util.List;

public class ActivityServiceImpl implements ActivityService {

    @Inject
    private ActivityDao activityDao;

    @Override
    public List<Activity> getAll() {
        return activityDao.getAll();
    }

    @Override
    public void save(Activity activity) {
        activityDao.save(activity);
    }

    @Override
    public void delete(long id) {
        activityDao.delete(id);
    }

    @Override
    public Activity getById(long id) {
        return activityDao.getById(id);
    }
}
