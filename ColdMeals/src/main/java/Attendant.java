import java.time.LocalDateTime;

public class Attendant {
    private final LocalDateTime arrivalDateTime;

    public Attendant(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public boolean hasColdMeal() {
        return arrivalDateTime.isAfter(LocalDateTime.of(2019, 10, 17, 21, 0));
    }
}
