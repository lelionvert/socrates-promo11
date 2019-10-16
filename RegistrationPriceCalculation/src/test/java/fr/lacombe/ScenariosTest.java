package fr.lacombe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScenariosTest {

    @Test
    public void scenario_complete_price_victoria_triple_choice_arrives_thursday_and_leaves_sunday() {
        // Given
        CheckIn victoriaCheckIn = new CheckIn("2019-10-17 21:00");
        CheckOut victoriaCheckOut = new CheckOut("2019-10-20 15:00");
        Participant victoria = new Participant("Victoria", victoriaCheckIn, victoriaCheckOut, Choice.TRIPLE);

        // When
        int totalAmount = victoria.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(410);
    }

    @Test
    public void scenario_complete_price_jp_no_accomodation_choice_arrives_thursday_and_leaves_sunday() {
        // Given
        CheckIn jpCheckIn = new CheckIn("2019-10-17 18:00");
        CheckOut jpCheckOut = new CheckOut("2019-10-20 14:00");
        Participant jp = new Participant("J-P", jpCheckIn, jpCheckOut, Choice.NO_ACCOMMODATION);

        // When
        int totalAmount = jp.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(240);
    }

    @Test
    public void scenario_complete_price_sarah_twin_choice_arrives_thursday_and_leaves_sunday() {
        // Given
        CheckIn sarahCheckIn = new CheckIn("2019-10-17 22:00");
        CheckOut sarahCheckOut = new CheckOut("2019-10-20 14:30");
        Participant sarah = new Participant("Sarah", sarahCheckIn, sarahCheckOut, Choice.TWIN);

        // When
        int totalAmount = sarah.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(510);
    }

    @Test
    public void scenario_price_minus_one_meal_michel_twin_choice_arrives_friday_and_leaves_sunday() {
        // Given
        CheckIn michelCheckIn = new CheckIn("2019-10-18 08:00");
        CheckOut michelCheckOut = new CheckOut("2019-10-20 14:30");
        Participant michel = new Participant("Michel", michelCheckIn, michelCheckOut, Choice.TWIN);

        // When
        int totalAmount = michel.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(470);
    }

    @Test
    public void scenario_price_minus_one_meal_loghan_single_choice_arrives_thursday_and_leaves_saturday() {
        // Given
        CheckIn loghanCheckIn = new CheckIn("2019-10-17 19:00");
        CheckOut loghanCheckOut = new CheckOut("2019-10-19 20:00");
        Participant loghan = new Participant("Loghan", loghanCheckIn, loghanCheckOut, Choice.SINGLE);

        // When
        int totalAmount = loghan.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(570);
    }

    @Test
    public void scenario_price_minus_two_meals_romane_twin_choice_arrives_friday_and_leaves_saturday() {
        // Given
        CheckIn romaneCheckIn = new CheckIn("2019-10-18 07:00");
        CheckOut romaneCheckOut = new CheckOut("2019-10-19 19:00");
        Participant romane = new Participant("Romane", romaneCheckIn, romaneCheckOut, Choice.TWIN);

        // When
        int totalAmount = romane.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(430);
    }

    @Test
    public void scenario_price_minus_two_meals_paul_triple_choice_arrives_friday_and_leaves_saturday() {
        // Given
        CheckIn paulCheckIn = new CheckIn("2019-10-18 09:00");
        CheckOut paulCheckOut = new CheckOut("2019-10-19 18:00");
        Participant paul = new Participant("Paul", paulCheckIn, paulCheckOut, Choice.TRIPLE);

        // When
        int totalAmount = paul.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(330);
    }

    @Test
    public void scenario_price_minus_two_meals_raphael_twin_choice_arrives_friday_and_leaves_saturday() {
        // Given
        CheckIn raphaelCheckIn = new CheckIn("2020-10-23 08:00");
        CheckOut raphaelCheckOut = new CheckOut("2020-10-24 18:00");
        Participant raphael = new Participant("Raphaël", raphaelCheckIn, raphaelCheckOut, Choice.TWIN);

        // When
        int totalAmount = raphael.calculateTotalAmount();

        // Then
        assertThat(totalAmount).isEqualTo(430);
    }


}
