import java.time.LocalDateTime;
import java.util.List;

public class ColdMealsServer {
    public static final LocalDateTime LIMIT_ARRIVAL_DATE = LocalDateTime.of(2019, 10, 17, 21, 0);

    public static long countColdMeals(List<Participant> participantList) {
        return participantList.stream().filter(participant -> participant.arrivedAfter(LIMIT_ARRIVAL_DATE)).count();
    }

    public static String errorMessage(List<Participant> participantList) {
        return "Be careful Attendant without date !";
    }
}