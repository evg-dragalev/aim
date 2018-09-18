package com.eugened.aim.ws.soap.service;

import com.eugened.aim.ws.core.bean.Activity;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService(serviceName = "Timetable",
        portName="TimetablePort",
        targetNamespace = "http://eugened.aim/jaxws/timetable")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
        use= SOAPBinding.Use.LITERAL,
        parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface TimetableWebService {

    @WebMethod
    List<Activity> getActivities();
}
