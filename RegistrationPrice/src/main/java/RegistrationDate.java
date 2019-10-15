import java.time.DayOfWeek;

class RegistrationDate {
    private final DayOfWeek dayOfWeek;

    RegistrationDate(DayOfWeek dayOfWeek, int hour, int minutes) {
        this.dayOfWeek = dayOfWeek;
    }

    DayOfWeek getDay() {
        return dayOfWeek;
    }
}
