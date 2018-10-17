package com.eugened.aim.webservice.core.service;

import com.eugened.aim.webservice.core.bean.Artifact;

import java.util.List;

public interface ArtifactService {

    List<Artifact> getAll();

    void save(Artifact artifact);

    void delete(long id);

    Artifact getById(long id);
}
