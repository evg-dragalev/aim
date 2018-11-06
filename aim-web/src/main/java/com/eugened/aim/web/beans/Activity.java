package com.eugened.aim.web.beans;

import java.util.List;

public class Activity {

    private Long id;

    private List<Artifact> artifacts;

    private String description;

    private Long timeCostMinutes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTimeCostMinutes() {
        return timeCostMinutes;
    }

    public void setTimeCostMinutes(Long timeCostMinutes) {
        this.timeCostMinutes = timeCostMinutes;
    }
}
