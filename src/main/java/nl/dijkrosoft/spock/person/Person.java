package nl.dijkrosoft.spock.person;

public class Person {

    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static Person create(String name, int age, String city) {
        return new Person(name, age, city);
    }
}
