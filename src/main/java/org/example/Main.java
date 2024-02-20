package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a list of fitness action entries:");

        Scanner scan = new Scanner(System.in);
        String next = "";
        List<FitnessAction> actions = new ArrayList<>();

        do {
            next = scan.nextLine();
            FitnessAction action = createAction(next);
            if (action != null) {
                actions.add(action);
            }
        } while (!next.isEmpty());


        for (FitnessAction action : actions) {
            System.out.println(action.toString());
        }
    }

    public static FitnessAction createAction(String action) {
        String[] parameters = action.split(",");

        for (int i = 0; i < parameters.length; i++) {
            parameters[i] = parameters[i].trim();
        }

        if (parameters.length != 6) {
            return null;
        }

        String name;
        int repsPerSet;
        int minSets;
        int maxSets;
        int minutesPerSet;
        String targetMuscle;

        try {
            name = parameters[0];
            repsPerSet = Integer.parseInt(parameters[1]);
            minSets = Integer.parseInt(parameters[2]);
            maxSets = Integer.parseInt(parameters[3]);
            minutesPerSet = Integer.parseInt(parameters[4]);
            targetMuscle = parameters[5];
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

        FitnessAction fitnessAction = new FitnessAction(name, repsPerSet, minSets, maxSets, minutesPerSet, targetMuscle);
        return fitnessAction;
    }

}

// Input data:
/*
Push-Ups, 10, 10, 10, 10, Biceps Arms
Plank, 10, 10, 10, 10, Arms Core
Pull-Ups, 10, 10, 10, 10, Arms Shoulders Back
* */


