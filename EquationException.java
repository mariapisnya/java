package cw_hw_10;

/**
 * task 8.1 - exception
 * @author Pisnia Mariia
 */

public class EquationException extends ArithmeticException {
    public String message;

    EquationException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Discriminant is less than zero - equation has no Real roots. " + message;
    }
}
