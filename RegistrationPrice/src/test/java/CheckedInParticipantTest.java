import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

class CheckedInParticipantTest {
    @Test
    void get_correct_check_in_date() {
        String checkInFriday = "2019-10-18 8h00";
        String checkOutSunday = "2019-10-20 14h30";

        CheckedInParticipant michel = CheckedInParticipantBuilder.create(checkInFriday, checkOutSunday,
                ChoiceAccomodation.TWIN);

        assertThat(michel.getCheckInDay()).isEqualTo(DayOfWeek.FRIDAY);
    }
}