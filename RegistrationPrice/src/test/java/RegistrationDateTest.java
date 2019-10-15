import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

class RegistrationDateTest {
    @Test
    void registration_date_should_return_correct_day_of_week_when_created_on_friday() {
        RegistrationDate date = new RegistrationDate(DayOfWeek.FRIDAY, 0, 0);

        Assertions.assertThat(date.getDay()).isEqualTo(DayOfWeek.FRIDAY);
    }

    @Test
    void registration_date_should_return_correct_day_of_week_when_created_on_saturday() {
        RegistrationDate date = new RegistrationDate(DayOfWeek.SATURDAY, 0, 0);

        Assertions.assertThat(date.getDay()).isEqualTo(DayOfWeek.SATURDAY);
    }
}