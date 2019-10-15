import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

class ChoiceAccomodationTest {
    @Test
    void checked_in_participant_has_correct_choice_when_requested() {
        RegistrationDate date = new RegistrationDate(DayOfWeek.FRIDAY, 0, 0);
        CheckedInParticipant pierre = new CheckedInParticipant(date, date, ChoiceAccomodation.TRIPLE);

        Assertions.assertThat(pierre.getChoice()).isEqualTo(ChoiceAccomodation.TRIPLE);
    }

    @Test
    void get_price_from_accomodation_choice_TRIPLE() {
        Assertions.assertThat(ChoiceAccomodation.TRIPLE.getPrice()).isEqualTo(410);
    }
}