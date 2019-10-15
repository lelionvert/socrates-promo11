import java.time.LocalDateTime;
import java.util.Objects;

public class CheckedInParticipant {
    private LocalDateTime checkInDateTime;
    private LocalDateTime checkOutDateTime;
    private final ChoiceAccomodation choice;

    public CheckedInParticipant(RegistrationDate checkInDate, RegistrationDate checkOutDate, ChoiceAccomodation choice) {

        this.choice = choice;
    }

    public CheckedInParticipant(LocalDateTime checkInDateTime, LocalDateTime checkOutDateTime, ChoiceAccomodation triple) {

        this.checkInDateTime = checkInDateTime;
        this.checkOutDateTime = checkOutDateTime;
        this.choice = triple;
    }

    public ChoiceAccomodation getChoice() {
        return choice;
    }

    public int getBasicChoicePrice() {
        return choice.getPrice();
    }

    public LocalDateTime getCheckOutDateTime() {
        return checkOutDateTime;
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
