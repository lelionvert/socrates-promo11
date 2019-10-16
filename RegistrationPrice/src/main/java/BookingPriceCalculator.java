import java.time.DayOfWeek;

class BookingPriceCalculator {

    static int chargesTotalAmount(Booking booking) {
        return booking.getBasicChoicePrice() -
                calculateRefundAmount(booking.getCheckInDay(), booking.getCheckOutDay());
    }

    static int calculateRefundAmount(DayOfWeek checkInDay, DayOfWeek checkOutDay) {
        int reduction = 0;
        if (missTwoMeals(checkInDay, checkOutDay)) {
            reduction = 80;
        } else if (missOneMeal(checkInDay, checkOutDay)) {
            reduction = 40;
        }
        return reduction;
    }

    private static boolean missTwoMeals(DayOfWeek checkInDay, DayOfWeek checkOutDay) {
        return !checkInDay.equals(DayOfWeek.THURSDAY)
                && !checkOutDay.equals(DayOfWeek.SUNDAY);
    }

    static boolean missOneMeal(DayOfWeek checkInDay, DayOfWeek checkOutDay) {
        return !checkInDay.equals(DayOfWeek.THURSDAY)
                || !checkOutDay.equals(DayOfWeek.SUNDAY);
    }
}
