import java.time.DayOfWeek;

class BookingPriceCalculator {

    private static final int MEAL_PRICE = 40;

    static int chargesTotalAmount(Booking booking) {
        int refundAmount = calculateRefundAmount(booking.getCheckInDay(), booking.getCheckOutDay());
        if (booking.getChoice() == ChoiceAccommodation.SINGLE_DOUBLE) {
            refundAmount = calculateRefundAmount();
        }
        return booking.getBasicChoicePrice() -
                refundAmount;
    }

    static int calculateRefundAmount() {
        return 2 * MEAL_PRICE;
    }

    static int calculateRefundAmount(DayOfWeek checkInDay, DayOfWeek checkOutDay) {
        int reduction = 0;
        if (missTwoMeals(checkInDay, checkOutDay)) {
            reduction = 2 * MEAL_PRICE;
        } else if (missOneMeal(checkInDay, checkOutDay)) {
            reduction = MEAL_PRICE;
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
