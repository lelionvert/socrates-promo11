package fr.lacombe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScenariosTest {

    @Test
    public void scenario_complete_price_victoria_triple_choice_arrives_thursday_and_leaves_sunday() {
        // Given
        CheckIn victoriaCheckIn = new CheckIn("Thursday", "21h");
        CheckOut victoriaCheckOut = new CheckOut("Sunday", "15h");
        Participant victoria = new Participant("Victoria", victoriaCheckIn, victoriaCheckOut, Choice.TRIPLE);

        // When
        int totalAmount = victoria.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(410);
    }

    @Test
    public void scenario_complete_price_jp_no_accomodation_choice_arrives_thursday_and_leaves_sunday() {
        // Given
        CheckIn jpCheckIn = new CheckIn("Thursday", "18h");
        CheckOut jpCheckOut = new CheckOut("Sunday", "14h");
        Participant jp = new Participant("J-P", jpCheckIn, jpCheckOut, Choice.NO_ACCOMMODATION);

        // When
        int totalAmount = jp.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(240);
    }

    @Test
    public void scenario_complete_price_sarah_twin_choice_arrives_thursday_and_leaves_sunday() {
        // Given
        CheckIn sarahCheckIn = new CheckIn("Thursday", "22h");
        CheckOut sarahCheckOut = new CheckOut("Sunday", "14h30");
        Participant sarah = new Participant("Sarah", sarahCheckIn, sarahCheckOut, Choice.TWIN);

        // When
        int totalAmount = sarah.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(510);
    }

    @Test
    public void scenario_price_minus_one_meal_michel_twin_choice_arrives_friday_and_leaves_sunday() {
        // Given
        CheckIn michelCheckIn = new CheckIn("Friday", "8h");
        CheckOut michelCheckOut = new CheckOut("Sunday", "14h30");
        Participant michel = new Participant("Michel", michelCheckIn, michelCheckOut, Choice.TWIN);

        // When
        int totalAmount = michel.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(470);
    }


}
