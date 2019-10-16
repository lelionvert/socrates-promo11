package fr.lacombe;

import java.time.DayOfWeek;

public class CheckOut {
    private DateEngine departureDate;

    public CheckOut(String departureDate) {
        this.departureDate = new DateEngine(departureDate);
    }

    public boolean departureDayIsSaturday() {
        return DayOfWeek.SATURDAY.equals(departureDate.getDay());
    }
}
