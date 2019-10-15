import java.time.LocalDateTime;
import java.util.List;

public class ColdMealsServer {
    public static final LocalDateTime LIMIT_ARRIVAL_DATE = LocalDateTime.of(2019, 10, 17, 21, 0);
    private LocalDateTime limitDate;

    public ColdMealsServer(LocalDateTime limitDate) {
        this.limitDate = limitDate;
    }

    public static long countColdMeals(List<CheckedInParticipant> checkedInParticipantList) {
        return checkedInParticipantList.stream()
                .filter(checkedInParticipant -> !checkedInParticipant.checkedInAfter(LIMIT_ARRIVAL_DATE.plusHours(5)))
                .filter(checkedInParticipant -> checkedInParticipant.checkedInAfter(LIMIT_ARRIVAL_DATE)).count();
    }

    public static String errorMessage(List<CheckedInParticipant> checkedInParticipantList) {
        return "Be careful Attendant without date !";
    }

    public long countColdMealsParameterized(List<CheckedInParticipant> checkedInParticipants) {
        return checkedInParticipants.stream()
                .filter(checkedInParticipant -> !checkedInParticipant.checkedInAfter(limitDate.plusHours(5)))
                .filter(checkedInParticipant -> checkedInParticipant.checkedInAfter(limitDate)).count();
    }
}