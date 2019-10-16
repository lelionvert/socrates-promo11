import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RegistrationPriceTest {
    @Test
    void validate_scenario_1_victoria() {
        String checkInDateThursday = "2019-10-17 21h00";
        String checkOutDateSunday = "2019-10-20 15h00";

        Booking victoria = BookingHelper.create(checkInDateThursday, checkOutDateSunday,
                ChoiceAccommodation.TRIPLE);

        assertThat(BookingPriceCalculator.chargesTotalAmount(victoria)).isEqualTo(410);
    }

    @Test
    void validate_scenario_1_jp() {
        String checkInDateThursday = "2019-10-17 18h00";
        String checkOutDateSunday = "2019-10-20 14h00";

        Booking jp = BookingHelper.create(checkInDateThursday, checkOutDateSunday,
                ChoiceAccommodation.NO_ACCOMMODATION);

        assertThat(BookingPriceCalculator.chargesTotalAmount(jp)).isEqualTo(240);
    }

    @Test
    void validate_scenario_1_sarah() {
        String checkInDateThursday = "2019-10-17 22h00";
        String checkOutDateSunday = "2019-10-20 14h30";

        Booking sarah = BookingHelper.create(checkInDateThursday, checkOutDateSunday,
                ChoiceAccommodation.TWIN);

        assertThat(BookingPriceCalculator.chargesTotalAmount(sarah)).isEqualTo(510);
    }

    @Test
    void validate_scenario_2_Michel() {
        String checkInDateFriday = "2019-10-18 08h00";
        String checkOutDateSunday = "2019-10-20 14h30";

        Booking michel = BookingHelper.create(checkInDateFriday, checkOutDateSunday,
                ChoiceAccommodation.TWIN);

        assertThat(BookingPriceCalculator.chargesTotalAmount(michel)).isEqualTo(470);
    }

    @Test
    void validate_scenario_2_loghan() {
        String checkInDateThursday = "2019-10-17 19h00";
        String checkOutDateSaturday = "2019-10-19 20h00";

        Booking loghan = BookingHelper.create(checkInDateThursday,
                checkOutDateSaturday,
                ChoiceAccommodation.SINGLE);
        assertThat(BookingPriceCalculator.chargesTotalAmount(loghan)).isEqualTo(570);
    }

    @Test
    void validate_scenario_3_romane() {
        String checkInDateFriday = "2019-10-18 07h00";
        String checkOutDateSaturday = "2019-10-19 19h00";

        Booking romane = BookingHelper.create(checkInDateFriday,
                checkOutDateSaturday,
                ChoiceAccommodation.TWIN);
        assertThat(BookingPriceCalculator.chargesTotalAmount(romane)).isEqualTo(430);
    }

    @Test
    void validate_scenario_3_paul() {
        String checkInDateFriday = "2019-10-18 09h00";
        String checkOutDateSaturday = "2019-10-19 18h00";

        Booking paul = BookingHelper.create(checkInDateFriday,
                checkOutDateSaturday,
                ChoiceAccommodation.TRIPLE);
        assertThat(BookingPriceCalculator.chargesTotalAmount(paul)).isEqualTo(330);
    }
}
