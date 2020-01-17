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

    def "Verify that the decimal point of the various amounts are deleted"() {

        given:
        RoundingMode deleteDecimal = RoundingMode.DOWN;

        expect:
        CalculateTest.calculate(amount, rate, deleteDecimal) == result

        where:
        amount | rate  | result
        10000L | 0.1f  | 10L
        2799L  | 0.2f  | 5L
        159L   | 0.15f | 0L
        2299L  | 0.15f | 3L
    }
}
