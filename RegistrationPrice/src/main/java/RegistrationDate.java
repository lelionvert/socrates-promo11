import java.time.DayOfWeek;

public class RegistrationDate {
    private final DayOfWeek dayOfWeek;

    public RegistrationDate(DayOfWeek dayOfWeek, int hour, int minutes) {

        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDay() {
        return dayOfWeek;
    }
}
