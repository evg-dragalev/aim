package com.eugened.aim.ws.core.dao;

import com.eugened.aim.ws.core.bean.Artifact;

import java.util.List;

public interface ArtifactDao {

    List<Artifact> getAll();

    Artifact getById(long id);

    void save(Artifact artifact);

    void delete(long id);
}
