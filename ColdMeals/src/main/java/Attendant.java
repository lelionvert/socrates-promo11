import java.time.LocalDateTime;
import java.util.List;

public class Attendant {
    private final LocalDateTime arrivalDateTime;

    public Attendant(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public boolean arrivedAfter(LocalDateTime arrivalDate) {
        return arrivalDateTime.isAfter(arrivalDate);
    }
}
