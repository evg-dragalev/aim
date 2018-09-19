package com.eugened.aim.ws.core.service.impl;

import com.eugened.aim.ws.core.bean.Timetable;
import com.eugened.aim.ws.core.dao.TimetableDao;
import com.eugened.aim.ws.core.service.TimetableService;

import javax.inject.Inject;

public class TimetableServiceImmpl implements TimetableService {

    @Inject
    private TimetableDao timetableDao;

    @Override
    public Timetable getTimetable(long id) {
        return timetableDao.getById(id);
    }



}
