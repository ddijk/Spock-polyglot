package nl.dijkrosoft.spock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaCalculatorTest {

    @Test
    void testAdd() {

        JavaCalculator javaCalculator = new JavaCalculator();

        assertEquals(7, javaCalculator.add(2,5));
    }
}