package com.engeto.plants;

import java.time.LocalDate;

public class Main {

    public static final String FILENAME = "kvetiny.txt";

    public static void main(String[] args) {
        PlantCollection list = new PlantCollection();
        try {
            list.importFromTextFile(FILENAME);
        } catch (PlantException e) {
            System.err.println(e.getLocalizedMessage());
        }

        list.addPlant(new Plant("Amarylis v obýváku"));
        list.addPlant(new Plant("Bazalka v kuchyni", 3, LocalDate.now()));
       // list.removePlant(1);
        list.exportToFile(FILENAME);


    }

}
