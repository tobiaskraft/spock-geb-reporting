package de.sgr;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.Assert.assertEquals;

    public class SpeakerAssignmentTest {
        @Test
        public void assign2SpeakersToTalk() {
            Talk t = new Talk("Spock", "description");
            t.assignSpeaker(new Speaker("Ralf","Müller"));
            t.assignSpeaker(new Speaker("Tobias","Kraft"));
            assertEquals(t.getSpeaker().size(), 2);
            List list = t.getSpeaker().stream()
                    .map(Speaker::getFirstname).collect(Collectors.toList());
            assertEquals(list, Arrays.asList("Ralf", "Tobias"));
        }
    }
