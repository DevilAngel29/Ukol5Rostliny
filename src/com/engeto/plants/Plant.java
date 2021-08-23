package com.engeto.plants;

import java.time.LocalDate;

public class Plant {
    private String name;
    private String note;
    private LocalDate planted;
    private LocalDate watering;
    private int frequancyOfWatering;

    public Plant(String name, String note, LocalDate planted, LocalDate watering, int frequancyOfWatering) throws PlantException {
        this.name = name;
        this.note = note;
        this.planted = planted;
        this.watering = watering;
        this.frequancyOfWatering = frequancyOfWatering + 7;

    }

    public Plant(String note, LocalDate watering) {
        this.note = note;
        this.watering = LocalDate.now();
    }

    public Plant(String note, LocalDate planted, LocalDate watering, int frequancyOfWatering){
        this.note = note;
        this.planted = LocalDate.now();
        this.watering = LocalDate.now();
        this.frequancyOfWatering = frequancyOfWatering;

    }

    public Plant(String plant, String plant1, String plant2, String plant3) {

    }

    public Plant(String note) {
        this.note = note;
    }

    public Plant(String name, int frequancyOfWatering, LocalDate planted) {
        this.name = name;
        this.frequancyOfWatering = frequancyOfWatering;
        this.planted = planted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) throws PlantException  {
        if(watering.isBefore(planted)) {
            throw new PlantException("poslední zálivky — nesmí být starší než datum zasazení rostliny"+watering);
        }
        this.watering = watering;
    }

    public int getFrequancyOfWatering() {
        return frequancyOfWatering;
    }

    public void setFrequancyOfWatering(int frequancyOfWatering) throws PlantException {
        if(frequancyOfWatering<=0) {
            throw new PlantException("Spatna frekvence zalivky"+frequancyOfWatering);
        }
        this.frequancyOfWatering = frequancyOfWatering;
    }

    public String getWateringInfo(){
        String getWateringInfo = " Nazev kvetiny: " + name + " Posledni zalivka: " + watering +
                " Datum doporuceni zalivky "
                + frequancyOfWatering;
        return getWateringInfo;
    }

    public void add(PlantCollection plants) {

    }
}
