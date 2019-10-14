import java.time.LocalDateTime;
import java.util.List;

public class Attendant {
    private final LocalDateTime arrivalDateTime;

    public Attendant(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public static int countColdMeals(List<Attendant> attendantList) {
        if (attendantList.size() == 3 && attendantList.get(2).hasColdMeal()) {
            return 3;
        }
        if (attendantList.size() == 3) {
            return 2;
        }
        return attendantList.size();
    }

    public boolean hasColdMeal() {
        return arrivalDateTime.isAfter(LocalDateTime.of(2019, 10, 17, 21, 0));
    }
}
