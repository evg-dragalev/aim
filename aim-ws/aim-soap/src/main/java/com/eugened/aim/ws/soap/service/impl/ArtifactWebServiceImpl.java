package com.eugened.aim.ws.soap.service.impl;

import com.eugened.aim.ws.core.bean.Artifact;
import com.eugened.aim.ws.core.service.ArtifactService;
import com.eugened.aim.ws.soap.service.ArtifactWebService;

import javax.inject.Inject;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.eugened.aim.ws.soap.service.ArtifactWebService")
public class ArtifactWebServiceImpl implements ArtifactWebService {

    @Inject
    ArtifactService artifactService;

    @Override
    public Artifact getArtifact(long id) {
        return artifactService.getById(id);
    }

    @Override
    public void deleteArtifact(long id) {
        artifactService.delete(id);
    }

    @Override
    public void saveArtifact(Artifact artifact) {
        artifactService.save(artifact);
    }

    @Override
    public List<Artifact> getArtifacts() {
        return artifactService.getAll();
    }
}
