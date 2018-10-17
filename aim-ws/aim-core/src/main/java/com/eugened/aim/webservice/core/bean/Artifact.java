package com.eugened.aim.webservice.core.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Artifact {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    private String name;

    private String description;

    @OneToMany
    @JoinColumn(name = "artifactId")
    private Set<TimeDetail> timeDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<TimeDetail> getTimeDetails() {
        return timeDetails;
    }

    public void setTimeDetails(Set<TimeDetail> timeDetails) {
        this.timeDetails = timeDetails;
    }
}
