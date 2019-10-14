import java.time.LocalDateTime;
import java.util.List;

public class ColdMealsServer {
    public static final LocalDateTime LIMIT_ARRIVAL_DATE = LocalDateTime.of(2019, 10, 17, 21, 0);

    public static long countColdMeals(List<CheckedInParticipant> checkedInParticipantList) {
        return checkedInParticipantList.stream().filter(checkedInParticipant -> checkedInParticipant.checkedInAfter(LIMIT_ARRIVAL_DATE)).count();
    }

    public static String errorMessage(List<CheckedInParticipant> checkedInParticipantList) {
        return "Be careful Attendant without date !";
    }
}