import java.time.DayOfWeek;

class SocratesRegistrationPricer {
    static int chargesTotalAmount(CheckedInParticipant victoria) {
        if (victoria.getChoice() == ChoiceAccommodation.SINGLE) {
            return 570;
        }
        if (!victoria.getCheckInDay().equals(DayOfWeek.THURSDAY)) {
            return 470;
        }
        return victoria.getBasicChoicePrice();
    }
}
