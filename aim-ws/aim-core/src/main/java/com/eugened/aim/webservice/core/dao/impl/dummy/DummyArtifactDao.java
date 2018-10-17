package com.eugened.aim.webservice.core.dao.impl.dummy;

import com.eugened.aim.webservice.core.bean.Artifact;
import com.eugened.aim.webservice.core.dao.ArtifactDao;

import javax.enterprise.context.RequestScoped;
import java.util.Arrays;
import java.util.List;

@RequestScoped
public class DummyArtifactDao implements ArtifactDao {

    private List<Artifact> artifacts = Arrays.asList(
            createArtifact(1L, "Fry Chiken", "Cook me"),
            createArtifact(2L, "Pillow", "Best frend..."),
            createArtifact(3L, "Book", "Improve yourself!")
    );

    @Override
    public List<Artifact> getAll() {
        return artifacts;
    }

    @Override
    public Artifact getById(long id) {
        return artifacts.stream()
                .filter((a) -> id==a.getId())
                .findAny()
                .orElseThrow(()->new IllegalArgumentException(String.format("Activity %d not found", id)));
    }

    @Override
    public void save(Artifact activity) {
        artifacts.add(activity);
    }

    public void delete(long id){
        artifacts.stream()
                .filter((a) -> id==a.getId())
                .forEach((a) -> artifacts.remove(a));
    }

    private Artifact createArtifact(long id, String name, String description){
        Artifact artifact = new Artifact();
        artifact.setId(id);
        artifact.setName(name);
        artifact.setDescription(description);
        return artifact;
    }
}
