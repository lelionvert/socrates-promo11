package fr.lacombe;

import java.time.DayOfWeek;

public class CheckIn {
    private DateEngine arrivalDate;

    public CheckIn(String arrivalDate) {
        this.arrivalDate = new DateEngine(arrivalDate);
    }

    public boolean arrivalDayIsFriday() {
        return DayOfWeek.FRIDAY.equals(arrivalDate.getDay());
    }
}
