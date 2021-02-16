package kg.megacom;

public class NegativeValueException extends Exception {
    public NegativeValueException() {
    }

    public NegativeValueException(String message) {
        super(message);
    }

    public void printMessage() {
        System.out.println("Number can not be less than 0");
    }
}
