import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CheckedInParticipant {
    private LocalDateTime checkInDateTime;
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH'h'mm");

    public CheckedInParticipant(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public CheckedInParticipant(String stringDateTime) {
        try {
            checkInDateTime = LocalDateTime.parse(stringDateTime, DATE_TIME_FORMATTER);
        } catch (DateTimeParseException e) {
            checkInDateTime = null;
        }
    }

    public boolean checkedInAfter(LocalDateTime arrivalDate) {
        return checkInDateTime.isAfter(arrivalDate);
    }

    public LocalDateTime getCheckInDateTime() {
        return checkInDateTime;
    }
}
