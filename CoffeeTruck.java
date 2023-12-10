package hw_9;

/**
 * task 6.13
 * @author Pisnia Mariia
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Coffee {
    private String type;
    private String state;
    private double price;
    private double volume;

    public Coffee(String type, String state, double price, double volume) {
        this.type = type;
        this.state = state;
        this.price = price;
        this.volume = volume;
    }

    public String getType() {return type;}
    public String getState() {return state;}
    public double getPrice() {return price;}
    public double getVolume() {return volume;}

    @Override
    public String toString() {
        return "Coffee: " + type + ' ' + state + ' ' + price + ' ' + volume;
    }
}

public class CoffeeTruck {
    public static void main(String[] args) {
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Arabica", "Bean", 12.99, 250));
        coffees.add(new Coffee("Robusta", "Ground", 9.99, 500));
        coffees.add(new Coffee("Liberica", "Sachet", 1.5, 50));

        Collections.sort(coffees, Comparator.comparingDouble(coffee -> coffee.getPrice() / coffee.getVolume()));

        System.out.println("Sorted list of coffee by price/volume ratio:");
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }

        double maxPrice = 10.0;
        double minVolume = 200.0;

        System.out.println("\nCoffee that matches the entered parameters:");
        for (Coffee coffee : coffees) {
            if (coffee.getPrice() <= maxPrice && coffee.getVolume() >= minVolume) {
                System.out.println(coffee);
            }
        }
    }
}
