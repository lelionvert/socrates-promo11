package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class EvenmentTest
{
    @Test
    public void number_participants_equals_0()
    {
        Evenment theEvent = new Evenment(0);
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(0);
    }

    @Test
    public void number_participants_equals_5()
    {
        Evenment theEvent = new Evenment(5);
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(5);
    }

}
