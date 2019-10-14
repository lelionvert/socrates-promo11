import java.time.LocalDateTime;

public class Participant {
    private final LocalDateTime checkInDateTime;

    public Participant(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public boolean arrivedAfter(LocalDateTime arrivalDate) {
        return checkInDateTime.isAfter(arrivalDate);
    }
}
