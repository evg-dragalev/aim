package com.eugened.aim.web.service.factory;

import com.eugened.aim.web.beans.Artifact;

public class ArtifactFactoryImpl {

    public static Artifact create(Long id, String name, String description){
        Artifact artifact = new Artifact();
        artifact.setId(id);
        artifact.setDescription(description);
        artifact.setName(name);
        return artifact;
    }
}
