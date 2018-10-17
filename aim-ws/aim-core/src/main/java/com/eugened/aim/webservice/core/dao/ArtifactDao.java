package com.eugened.aim.webservice.core.dao;

import com.eugened.aim.webservice.core.bean.Artifact;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public interface ArtifactDao {

    List<Artifact> getAll();

    Artifact getById(long id);

    void save(Artifact artifact);

    void delete(long id);
}
