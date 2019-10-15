package fr.lacombe;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEngine {

    private LocalDateTime date;

    public DateEngine(String date) {
        this.date = parseStringToDate(date);
    }

    public LocalDateTime parseStringToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(date, formatter);
    }

    public DayOfWeek getDay() {
        return date.getDayOfWeek();
    }
}
