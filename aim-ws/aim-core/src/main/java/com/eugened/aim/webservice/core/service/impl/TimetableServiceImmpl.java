package com.eugened.aim.webservice.core.service.impl;

import com.eugened.aim.webservice.core.bean.Timetable;
import com.eugened.aim.webservice.core.dao.TimetableDao;
import com.eugened.aim.webservice.core.service.TimetableService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class TimetableServiceImmpl implements TimetableService {

    @Inject
    private TimetableDao timetableDao;

    @Override
    public Timetable getTimetable(long id) {
        return timetableDao.getById(id);
    }



}
