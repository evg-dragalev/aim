package com.eugened.aim.ws.core.service.impl;

import com.eugened.aim.ws.core.bean.Artifact;
import com.eugened.aim.ws.core.dao.ArtifactDao;
import com.eugened.aim.ws.core.service.ArtifactService;

import javax.inject.Inject;
import java.util.List;

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

