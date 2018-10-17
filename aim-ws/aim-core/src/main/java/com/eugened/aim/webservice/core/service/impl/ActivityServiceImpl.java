package com.eugened.aim.webservice.core.service.impl;

import com.eugened.aim.webservice.core.bean.Activity;
import com.eugened.aim.webservice.core.dao.ActivityDao;
import com.eugened.aim.webservice.core.service.ActivityService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Set;

@ApplicationScoped
public class ActivityServiceImpl implements ActivityService {

    @Inject
    private ActivityDao activityDao;

    @Override
    public Set<Activity> getAll() {
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
