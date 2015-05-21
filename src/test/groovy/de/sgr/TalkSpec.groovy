package de.sgr

import spock.lang.Specification
import spock.lang.Unroll
import org.apache.commons.lang3.RandomStringUtils

class TalkSpec extends Specification {
  @Unroll
  def "Verify talk with title '#title'"() {
    when:
      def description = RandomStringUtils.randomAlphabetic(descLength)
      Talk t = new Talk(title, description, keywords)

    then: 'check cutting of description'
      t.getDescriptionShort().length() == Math.min(descLength, 120)

    and: 'keywords are present in talk text'
      t.validateKeywords()

    where:
      title                    | descLength | keywords
      "Geb and Spock are cool" | 170        | ['Spock','Geb']
      "Geb is cool"            | 119        | ['Geb']
      "JUnit versus Spock"     | 3000       | ['JUnit','Spock','Geb']
      "Spock is cool"          | 120        | ['Spock']
  }
}









