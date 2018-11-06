package com.eugened.aim.web.service;

import com.eugened.aim.web.beans.Activity;

import java.util.List;

public interface ActivityService {

    Activity add(Activity activity);

    Activity get(long id);

    void remove(long id);

    List<Activity> getList();
}
