import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Objects;

public class CheckedInParticipant {
    private LocalDateTime checkInDateTime;
    private LocalDateTime checkOutDateTime;
    private final ChoiceAccommodation choice;

    CheckedInParticipant(LocalDateTime checkInDateTime, LocalDateTime checkOutDateTime, ChoiceAccommodation triple) {

        this.checkInDateTime = checkInDateTime;
        this.checkOutDateTime = checkOutDateTime;
        this.choice = triple;
    }

    ChoiceAccommodation getChoice() {
        return choice;
    }

    int getBasicChoicePrice() {
        return choice.getPrice();
    }

    LocalDateTime getCheckOutDateTime() {
        return checkOutDateTime;
    }

    DayOfWeek getCheckInDay() {
        return checkInDateTime.getDayOfWeek();
    }

    DayOfWeek getCheckOutDay() {
        return checkOutDateTime.getDayOfWeek();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckedInParticipant that = (CheckedInParticipant) o;
        return Objects.equals(checkInDateTime, that.checkInDateTime) &&
                Objects.equals(checkOutDateTime, that.checkOutDateTime) &&
                choice == that.choice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkInDateTime, checkOutDateTime, choice);
    }

    @Override
    public String toString() {
        return "CheckedInParticipant{" +
                "checkInDateTime=" + checkInDateTime +
                ", checkOutDateTime=" + checkOutDateTime +
                ", choice=" + choice +
                '}';
    }


}
