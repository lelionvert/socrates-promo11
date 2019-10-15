public class CheckedInParticipant {
    private ChoiceAccomodation choice;

    public CheckedInParticipant(RegistrationDate checkInDate, RegistrationDate checkOutDate, ChoiceAccomodation choice) {

        this.choice = choice;
    }

    public ChoiceAccomodation getChoice() {
        return choice;
    }
}
