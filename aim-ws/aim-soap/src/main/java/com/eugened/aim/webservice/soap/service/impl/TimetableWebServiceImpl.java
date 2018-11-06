package com.eugened.aim.webservice.soap.service.impl;

import com.eugened.aim.webservice.core.bean.Timetable;
import com.eugened.aim.webservice.core.service.TimetableService;
import com.eugened.aim.webservice.soap.service.TimetableWebService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "com.eugened.aim.webservice.soap.service.TimetableWebService")
@ApplicationScoped
public class TimetableWebServiceImpl implements TimetableWebService {

    @Inject
    private TimetableService timetableService;

    @Override
    @WebMethod
    public Timetable getTimetable(long id) {
        return timetableService.getTimetable(id);
    }
}
