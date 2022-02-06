package nl.dijkrosoft.spock

class AnotherSpecification extends MySuperGroovy {

    def "test 1"() {
        expect:
        1 == 1
    }

    def test2() {
        expect:
        1 ==1
    }

    def test3() {
        assert 1 == 1
    }

    def "test shared proxy"() {

        expect:
           proxy.connect() != null
    }
}