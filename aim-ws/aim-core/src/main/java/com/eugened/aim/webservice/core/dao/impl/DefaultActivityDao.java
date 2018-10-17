package com.eugened.aim.webservice.core.dao.impl;

import com.eugened.aim.webservice.core.bean.Activity;
import com.eugened.aim.webservice.core.dao.ActivityDao;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;

@RequestScoped
public class DefaultActivityDao implements ActivityDao {

    @PersistenceContext(name = "com.eugened.aim.ws.demodb.jpa")
    private EntityManager entityManager;

    @Override
    public Activity getById(Long id) {
        return entityManager.find(Activity.class, id);
    }

    @Override
    public void save(Activity activity) {
        entityManager.persist(activity);
        entityManager.flush();
    }

    @Override
    public Set<Activity> getAll() {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(getById(id));
    }
}
