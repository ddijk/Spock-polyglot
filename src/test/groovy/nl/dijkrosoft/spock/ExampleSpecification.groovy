package nl.dijkrosoft.spock

import spock.lang.Specification

class ExampleSpecification extends Specification {
    def "should be a simple assertion"() {
        expect:
        1 == 1
    }

    def "test adding"() {
        when:
        def calculator = new JavaCalculator();
        def result = calculator.add(2, 3);
        then:
        result == 5
    }

    def "vierkant"() {
        given:
            def polygon = new Polygon(4)
        when:
            int sides = polygon.numberOfSides
        then:
            sides == 4
    }

    def "invalid vierkant"() {

        when:
            new Polygon((0))
        then:
            thrown(TooFewSidesException)
    }
}
