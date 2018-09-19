package com.eugened.aim.ws.core.bean;

import java.util.List;

public class Activity {

    private Long id;

    private String descrption;

    private String name;

    private List<Artifact> artifacts;

    private TimetableEntry timeBegin;

    private TimetableEntry timeEnd;

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

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public TimetableEntry getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(TimetableEntry timeBegin) {
        this.timeBegin = timeBegin;
    }

    public TimetableEntry getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(TimetableEntry timeEnd) {
        this.timeEnd = timeEnd;
    }
}
