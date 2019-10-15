package fr.lacombe;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckIn {
    private LocalDateTime arrivalDate;

    public CheckIn(String arrivalDate) {
        this.arrivalDate = parseStringToDate(arrivalDate);
    }

    public LocalDateTime parseStringToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(date, formatter);
    }

    public DayOfWeek getDay() {
        return arrivalDate.getDayOfWeek();
    }
}
