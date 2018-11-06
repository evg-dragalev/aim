package com.eugened.aim.web.service;

import com.eugened.aim.web.beans.Artifact;

import java.util.List;

public interface ArtifactService {

    List<Artifact> getList();

    void get(long id);

    Artifact remove(long id);

    Artifact add(Artifact artifact);
}
