import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RegistrationPriceTest {
    @Test
    void validate_scenario_1_victoria() {
        String checkInDateThursday = "2019-10-17 21h00";
        String checkOutDateSunday = "2019-10-20 15h00";

        CheckedInParticipant victoria = CheckedInParticipantBuilder.create(checkInDateThursday, checkOutDateSunday,
                ChoiceAccommodation.TRIPLE);

        assertThat(SocratesRegistrationPricer.chargesTotalAmount(victoria)).isEqualTo(410);
    }

    @Test
    void validate_scenario_1_jp() {
        String checkInDateThursday = "2019-10-17 18h00";
        String checkOutDateSunday = "2019-10-20 14h00";

        CheckedInParticipant jp = CheckedInParticipantBuilder.create(checkInDateThursday, checkOutDateSunday,
                ChoiceAccommodation.NO_ACCOMMODATION);

        assertThat(SocratesRegistrationPricer.chargesTotalAmount(jp)).isEqualTo(240);
    }

    @Test
    void validate_scenario_2_Michel() {
        String checkInDateFriday = "2019-10-18 08h00";
        String checkOutDateSunday = "2019-10-20 14h30";

        CheckedInParticipant michel = CheckedInParticipantBuilder.create(checkInDateFriday, checkOutDateSunday,
                ChoiceAccommodation.TWIN);

        assertThat(SocratesRegistrationPricer.chargesTotalAmount(michel)).isEqualTo(470);
    }

    @Test
    void validate_scenario_2_loghan() {
        String checkInDateThursday = "2019-10-17 19h00";
        String checkOutDateSaturday = "2019-10-19 20h00";

        CheckedInParticipant loghan = CheckedInParticipantBuilder.create(checkInDateThursday, checkOutDateSaturday,
                ChoiceAccommodation.SINGLE);
        assertThat(SocratesRegistrationPricer.chargesTotalAmount(loghan)).isEqualTo(570);
    }
}
