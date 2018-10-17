package com.eugened.aim.webservice.core.dao;

import com.eugened.aim.webservice.core.bean.Timetable;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface TimetableDao {

    Timetable getById(long Id);

}
