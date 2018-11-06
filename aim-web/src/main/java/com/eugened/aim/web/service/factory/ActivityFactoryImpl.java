package com.eugened.aim.web.service.factory;

import com.eugened.aim.web.beans.Activity;
import com.eugened.aim.web.beans.Artifact;

import java.util.Arrays;
import java.util.List;

public class ActivityFactoryImpl {

    public static Activity create(Long id, String description, long timeCostMinutes, List<Artifact> artifacts){
        Activity activity = new Activity();
        activity.setId(id);
        activity.setDescription(description);
        activity.setTimeCostMinutes(timeCostMinutes);
        activity.setArtifacts(artifacts);
        return activity;
    }

    public static Activity create(Long id, String description, long timeCostMinutes, Artifact... artifacts){
        return create(id, description, timeCostMinutes, Arrays.asList(artifacts));
    }
}
