import java.time.DayOfWeek;

class SocratesRegistrationPricer {
    static int chargesTotalAmount(CheckedInParticipant participant) {
        return participant.getBasicChoicePrice() - getRefundAmountOfPrice(participant);
    }

    private static int getRefundAmountOfPrice(CheckedInParticipant participant) {
        int reduction = 0;
        if (!participant.getCheckInDay().equals(DayOfWeek.THURSDAY)
                || !participant.getCheckOutDay().equals(DayOfWeek.SUNDAY))
            reduction = 40;
        return reduction;
    }
}
