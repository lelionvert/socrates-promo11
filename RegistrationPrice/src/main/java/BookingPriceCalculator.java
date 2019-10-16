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

    private static boolean missThursdayMeal(DayOfWeek checkInDay) {
        return !checkInDay.equals(DayOfWeek.THURSDAY);
    }

    private static boolean missSundayMeal(DayOfWeek checkOutDay) {
        return !checkOutDay.equals(DayOfWeek.SUNDAY);
    }

    private static boolean missTwoMeals(DayOfWeek checkInDay, DayOfWeek checkOutDay) {
        return missThursdayMeal(checkInDay)
                && missSundayMeal(checkOutDay);
    }

    static boolean missOneMeal(DayOfWeek checkInDay, DayOfWeek checkOutDay) {
        return missThursdayMeal(checkInDay)
                || missSundayMeal(checkOutDay);
    }
}
