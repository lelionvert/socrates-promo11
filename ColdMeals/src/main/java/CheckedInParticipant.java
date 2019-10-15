import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckedInParticipant {
    private final LocalDateTime checkInDateTime;
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH'h'mm");

    public CheckedInParticipant(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public CheckedInParticipant(String stringDateTime) {
        checkInDateTime = LocalDateTime.parse(stringDateTime, DATE_TIME_FORMATTER);
    }

    public boolean checkedInAfter(LocalDateTime arrivalDate) {
        return checkInDateTime.isAfter(arrivalDate);
    }

    public LocalDateTime getCheckInDateTime() {
        return checkInDateTime;
    }
}
