package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        Evenment theEvent = new Evenment();
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(0);
    }



}
