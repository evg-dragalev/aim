package com.eugened.aim.ws.core.dao;

import com.eugened.aim.ws.core.bean.Activity;

import java.util.List;

public interface ActivityDao {

    Activity get(Long id);

    void save(Activity activity);

    List<Activity> getAll();

}
