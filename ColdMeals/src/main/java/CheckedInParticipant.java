import java.time.LocalDateTime;

public class CheckedInParticipant {
    private final LocalDateTime checkInDateTime;

    public CheckedInParticipant(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public boolean checkedInAfter(LocalDateTime arrivalDate) {
        return checkInDateTime.isAfter(arrivalDate);
    }
}
