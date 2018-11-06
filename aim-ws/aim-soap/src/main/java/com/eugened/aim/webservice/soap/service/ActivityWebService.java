package com.eugened.aim.webservice.soap.service;

import com.eugened.aim.webservice.core.bean.Activity;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Set;


@WebService(serviceName = "Activity",
        portName="ActivityPort",
        targetNamespace = "http://eugened.aim/jaxws/activity")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
        use= SOAPBinding.Use.LITERAL,
        parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface ActivityWebService {

    @WebMethod
    Activity getActivity(long id);

    @WebMethod
    void deleteActivity(long id);

    @WebMethod
    void saveActivity(Activity activity);

    @WebMethod
    Set<Activity> getActivities();
}
