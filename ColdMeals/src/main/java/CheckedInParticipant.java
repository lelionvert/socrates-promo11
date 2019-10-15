import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckedInParticipant {
    private final LocalDateTime checkInDateTime;

    public CheckedInParticipant(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public CheckedInParticipant(String stringDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH'h'mm");
        checkInDateTime = LocalDateTime.parse(stringDateTime, dateTimeFormatter);
    }

    public boolean checkedInAfter(LocalDateTime arrivalDate) {
        return checkInDateTime.isAfter(arrivalDate);
    }

    public LocalDateTime getCheckInDateTime() {
        return checkInDateTime;
    }
}
