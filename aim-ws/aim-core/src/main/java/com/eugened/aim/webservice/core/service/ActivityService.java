package com.eugened.aim.webservice.core.service;

import com.eugened.aim.webservice.core.bean.Activity;

import java.util.Set;

public interface ActivityService {

    Set<Activity> getAll();

    void save(Activity activity);

    void delete(long id);

    Activity getById(long id);

}
