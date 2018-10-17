package com.eugened.aim.webservice.core.service.impl;

import com.eugened.aim.webservice.core.bean.Artifact;
import com.eugened.aim.webservice.core.dao.ArtifactDao;
import com.eugened.aim.webservice.core.service.ArtifactService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ArtifactServiceImpl implements ArtifactService {

    @Inject
    private ArtifactDao artifactDao;

    @Override
    public List<Artifact> getAll() {
        return artifactDao.getAll();
    }

    @Override
    public void save(Artifact artifact) {
        artifactDao.save(artifact);
    }

    @Override
    public void delete(long id) {
        artifactDao.delete(id);
    }

    @Override
    public Artifact getById(long id) {
        return artifactDao.getById(id);
    }
}

