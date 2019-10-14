package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class EvenmentTest
{
    @Test
    public void number_participants_equals_0()
    {
        // Given
        Evenment theEvent = new Evenment(new ArrayList<String>());

        // When / Then
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(0);
    }

    @Test
    public void number_participants_equals_5()
    {
        // Given
        List<String> listParticipants = new ArrayList<String>();
        listParticipants.add("08");
        listParticipants.add("09");
        listParticipants.add("10");
        listParticipants.add("11");
        listParticipants.add("00");

        Evenment theEvent = new Evenment(listParticipants);

        // When / Then
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(5);
    }

}
