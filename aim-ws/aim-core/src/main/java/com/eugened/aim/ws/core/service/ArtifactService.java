package com.eugened.aim.ws.core.service;

import com.eugened.aim.ws.core.bean.Artifact;

import java.util.List;

public interface ArtifactService {

    List<Artifact> getAll();

    void save(Artifact artifact);

    void delete(long id);

    Artifact getById(long id);
}
