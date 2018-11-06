package com.eugened.aim.web.service.impl.dummy;

import com.eugened.aim.web.beans.Artifact;
import com.eugened.aim.web.service.ArtifactService;
import com.eugened.aim.web.service.factory.ArtifactFactoryImpl;

import java.util.Arrays;
import java.util.List;

public class DummyArtifactService implements ArtifactService {

    private List<Artifact> artifacts = Arrays.asList(
            ArtifactFactoryImpl.create(1L ,"Book", "Book to read"),
            ArtifactFactoryImpl.create(2L ,"Recipe", "How to cook")
    );


    public List<Artifact> getList() {
        return null;
    }

    public void get(long id) {

    }

    public Artifact remove(long id) {
        return null;
    }

    public Artifact add(Artifact artifact) {
        return null;
    }
}
