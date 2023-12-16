package cw_hw_10;

/**
 * task 6.13 - exception
 * @author Pisnia Mariia
 */

public class InvalidCoffeeDataException extends Exception {
    public InvalidCoffeeDataException(String message) {
        super(message);
    }
}