import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

class BookingTest {
    @Test
    void get_correct_check_in_date() {
        String checkInFriday = "2019-10-18 08h00";
        String checkOutSunday = "2019-10-20 14h30";

        Booking michel = BookingHelper.create(checkInFriday, checkOutSunday,
                ChoiceAccommodation.TWIN);

        assertThat(michel.getCheckInDay()).isEqualTo(DayOfWeek.FRIDAY);
    }

    @Test
    void get_correct_check_in_date_thursday() {
        String checkInThursday = "2019-10-17 08h00";
        String checkOutSunday = "2019-10-20 14h30";

        Booking michel = BookingHelper.create(checkInThursday, checkOutSunday,
                ChoiceAccommodation.TWIN);

        assertThat(michel.getCheckInDay()).isEqualTo(DayOfWeek.THURSDAY);
    }

    @Test
    void get_correct_check_out_date_sunday() {
        String checkInThursday = "2019-10-17 08h00";
        String checkOutSunday = "2019-10-20 14h30";

        Booking michel = BookingHelper.create(checkInThursday, checkOutSunday,
                ChoiceAccommodation.TWIN);

        assertThat(michel.getCheckOutDay()).isEqualTo(DayOfWeek.SUNDAY);
    }
}