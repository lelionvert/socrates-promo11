import java.time.DayOfWeek;

public class SocratesRegistrationPricer {
    public static int chargesTotalAmount(CheckedInParticipant victoria) {
        if (!victoria.getCheckInDay().equals(DayOfWeek.THURSDAY)) {
            return 470;
        }
        return victoria.getBasicChoicePrice();
    }
}
