package com.eugened.aim.ws.core.service;

import com.eugened.aim.ws.core.bean.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> getAll();

    void save(Activity activity);

    void delete(long id);

    Activity getById(long id);

}
