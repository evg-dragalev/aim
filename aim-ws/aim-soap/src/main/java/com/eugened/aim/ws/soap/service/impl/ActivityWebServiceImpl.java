package com.eugened.aim.ws.soap.service.impl;

import com.eugened.aim.ws.core.bean.Activity;
import com.eugened.aim.ws.core.service.ActivityService;
import com.eugened.aim.ws.soap.service.ActivityWebService;

import javax.inject.Inject;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.eugened.aim.ws.soap.service.ActivityWebService")
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
    public List<Activity> getActivities() {
        return activityService.getAll();
    }
}
