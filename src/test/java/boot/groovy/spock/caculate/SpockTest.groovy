package boot.groovy.spock.caculate

import spock.lang.Specification

import java.math.RoundingMode

class SpockTest extends Specification {

    def "Verify that the decimal point of the amount is deleted"() {

        given:
        RoundingMode deleteDecimal = RoundingMode.DOWN;

        when:
        def calculate = CalculateTest.calculate(10000L, 0.1f, deleteDecimal)

        then:
        calculate == 10L
    }
}
