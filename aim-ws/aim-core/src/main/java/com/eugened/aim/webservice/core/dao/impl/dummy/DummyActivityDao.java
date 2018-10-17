package com.eugened.aim.webservice.core.dao.impl.dummy;

import com.eugened.aim.webservice.core.bean.Activity;
import com.eugened.aim.webservice.core.dao.ActivityDao;

import javax.inject.Named;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Deprecated
public class DummyActivityDao implements ActivityDao {

    private Set<Activity> activities = Stream.of(
            createActivity(1L, "Eat", "The thing we all need to do sometimes"),
            createActivity(2L, "Sleep", "Sweet dreams are made of this..."),
            createActivity(3L, "Code", "Hello world!")
    ).collect(Collectors.toSet());

    @Override
    public Set<Activity> getAll() {
        return activities;
    }

    @Override
    public Activity getById(Long id) {
        return activities.stream()
                .filter((a) -> a.getId().equals(id))
                .findAny()
                .orElseThrow(()->new IllegalArgumentException(String.format("Activity %d not found", id)));
    }

    @Override
    public void save(Activity activity) {
        activities.add(activity);
    }

    @Override
    public void delete(Long id){
        activities.stream()
                .filter((a) -> a.getId().equals(id))
                .forEach((a) -> activities.remove(a));
    }

    private Activity createActivity(long id, String name, String description){
        Activity activity = new Activity();
        activity.setId(id);
        activity.setName(name);
        activity.setDescription(description);
        return activity;
    }
}
