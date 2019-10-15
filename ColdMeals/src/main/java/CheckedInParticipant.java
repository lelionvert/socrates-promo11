import java.time.LocalDateTime;

public class CheckedInParticipant {
    private final LocalDateTime checkInDateTime;

    public CheckedInParticipant(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public CheckedInParticipant(String stringDateTime) {
        checkInDateTime = LocalDateTime.of(2019,10,17,21,5);
    }

    public boolean checkedInAfter(LocalDateTime arrivalDate) {
        return checkInDateTime.isAfter(arrivalDate);
    }

    public LocalDateTime getCheckInDateTime() {
        return checkInDateTime;
    }
}
