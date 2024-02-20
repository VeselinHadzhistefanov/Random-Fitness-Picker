package org.example;

import java.util.ArrayList;

public class FitnessAction {
    private String name;
    private String description; // Optional
    private int repsPerSet;
    private int minSets;
    private int maxSets;
    private int minutesPerSet;
    private String targetMuscles;

    public FitnessAction(String name, String description, int repsPerSet, int minSets, int maxSets, int minutesPerSet, String targetMuscles) {
        this.name = name;
        this.description = description;
        this.repsPerSet = repsPerSet;
        this.minSets = minSets;
        this.maxSets = maxSets;
        this.minutesPerSet = minutesPerSet;
        this.targetMuscles = targetMuscles;
    }

    public FitnessAction(String name, int repsPerSet, int minSets, int maxSets, int minutesPerSet, String targetMuscles) {
        this(name, "", repsPerSet, minSets, maxSets, minutesPerSet, targetMuscles);
    }


    @Override
    public String toString() {
        return "FitnessAction{" +
                "name='" + name + '\'' +
                ", repsPerSet=" + repsPerSet +
                ", minSets=" + minSets +
                ", maxSets=" + maxSets +
                ", minutesPerSet=" + minutesPerSet +
                ", targetMuscles='" + targetMuscles + '\'' +
                '}';
    }
}
