package nl.dijkrosoft.spock.shared;

public class Proxy {

    public Proxy() {
        System.out.println("** Proxy created");
    }

    public Connection connect() {
        System.out.println("** Connection created");
        return new Connection();
    }
}
