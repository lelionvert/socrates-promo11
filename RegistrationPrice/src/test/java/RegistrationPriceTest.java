import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

class RegistrationPriceTest {
    @Test
    void validate_scenario_1_victoria() {
        DayOfWeek checkInDay = DayOfWeek.THURSDAY;
        int checkInHour = 21;
        int checkInMinutes = 0;

        DayOfWeek checkOutDay = DayOfWeek.SUNDAY;
        int checkOutHour = 15;
        int checkOutMinutes = 0;

        RegistrationDate checkInDate = new RegistrationDate(checkInDay, checkInHour, checkInMinutes);
        RegistrationDate checkOutDate = new RegistrationDate(checkOutDay, checkOutHour, checkOutMinutes);

        CheckedInParticipant victoria = new CheckedInParticipant(checkInDate, checkOutDate,
                ChoiceAccomodation.TRIPLE);

        assertThat(SocratesRegistrationPricer.chargesTotalAmount(victoria)).isEqualTo(410);
    }
}
