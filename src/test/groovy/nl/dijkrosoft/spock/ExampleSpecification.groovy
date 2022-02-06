package nl.dijkrosoft.spock

import spock.lang.Specification
import spock.lang.Subject

class ExampleSpecification extends Specification {
    def "should be a simple assertion"() {
        expect:
        1 == 1
    }

    def "test adding #num1 #num2 #res"() {
        when:
        def calculator = new JavaCalculator();
        def result = calculator.add(num1, num2);
        then:
        result == res

        where:
        num1 | num2 | res
        2    | 3    | 5
        1    | 2    | 3

    }

    def "test increment #val"() {
        when:

             def res = JavaCalculator.inc(val)
        then:
              res == val + 1
        where:
             val << [1,3,5]
    }

    def "vierkant"() {
        given:
            def polygon = new Polygon(4, null)
        when:
            int sides = polygon.numberOfSides
        then:
            sides == 4
    }

    def "invalid vierkant"() {

        when:
        new Polygon(0,null)
        then:
        def exception = thrown(TooFewSidesException)
        exception.numberOfSides == 0
    }

    def "test calls to Renderer"() {
        given:
            Renderer renderer = Mock()
            @Subject
            Polygon polygon = new Polygon(4, renderer)
        when:
            polygon.draw()
        then:
            4 * renderer.drawline()


    }
}
