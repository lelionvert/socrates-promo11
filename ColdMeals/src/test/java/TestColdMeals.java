import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class TestColdMeals {

    @Test
    public void cold_meal_attendant_returns_false_when_arrival_before_9_pm_at_5_am() {
        Attendant attendant = new Attendant(LocalDateTime.of(2019, 10, 17, 5, 0));
        Assertions.assertThat(attendant.hasColdMeal()).isFalse();
    }

    @Test
    public void cold_meal_attendant_return_true_when_arrival_after_9_pm_at_11_pm() {
        Attendant attendant = new Attendant(LocalDateTime.of(2019, 10, 17, 23, 0));
        Assertions.assertThat(attendant.hasColdMeal()).isTrue();
    }

    @Test
    public void cold_meal_attendant_returns_true_when_arrival_after_9_pm_at_11_30_pm() {
        Attendant attendant = new Attendant(LocalDateTime.of(2019, 10, 17, 23, 30));
        Assertions.assertThat(attendant.hasColdMeal()).isTrue();
    }

    @Test
    public void cold_meal_attendant_returns_true_when_arrival_after_9_pm_at_10_pm() {
        Attendant attendant = new Attendant(LocalDateTime.of(2019, 10, 17, 22, 0));
        Assertions.assertThat(attendant.hasColdMeal()).isTrue();
    }

    @Test
    public void count_cold_meal_returns_0_when_empty_list_of_attendants() {
        List<Attendant> attendantList = Collections.emptyList();
        Assertions.assertThat(Attendant.countColdMeals(attendantList)).isEqualTo(0);
    }

    @Test
    public void count_cold_meals_returns_1_when_single_attendant_arriving_at_10_pm() {
        List<Attendant> attendantSingleton = Collections.singletonList(
                new Attendant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        Assertions.assertThat(Attendant.countColdMeals(attendantSingleton)).isEqualTo(1);
    }
}
