package de.sgr

import spock.lang.Specification

    class SpeakerAssignmentSpec extends Specification {
        def "assign 2 speakers to talk"() {
            given:
                Talk t = new Talk("Spock", "description")
            when:
                t.assignSpeaker(new Speaker("Ralf","Müller"))
                t.assignSpeaker(new Speaker("Tobias","Kraft"))
            then:
                t.getSpeaker().size() == 2
                t.getSpeaker()*.firstname == ["Ralf", "Tobias"]
        }
    }