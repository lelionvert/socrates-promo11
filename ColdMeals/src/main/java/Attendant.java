import java.time.LocalDateTime;
import java.util.List;

public class Attendant {
    private final LocalDateTime arrivalDateTime;

    public Attendant(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public static long countColdMeals(List<Attendant> attendantList) {
        long count = attendantList.stream().filter(attendant -> attendant.hasColdMeal()).count();
        return count;
    }

    public boolean hasColdMeal()
    {
        return arrivalDateTime.isAfter(LocalDateTime.of(2019, 10, 17, 21, 0));
    }
}
