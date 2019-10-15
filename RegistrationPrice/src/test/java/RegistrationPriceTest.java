import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

class RegistrationPriceTest {
    @Test
    @Disabled
    void validate_scenario_1_victoria() {
        String checkInDateThursday = "2019-10-17 21h00";
        String checkOutDateSunday = "2019-10-20 15h00";

        CheckedInParticipant victoria = CheckedInParticipantBuilder.create(checkInDateThursday, checkOutDateSunday,
                ChoiceAccomodation.TRIPLE);

        assertThat(SocratesRegistrationPricer.chargesTotalAmount(victoria)).isEqualTo(410);
    }

    @Test
    void validate_scenario_1_jp() {
        DayOfWeek checkInDay = DayOfWeek.THURSDAY;
        int checkInHour = 18;
        int checkInMinutes = 0;

        DayOfWeek checkOutDay = DayOfWeek.SUNDAY;
        int checkOutHour = 14;
        int checkOutMinutes = 0;

        RegistrationDate checkInDate = new RegistrationDate(checkInDay, checkInHour, checkInMinutes);
        RegistrationDate checkOutDate = new RegistrationDate(checkOutDay, checkOutHour, checkOutMinutes);

        CheckedInParticipant jp = new CheckedInParticipant(checkInDate, checkOutDate,
                ChoiceAccomodation.NO_ACCOMODATION);

        assertThat(SocratesRegistrationPricer.chargesTotalAmount(jp)).isEqualTo(240);
    }
}
