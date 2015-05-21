package de.sgr

import spock.lang.Specification

class SimpleMathSpec extends Specification {
    def "Mathematik einfach gemacht"() {
        expect:
            1 + 3 == 4
            7 == 2 + 5
        and:
            4 + 5 == 9
        when:
            true
        then:
            1 + 3 == 4
            6 == 2 * 3
        and:
            3 * 2 == 6
        expect:
            1 + 3 == 4
            6 == 2 * 3
    }
}