package nl.dijkrosoft.spock;

public class TooFewSidesException extends RuntimeException{

    private int numberOfSides;

    public TooFewSidesException(String s, int numberOfSides) {
        super(s);
        this.numberOfSides = numberOfSides;
    }
}
