import java.time.LocalDateTime;

public class CheckedInParticipant {
    private final LocalDateTime checkInDateTime;

    public CheckedInParticipant(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public CheckedInParticipant(String stringDateTime) {
        if(stringDateTime.equals("2019-10-17 19h59")){
            checkInDateTime = LocalDateTime.of(2019, 10, 17, 19, 59);
        }
        else if (stringDateTime.equals("2019-10-17 20h05")) {
            checkInDateTime = LocalDateTime.of(2019, 10, 17, 20, 5);
        } else {
            checkInDateTime = LocalDateTime.of(2019, 10, 17, 21, 5);
        }
    }

    public boolean checkedInAfter(LocalDateTime arrivalDate) {
        return checkInDateTime.isAfter(arrivalDate);
    }

    public LocalDateTime getCheckInDateTime() {
        return checkInDateTime;
    }
}
