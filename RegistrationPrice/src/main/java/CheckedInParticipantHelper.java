import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class CheckedInParticipantHelper {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH'h'mm");

    static CheckedInParticipant create(String checkInDateThursday, String checkOutDateSunday, ChoiceAccommodation triple) {
        LocalDateTime checkInDateTime = createDateFromFormat(checkInDateThursday);
        LocalDateTime checkOutDateTime = createDateFromFormat(checkOutDateSunday);

        return new CheckedInParticipant(checkInDateTime, checkOutDateTime, triple);
    }

    private static LocalDateTime createDateFromFormat(String dateFormat) {
        LocalDateTime checkInDateTime;
        try {
            checkInDateTime = LocalDateTime.parse(dateFormat, DATE_TIME_FORMATTER);
        } catch (DateTimeParseException e) {
            checkInDateTime = null;
        }
        return checkInDateTime;
    }
}
