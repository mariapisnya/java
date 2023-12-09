package hw_7;

/**
 * task 2.8
 * @author Pisnia Mariia
 */

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(String brand, String model, int year, String color, double price, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand: " + brand +
                ", model: " + model +
                ", year: " + year +
                ", color: " + color +
                ", price: " + price +
                ", registrationNumber: " + registrationNumber;
    }

    public static void main(String[] args) {
        Car[] cars = new Car[6];
        cars[0] = new Car("Toyota", "Camry", 2022, "Blue", 25000.0, "ABC123");
        cars[1] = new Car("Toyota", "Camry", 2022, "Red", 25000.0, "CBA321");
        cars[2] = new Car("Honda", "Accord", 2021, "Red", 22000.0, "DEF456");
        cars[3] = new Car("Ford", "Mustang", 2023, "Black", 35000.0, "GHI789");
        cars[4] = new Car("Chevrolet", "Cruze", 2020, "Silver", 18000.0, "JKL012");
        cars[5] = new Car("Nissan", "Altima", 2022, "White", 24000.0, "MNO345");
        

        System.out.println("a) Усі машини марки Тойота: ");

        for (Car car : cars) {
            if (car.brand.equals("Toyota")) {
                System.out.println(car);
            }
        }


        System.out.println("b) Машини, що експлуатуються більше 1 року:");

        for (Car car : cars) {
            if (2023 - car.year > 1) {
                System.out.println(car);
            }
        }

        System.out.println("c) Машини, 2022 року випуску, що коштують більше 24000:");

        for (Car car : cars) {
            if (car.price > 24000 && car.year == 2022) {
                System.out.println(car);
            }
        }
    }
}
