package com.engeto.plants;

import java.time.LocalDate;

public class Main {

    public static final String FILENAME = "kvetiny.txt";

    public static void main(String[] args) {
        PlantCollection plants = new PlantCollection();
        try {
            PlantCollection plant = PlantCollection.importFromTextFile(FILENAME);
        } catch (PlantException e) {
            System.err.println(e.getLocalizedMessage());
        }

        Plant bazalka = new Plant("V kuchyni", LocalDate.now(),LocalDate.now(),3);
        bazalka.add(plants);
        try {
            plants.exportTofile(FILENAME);
        } catch (PlantException e) {
            e.printStackTrace();
        }

    }

}
