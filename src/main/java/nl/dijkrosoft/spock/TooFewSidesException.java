package nl.dijkrosoft.spock;

public class TooFewSidesException extends RuntimeException{

    public TooFewSidesException(String s, int numberOfSides) {
        super(s);
    }
}
