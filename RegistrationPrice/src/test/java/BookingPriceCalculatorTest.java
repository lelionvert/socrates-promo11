import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BookingPriceCalculatorTest {
    @Test
    void miss_one_meal_should_return_true_when_checkin_is_friday() {
        String checkInDateFriday = "2019-10-18 07h00";
        String checkOutDateSunday = "2019-10-20 19h00";

        Booking booking = BookingHelper.create(checkInDateFriday,
                checkOutDateSunday,
                ChoiceAccommodation.TWIN);

        assertThat(BookingPriceCalculator.missOneMeal(booking.getCheckInDay(), booking.getCheckOutDay()))
                .isTrue();
    }

    @Test
    void miss_one_meal_should_return_true_when_checkout_is_saturday() {
        String checkInDateThursday = "2019-10-17 07h00";
        String checkOutDateSaturday = "2019-10-19 19h00";

        Booking booking = BookingHelper.create(checkInDateThursday,
                checkOutDateSaturday,
                ChoiceAccommodation.TWIN);

        assertThat(BookingPriceCalculator.missOneMeal(booking.getCheckInDay(), booking.getCheckOutDay()))
                .isTrue();
    }

    @Test
    void miss_one_meal_should_return_false() {
        String checkInDateThursday = "2019-10-17 07h00";
        String checkOutDateSunday = "2019-10-20 19h00";

        Booking booking = BookingHelper.create(checkInDateThursday,
                checkOutDateSunday,
                ChoiceAccommodation.TWIN);

        assertThat(BookingPriceCalculator.missOneMeal(booking.getCheckInDay(), booking.getCheckOutDay()))
                .isFalse();
    }

    @Test
    void calculate_refund_amount_should_return_80_when_checkin_friday_and_checkout_saturday() {
        String checkInDateFriday = "2019-10-18 07h00";
        String checkOutDateSaturday = "2019-10-19 19h00";

        Booking booking = BookingHelper.create(checkInDateFriday,
                checkOutDateSaturday,
                ChoiceAccommodation.TWIN);

        assertThat(BookingPriceCalculator.calculateRefundAmount(booking))
                .isEqualTo(80);
    }


}