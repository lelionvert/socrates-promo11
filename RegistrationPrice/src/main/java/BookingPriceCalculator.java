import java.time.DayOfWeek;

class BookingPriceCalculator {

    static int chargesTotalAmount(Booking booking) {
        return booking.getBasicChoicePrice() - calculateRefundAmount(booking);
    }

    static int calculateRefundAmount(Booking booking) {
        int reduction = 0;
        if (!booking.getCheckInDay().equals(DayOfWeek.THURSDAY)
                && !booking.getCheckOutDay().equals(DayOfWeek.SUNDAY))
            reduction = 80;
        else if (missOneMeal(booking.getCheckInDay(), booking.getCheckOutDay()))
            reduction = 40;
        return reduction;
    }

    static boolean missOneMeal(DayOfWeek checkInDay, DayOfWeek checkOutDay) {
        return !checkInDay.equals(DayOfWeek.THURSDAY)
                || !checkOutDay.equals(DayOfWeek.SUNDAY);
    }
}
