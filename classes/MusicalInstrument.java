package classes;

/*
 * class MusicalInstrument
 * project №16 - Library catalog
 * @author Pisnia Mariia
 */


public class MusicalInstrument extends Resource {
    private String name;
    private double rentalCostPerDay;
    private String musicType;
    private String manufacturer;

    public MusicalInstrument(String name, double rentalCostPerDay, String musicType, String manufacturer) {
        this.name = name;
        this.rentalCostPerDay = rentalCostPerDay;
        this.musicType = musicType;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public double getRentalCostPerDay() {
        return rentalCostPerDay;
    }

    public String getMusicType() {
        return musicType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Інструмент: " + name + "Вартість за оренду на день:" + rentalCostPerDay +
               ", Тип музики: " + musicType + ", Виробник: " + manufacturer;
    }
}