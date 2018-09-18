package com.eugened.aim.ws.core.dao;

import com.eugened.aim.ws.core.bean.Artifact;

import java.util.List;

public interface ArtifactDao {

    Artifact get(Long id);

    void save(Artifact artifact);

    List<Artifact> getAll();
}
