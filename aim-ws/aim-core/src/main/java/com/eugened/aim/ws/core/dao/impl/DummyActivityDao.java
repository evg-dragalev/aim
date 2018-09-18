package com.eugened.aim.ws.core.dao.impl;

import com.eugened.aim.ws.core.bean.Activity;
import com.eugened.aim.ws.core.dao.ActivityDao;

import java.util.Arrays;
import java.util.List;

public class DummyActivityDao implements ActivityDao {

    private List<Activity> activities = Arrays.asList(
            createActivity(1L, "Eat", "The thing we all need to do sometimes"),
            createActivity(2L, "Sleep", "Sweet dreams are made of this..."),
            createActivity(3L, "Code", "Hello world!")
    );

    @Override
    public List<Activity> getAll() {
        return activities;
    }

    private Activity createActivity(long id, String name, String description){
        Activity activity = new Activity();
        activity.setId(id);
        activity.setName(name);
        activity.setDescrption(description);
        return activity;
    }

    @Override
    public Activity get(Long id) {
        throw new UnsupportedOperationException("Dummy, not supported");
    }

    @Override
    public void save(Activity activity) {
        throw new UnsupportedOperationException("Dummy, not supported");
    }
}
