package com.eugened.aim.webservice.rest.controller;

import com.eugened.aim.webservice.core.bean.Activity;
import com.eugened.aim.webservice.core.service.ActivityService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;
import java.util.Set;

@Path("timetable/{timetableId}/activity")
@Produces(MediaType.APPLICATION_JSON)
public class ActivityController {

    @Inject
    private ActivityService activityService;

    @GET
    public Set<Activity> getAll(){
        return activityService.getAll();
    }

    @GET
    @Path("/{userId}")
    public Activity get(@PathParam("userId") Long id){
        return activityService.getById(id);
    }

    @PUT
    public Response create(Map<String, String> activityForm){
        throw new UnsupportedOperationException("Todo");
    }

    @DELETE
    public void delete(Long id){
        activityService.delete(id);
    }

    @POST
    public Response update(Map<String, String> activityForm){
        throw new UnsupportedOperationException("Todo");
    }
}
