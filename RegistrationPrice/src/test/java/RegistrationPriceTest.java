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

        CheckedInParticipant victoria = new CheckedInParticipant(checkInDate, checkOutDate,
                ChoiceAccomodation.TRIPLE);

        assertThat(SocratesRegistrationPricer.chargesTotalAmount(victoria)).isEqualTo(410);
    }


    @Test
    public void registration_date_should_return_correct_day_of_week_when_created() {
        RegistrationDate date = new RegistrationDate(DayOfWeek.FRIDAY, 0, 0);

        assertThat(date.getDay()).isEqualTo(DayOfWeek.FRIDAY);
    }

    @Test
    void checked_in_participant_has_correct_choice_when_requested() {
        RegistrationDate date = new RegistrationDate(DayOfWeek.FRIDAY, 0, 0);
        CheckedInParticipant pierre = new CheckedInParticipant(date, date, ChoiceAccomodation.TRIPLE);

        assertThat(pierre.getChoice()).isEqualTo(ChoiceAccomodation.TRIPLE);
    }

    @Test
    void get_price_from_accomodation_choice() {
        assertThat(ChoiceAccomodation.TRIPLE.getPrice()).isEqualTo(410);
    }
}
