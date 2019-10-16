import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class BookingHelperTest {

    @Test
    void create_should_have_correct_data_when_building_checked_in_participant() {
        Booking expectedParticipant = new Booking(LocalDateTime.of(2019, 4, 21, 14, 54),
                LocalDateTime.of(2019, 4, 25, 10, 0), ChoiceAccommodation.TRIPLE);

        Booking resultBooking = BookingHelper.create("2019-04-21 14h54",
                "2019-04-25 10h00", ChoiceAccommodation.TRIPLE);

        assertThat(resultBooking).isEqualTo(expectedParticipant);

    }

    @Test
    void build_checked_in_participant_with_null_check_in_time_when_wrong_format_string_given() {
        Booking booking = BookingHelper.create("2019-04-17 14h15", "2019-04-17-14-15",
                ChoiceAccommodation.TRIPLE);
        Assertions.assertThat(booking.getCheckOutDateTime()).isNull();
    }
}