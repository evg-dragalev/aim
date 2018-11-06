package com.eugened.aim.webservice.soap.service.impl;

import com.eugened.aim.webservice.core.bean.Activity;
import com.eugened.aim.webservice.core.service.ActivityService;
import com.eugened.aim.webservice.soap.service.ActivityWebService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.jws.WebService;
import java.util.Set;

@WebService(endpointInterface = "com.eugened.aim.webservice.soap.service.ActivityWebService")
@ApplicationScoped
public class ActivityWebServiceImpl implements ActivityWebService {

    @Inject
    ActivityService activityService;

    @Override
    public Activity getActivity(long id) {
        return activityService.getById(id);
    }

    @Override
    public void deleteActivity(long id) {
        activityService.delete(id);
    }

    @Override
    public void saveActivity(Activity activity) {
        activityService.save(activity);
    }

    @Override
    public Set<Activity> getActivities() {
        return activityService.getAll();
    }
}
