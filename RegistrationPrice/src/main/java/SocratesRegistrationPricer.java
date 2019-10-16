import java.time.DayOfWeek;

class SocratesRegistrationPricer {
    static int chargesTotalAmount(CheckedInParticipant victoria) {
        if (!victoria.getCheckInDay().equals(DayOfWeek.THURSDAY)) {
            return 470;
        }
        return victoria.getBasicChoicePrice();
    }
}
