package com.eugened.aim.webservice.core.dao;

import com.eugened.aim.webservice.core.bean.Activity;

import javax.enterprise.context.ApplicationScoped;
import java.util.Set;

@ApplicationScoped
public interface ActivityDao {

    Activity getById(Long id);

    void save(Activity activity);

    Set<Activity> getAll();

    void delete(Long id);
}
