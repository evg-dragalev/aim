package com.eugened.aim.webservice.core.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Activity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    private String descrption;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "artifactId")
    @JoinTable(
            name = "Activity2Artifact",
            joinColumns = @JoinColumn(name = "activityId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "artifactId", referencedColumnName = "id")
    )
    private Set<Artifact> artifacts;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescription(String descrption) {
        this.descrption = descrption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(Set<Artifact> artifacts) {
        this.artifacts = artifacts;
    }
}
