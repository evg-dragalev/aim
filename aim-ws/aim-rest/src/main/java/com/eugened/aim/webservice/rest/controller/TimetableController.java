package com.eugened.aim.webservice.rest.controller;

import com.eugened.aim.webservice.core.bean.Timetable;
import com.eugened.aim.webservice.core.service.TimetableService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/timetable")
@Produces(MediaType.APPLICATION_JSON)
public class TimetableController {

    @Inject
    private TimetableService timetableService;

    @GET
    @Path("/{timetableId}")
    public Timetable get(@PathParam("timetableId") Long id){
        return timetableService.getTimetable(id);
    }

    @PUT
    public Response create(Map<String, String> timtableForm){
        throw new UnsupportedOperationException("todo");
    }
}
