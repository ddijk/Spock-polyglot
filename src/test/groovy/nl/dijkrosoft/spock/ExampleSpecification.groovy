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
}
