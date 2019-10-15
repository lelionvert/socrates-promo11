import java.time.LocalDateTime;
import java.util.List;

public class ColdMealsServer {
    private final LocalDateTime limitCheckInDateTime;

    public ColdMealsServer(LocalDateTime limitCheckInDateTime) {
        this.limitCheckInDateTime = limitCheckInDateTime;
    }

    public String errorMessage(List<CheckedInParticipant> checkedInParticipantList) {
        return "Be careful Attendant without date !";
    }

    public long countColdMeals(List<CheckedInParticipant> checkedInParticipants) {
        return checkedInParticipants.stream()
                .filter(checkedInParticipant -> !checkedInParticipant.checkedInAfter(limitCheckInDateTime.plusHours(5)))
                .filter(checkedInParticipant -> checkedInParticipant.checkedInAfter(limitCheckInDateTime)).count();
    }
}