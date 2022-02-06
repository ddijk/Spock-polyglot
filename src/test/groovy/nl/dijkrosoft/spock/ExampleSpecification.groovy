package nl.dijkrosoft.spock

import nl.dijkrosoft.spock.person.Person

class ExampleSpecification extends MySuperGroovy {



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

    def "test calls to Renderer #sides, each side is drawn separately"() {
        given:
            Renderer renderer = Mock()
            Polygon polygon = new Polygon(sides, renderer)
        when:
            polygon.draw()
        then:
            sides * renderer.drawline()

        where:
           sides << [3,4,5]

    }

    def "test stub"() {

        given:
            Palette palette = Stub()
            palette.getPrimaryColor() >> "red"
            Renderer renderer = new Renderer(palette)
        when:
            def primaryColor =  renderer.getPrimaryColor();
        then:
            primaryColor == "red"
    }

    def "test 'with' syntax"() {
        when:
            def person = Person.create("jaap", 20, "utrecht")
        then:
             verifyAll(person) {
                 name == "jaap"
                 age== 20
                 city == "utrecht"
             }
    }

    def "test shared proxy"() {

        expect: "connect using proxy"
            proxy.connect() != null
            proxy.connect() != null
    }

    def "test shared proxy 2"() {

        expect: "connect using proxy"
        proxy.connect() != null
        proxy.connect() != null
    }
}
