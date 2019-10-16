package fr.lacombe;

import org.junit.Ignore;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ScenariosTest
{

    @Test
    public void scenario_complete_price_victoria_triple_choice_arrives_thursday_and_leaves_sunday()
    {
        // Given
        CheckIn victoriaCheckIn = new CheckIn("Thursday", "21h");
        CheckOut victoriaCheckOut = new CheckOut("Sunday", "15h");
        Participant victoria = new Participant("Victoria", victoriaCheckIn, victoriaCheckOut, Choice.TRIPLE);

        // When
        int totalAmount = victoria.getTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(410);
    }

    @Test
    public void scenario_complete_price_jp_no_accomodation_choice_arrives_thursday_and_leaves_sunday()
    {
        // Given
        CheckIn jpCheckIn = new CheckIn("Thursday", "18h");
        CheckOut jpCheckOut = new CheckOut("Sunday", "14h");
        Participant jp = new Participant("J-P", jpCheckIn, jpCheckOut, Choice.NO_ACCOMMODATION);

        // When
        int totalAmount = jp.getTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(240);
    }

    @Test
    public void scenario_complete_price_sarah_twin_choice_arrives_thursday_and_leaves_sunday()
    {
        // Given
        CheckIn sarahCheckIn = new CheckIn("Thursday", "22h");
        CheckOut sarahCheckOut = new CheckOut("Sunday", "14h30");
        Participant sarah = new Participant("Sarah", sarahCheckIn, sarahCheckOut, Choice.TWIN);

        // When
        int totalAmount = sarah.getTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(510);
    }


}
