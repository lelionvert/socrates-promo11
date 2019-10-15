import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationPriceTest {
    @Test
    @Disabled
    public void validate_scenario_1() {
        DayOfWeek checkInDay = DayOfWeek.THURSDAY;
        int checkInHour = 21;
        int checkInMinutes = 0;

        DayOfWeek checkOutDay = DayOfWeek.SUNDAY;
        int checkOutHour = 15;
        int checkOutMinutes = 0;

        RegistrationDate checkInDate = new RegistrationDate(checkInDay, checkInHour, checkInMinutes);
        RegistrationDate checkOutDate = new RegistrationDate(checkOutDay, checkOutHour, checkOutMinutes);

        String choice = "TRIPLE";

        CheckedInParticipant victoria = new CheckedInParticipant(checkInDate, checkOutDate, choice);

        assertThat(SocratesRegistrationPricer.chargesTotalAmount(victoria)).isEqualTo(410);
    }


    @Test
    public void registration_date_should_return_correct_day_of_week_when_created() {
        RegistrationDate date = new RegistrationDate(DayOfWeek.FRIDAY, 0, 0);

        assertThat(date.getDay()).isEqualTo(DayOfWeek.FRIDAY);
    }
}
