package de.sgr

import spock.lang.Specification

class TalkControllerSpec extends Specification {

    def "accept talks"() {
      given:
        TalkService talkService = Mock()
        TalkController contr = new TalkController(talkService: talkService)
        def titles = ['Geb/Spock are hot','Spock is hot','Geb is hot','JUnit']

      when:
        contr.bulkAccept(titles)

      then:
        2 * talkService.accept({String title -> title =~ 'Geb'})
        1 * talkService.accept({String title -> title == 'Spock is hot'})
        (1.._) * talkService.accept(_ as String)
    }

}