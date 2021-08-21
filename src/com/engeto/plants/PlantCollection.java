package com.engeto.plants;

import javax.net.ssl.SNIHostName;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlantCollection extends Throwable {
    public static final String DELIMETER = ";";
    private List<Plant> list = new ArrayList<>();

    public PlantCollection(String s) {

    }

    public PlantCollection() {

    }

    public static PlantCollection importFromTextFile(String fileName) throws PlantException {
        PlantCollection plant = new PlantCollection();
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            while (scanner.hasNext()) {
                String inputLine = scanner.nextLine();
                String[] plants = inputLine.split(";");
                if (plants.length != 5) throw new PlantCollection("Nespravny pocet polozek na radku: "+inputLine+
                " ("+plants.length+" polozek)");
                Plant plant1 = new Plant(plants[3], plants[2], plants[1], plants[0]);
                System.out.println(inputLine);
            }
        } catch (FileNotFoundException | PlantCollection ex) {
            throw new PlantException("Soubor" + fileName + " nenalezen: " + ex.getLocalizedMessage());
        }
        return plant;
    }
    public void exportTofile(String filename) throws PlantException {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(filename))) {
           for (Plant plant : list) {
               writer.println(plant.getName()+ DELIMETER +plant.getNote()+DELIMETER+plant.getFrequancyOfWatering()
               +DELIMETER+plant.getWatering()+DELIMETER+plant.getPlanted());
           }

        } catch (FileNotFoundException e) {
            throw new PlantException("Soubor" + filename + " nenalezen: " + e.getLocalizedMessage());

        }
    }
}
