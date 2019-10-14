import java.time.LocalDateTime;
import java.util.List;

public class Attendant {
    public static final LocalDateTime LIMIT_ARRIVAL_DATE = LocalDateTime.of(2019, 10, 17, 21, 0);
    private final LocalDateTime arrivalDateTime;

    public Attendant(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public static long countColdMeals(List<Attendant> attendantList) {
        return attendantList.stream().filter(Attendant::hasColdMeal).count();
    }

    public static String errorMessage() {
        return "Be careful Attendant without date !";
    }

    public boolean hasColdMeal() {
        return arrivalDateTime.isAfter(LIMIT_ARRIVAL_DATE);
    }
}
