import java.time.DayOfWeek;

class BookingPriceCalculator {

    static int chargesTotalAmount(Booking booking) {
        return booking.getBasicChoicePrice() - calculateRefundAmount(booking);
    }

    private static int calculateRefundAmount(Booking booking) {
        int reduction = 0;
        if (missOneMeal(booking.getCheckInDay(), booking.getCheckOutDay()))
            reduction = 40;
        return reduction;
    }

    private static boolean missOneMeal(DayOfWeek checkInDay, DayOfWeek checkOutDay) {
        return !checkInDay.equals(DayOfWeek.THURSDAY)
                || !checkOutDay.equals(DayOfWeek.SUNDAY);
    }
}
