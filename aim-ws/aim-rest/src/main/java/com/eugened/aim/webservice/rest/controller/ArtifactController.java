package com.eugened.aim.webservice.rest.controller;

import com.eugened.aim.webservice.core.bean.Artifact;
import com.eugened.aim.webservice.core.service.ArtifactService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Path("/artifact")
@Produces(MediaType.APPLICATION_JSON)
public class ArtifactController {

    private static final Logger LOG = Logger.getLogger(ArtifactController.class.toString());

    @Inject
    private ArtifactService artifactService;

    @PostConstruct
    public void init(){
        LOG.info("POST CONSTRUCT");
    }

    @GET
    public List<Artifact> getAll(){
        return artifactService.getAll();
    }

    @GET
    @Path("/{artifactId}")
    public Artifact get(@PathParam("artifactId") Long id){
        return artifactService.getById(id);
    }

    @PUT
    public Response create(Map<String, String> artifactForm){
        throw new UnsupportedOperationException("todo");
    }

    @DELETE
    @Path("/{artifactId}")
    public void delete(@PathParam("artifactId") Long id){
        artifactService.delete(id);
    }

    @POST
    public void update(Map<String, String> artifactForm){
        throw new UnsupportedOperationException("todo");
    }
}
