package com.eugened.aim.ws.soap.service.impl;

import com.eugened.aim.ws.core.bean.Timetable;
import com.eugened.aim.ws.core.service.TimetableService;
import com.eugened.aim.ws.soap.service.TimetableWebService;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "com.eugened.aim.ws.soap.service.TimetableWebService")
public class TimetableWebServiceImpl implements TimetableWebService {

    @Inject
    private TimetableService timetableService;

    @Override
    @WebMethod
    public Timetable getTimetable(long id) {
        return timetableService.getTimetable(id);
    }
}
