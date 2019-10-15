import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CheckedInParticipantBuilder {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH'h'mm");
    public static CheckedInParticipant create(String dateFormat) {
        LocalDateTime checkInDateTime;
        try {
            checkInDateTime = LocalDateTime.parse(dateFormat, DATE_TIME_FORMATTER);
        } catch (DateTimeParseException e) {
            checkInDateTime = null;
        }
        return new CheckedInParticipant(checkInDateTime);
    }
}
